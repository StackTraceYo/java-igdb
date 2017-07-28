package org.stacktrace.yo.igdb.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.request.GetRequest;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;

import java.io.IOException;

/**
 * Created by Stacktraceyo on 7/28/17.
 */

public class IGDBClient {

    private final String url;

    private IGDBClient(String apiKey, String url) {
        this.url = url;
        Unirest.setDefaultHeader("user-key", apiKey);
        Unirest.setDefaultHeader("Accept", "application/json");
    }

    public GameRequest games() {
        return new GameRequest(this);
    }


    GetRequest makeRequest(String url) {
        return Unirest.get(this.url + "/" + url);
    }

    private IGDBClient setMapper(ObjectMapper mapper) {
        if (mapper == null) {
            mapper = new ObjectMapper() {

                private com.fasterxml.jackson.databind.ObjectMapper jacksonObjectMapper
                        = new com.fasterxml.jackson.databind.ObjectMapper()
                        .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);


                public <T> T readValue(String value, Class<T> valueType) {
                    try {
                        return jacksonObjectMapper.readValue(value, valueType);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

                public String writeValue(Object value) {
                    try {
                        return jacksonObjectMapper.writeValueAsString(value);
                    } catch (JsonProcessingException e) {
                        throw new RuntimeException(e);
                    }
                }
            };
        }
        Unirest.setObjectMapper(mapper);
        return this;
    }

    private IGDBClient setHttpClient(HttpClient client) {
        if (client != null) {
            Unirest.setHttpClient(client);
        }
        return this;
    }

    private IGDBClient setAsyncClient(CloseableHttpAsyncClient client) {
        if (client != null) {
            Unirest.setAsyncHttpClient(client);
        }
        return this;
    }

    public static Builder getBuilder() {
        return new Builder();
    }


    public static class Builder {

        private String API_KEY;
        private String url;
        private ObjectMapper mapper;
        private HttpClient client;
        private CloseableHttpAsyncClient asyncClient;

        Builder() {
        }

        public Builder withKey(String key) {
            API_KEY = key;
            return this;
        }

        public Builder withUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder withObjectMapper(ObjectMapper mapper) {
            this.mapper = mapper;
            return this;
        }

        public Builder withHttpClient(HttpClient client) {
            this.client = client;
            return this;
        }

        public Builder withAsyncHttpClient(CloseableHttpAsyncClient client) {
            this.asyncClient = client;
            return this;
        }


        public IGDBClient build() {
            return new IGDBClient(API_KEY, url)
                    .setMapper(mapper)
                    .setAsyncClient(asyncClient)
                    .setHttpClient(client);

        }
    }


}
