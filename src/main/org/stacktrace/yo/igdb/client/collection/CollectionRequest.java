package org.stacktrace.yo.igdb.client.collection;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.core.IGDBClientRequester;
import org.stacktrace.yo.igdb.model.Collection;

import java.util.Arrays;
import java.util.List;

public class CollectionRequest extends IGDBClientRequester<Collection, CollectionRequest, CollectionFilter, CollectionFields> {

    public CollectionRequest(IGDBClient client) {
        super(client);
    }

    @Override
    public String getBasePath() {
        return "collections/";
    }

    @Override
    public List<Collection> go() throws UnirestException {
        return Arrays.asList(client.makeRequest(buildUrl())
                .asObject(Collection[].class)
                .getBody());
    }

    @Override
    public String getFieldValue(CollectionFields field) {
        return field.getUrlFormat();
    }
}
