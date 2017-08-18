package org.stacktrace.yo.igdb.client.genre;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.core.IGDBClientRequester;
import org.stacktrace.yo.igdb.client.core.count.Count;
import org.stacktrace.yo.igdb.client.core.count.Countable;
import org.stacktrace.yo.igdb.model.Genre;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class GenreRequest extends IGDBClientRequester<Genre, GenreRequest, GenreFilter, GenreFields> implements Countable {


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

    @Override
    public Count count() throws UnirestException {
        return client.makeRequest(getBasePath() + COUNT).asObject(Count.class).getBody();
    }
}
