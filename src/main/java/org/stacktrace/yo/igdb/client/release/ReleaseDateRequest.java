package org.stacktrace.yo.igdb.client.release;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.core.IGDBClientRequester;
import org.stacktrace.yo.igdb.model.ReleaseDate;

import java.util.Arrays;
import java.util.List;

public class ReleaseDateRequest extends IGDBClientRequester<ReleaseDate, ReleaseDateRequest, ReleaseDateFilter, ReleaseDateFields> {


    public ReleaseDateRequest(IGDBClient client) {
        super(client);
    }

    @Override
    public String getBasePath() {
        return "release_dates/";
    }

    public List<ReleaseDate> go() throws UnirestException {
        return Arrays.asList(client.makeRequest(buildUrl())
                .asObject(ReleaseDate[].class)
                .getBody());
    }

    @Override
    public String getFieldValue(ReleaseDateFields field) {
        return field.getUrlFormat();
    }
}