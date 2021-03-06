package org.stacktrace.yo.igdb.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.request.GetRequest;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.stacktrace.yo.igdb.client.character.CharacterRequest;
import org.stacktrace.yo.igdb.client.collection.CollectionRequest;
import org.stacktrace.yo.igdb.client.company.CompanyRequest;
import org.stacktrace.yo.igdb.client.core.IGDBApiRequester;
import org.stacktrace.yo.igdb.client.engine.GameEngineRequest;
import org.stacktrace.yo.igdb.client.feed.FeedRequest;
import org.stacktrace.yo.igdb.client.franchise.FranchiseRequest;
import org.stacktrace.yo.igdb.client.game.GameRequest;
import org.stacktrace.yo.igdb.client.gamemode.GameModeRequest;
import org.stacktrace.yo.igdb.client.genre.GenreRequest;
import org.stacktrace.yo.igdb.client.keyword.KeywordRequest;
import org.stacktrace.yo.igdb.client.page.PageRequest;
import org.stacktrace.yo.igdb.client.person.PersonRequest;
import org.stacktrace.yo.igdb.client.platform.PlatformRequest;
import org.stacktrace.yo.igdb.client.playerpersp.PlayerPerspectiveRequest;
import org.stacktrace.yo.igdb.client.pulse.PulseRequest;
import org.stacktrace.yo.igdb.client.pulsegroup.PulseGroupRequest;
import org.stacktrace.yo.igdb.client.pulsesource.PulseSourceRequest;
import org.stacktrace.yo.igdb.client.release.ReleaseDateRequest;
import org.stacktrace.yo.igdb.client.review.ReviewRequest;
import org.stacktrace.yo.igdb.client.theme.ThemeRequest;

import java.io.IOException;

/**
 * Created by Stacktraceyo on 7/28/17.
 */

public class IGDBClient implements IGDBApiRequester {

    private final String url;
    private final String apiKey;

    private IGDBClient(String apiKey, String url, Boolean cacheEnabled) {
        this.url = url;
        this.apiKey = apiKey;
        Unirest.setDefaultHeader("user-key", apiKey);
        Unirest.setDefaultHeader("Accept", "application/json");
    }

    public final String getAPIUrl() {
        return url;
    }

    public final String getApiKey() {
        return apiKey;
    }


    @Override
    public GameRequest games() {
        return new GameRequest(this);
    }

    @Override
    public CharacterRequest characters() {
        return new CharacterRequest(this);
    }

    @Override
    public CollectionRequest collections() {
        return new CollectionRequest(this);
    }

    @Override
    public FeedRequest feeds() {
        return new FeedRequest(this);
    }

    @Override
    public CompanyRequest companies() {
        return new CompanyRequest(this);
    }

    @Override
    public PageRequest pages() {
        return new PageRequest(this);
    }

    @Override
    public GameEngineRequest gameEngines() {
        return new GameEngineRequest(this);
    }

    @Override
    public GameModeRequest gameModes() {
        return new GameModeRequest(this);
    }

    @Override
    public FranchiseRequest franchises() {
        return new FranchiseRequest(this);
    }

    @Override
    public GenreRequest genres() {
        return new GenreRequest(this);
    }

    @Override
    public PersonRequest people() {
        return new PersonRequest(this);
    }

    @Override
    public PlatformRequest platforms() {
        return new PlatformRequest(this);
    }

    @Override
    public KeywordRequest keywords() {
        return new KeywordRequest(this);
    }

    @Override
    public PlayerPerspectiveRequest playerPerspectives() {
        return new PlayerPerspectiveRequest(this);
    }

    @Override
    public PulseRequest pulses() {
        return new PulseRequest(this);
    }

    @Override
    public PulseGroupRequest pulseGroups() {
        return new PulseGroupRequest(this);
    }

    @Override
    public PulseSourceRequest pulseSources() {
        return new PulseSourceRequest(this);
    }

    @Override
    public ReleaseDateRequest releaseDates() {
        return new ReleaseDateRequest(this);
    }

    @Override
    public ReviewRequest reviews() {
        return new ReviewRequest(this);
    }

    @Override
    public ThemeRequest themes() {
        return new ThemeRequest(this);
    }

    public GetRequest makeRequest(String url) {
        return Unirest.get(this.url + "/" + url);
    }

    private IGDBClient setMapper(ObjectMapper mapper) {
        if (mapper == null) {
            mapper = new ObjectMapper() {

                private com.fasterxml.jackson.databind.ObjectMapper jacksonObjectMapper
                        = new com.fasterxml.jackson.databind.ObjectMapper();

                public <T> T readValue(String value, Class<T> valueType) {
                    try {
                        return jacksonObjectMapper.readValue(value, valueType);
                    } catch (IOException e) {
                        System.out.print(value);
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
        private Boolean cache = false;

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

//        public Builder withCache(Boolean shouldEnableCaching) {
//            this.cache = shouldEnableCaching;
//            return this;
//        }

        public IGDBClient build() {
            return new IGDBClient(API_KEY, url, cache)
                    .setMapper(mapper)
                    .setAsyncClient(asyncClient)
                    .setHttpClient(client);

        }
    }


}
