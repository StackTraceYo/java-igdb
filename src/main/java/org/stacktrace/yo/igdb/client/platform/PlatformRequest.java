package org.stacktrace.yo.igdb.client.platform;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.core.IGDBClientRequester;
import org.stacktrace.yo.igdb.model.Platform;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class PlatformRequest extends IGDBClientRequester<Platform, PlatformRequest, PlatformFilter, PlatformFields> {


    public PlatformRequest(IGDBClient client) {
        super(client);
    }

    @Override
    public String getBasePath() {
        return "platforms/";
    }

    public List<Platform> go() throws UnirestException {
        return Arrays.asList(client.makeRequest(buildUrl())
                .asObject(Platform[].class)
                .getBody());
    }

    @Override
    public String getFieldValue(PlatformFields field) {
        return field.getUrlFormat();
    }
}
