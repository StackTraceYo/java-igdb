package org.stacktrace.yo.igdb.client.feed;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.core.IGDBClientRequester;
import org.stacktrace.yo.igdb.model.Feed;

import java.util.Arrays;
import java.util.List;

public class FeedRequest extends IGDBClientRequester<Feed, FeedRequest, FeedFilter, FeedFields> {

    public FeedRequest(IGDBClient client) {
        super(client);
    }

    @Override
    public String getBasePath() {
        return "feeds/";
    }

    @Override
    public List<Feed> go() throws UnirestException {
        return Arrays.asList(client.makeRequest(buildUrl())
                .asObject(Feed[].class)
                .getBody());
    }

    @Override
    public String getFieldValue(FeedFields field) {
        return field.getUrlFormat();
    }
}
