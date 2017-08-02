package org.stacktrace.yo.igdb.client.genre;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.core.IGDBClientRequester;
import org.stacktrace.yo.igdb.model.Genre;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class GenreRequest extends IGDBClientRequester<Genre, GenreRequest, GenreFilter, GenreFields> {


    public GenreRequest(IGDBClient client) {
        super(client);
    }

    @Override
    public String getBasePath() {
        return "genres/";
    }

    public List<Genre> go() throws UnirestException {
        return Arrays.asList(client.makeRequest(buildUrl())
                .asObject(Genre[].class)
                .getBody());
    }

    @Override
    public String getFieldValue(GenreFields field) {
        return field.getUrlFormat();
    }
}
