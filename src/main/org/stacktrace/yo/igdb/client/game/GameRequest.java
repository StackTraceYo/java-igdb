package org.stacktrace.yo.igdb.client.game;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.IGDBClientRequester;
import org.stacktrace.yo.igdb.model.Game;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class GameRequest extends IGDBClientRequester<Game> {


    public GameRequest(IGDBClient client) {
        super(client);
    }

    @Override
    public String getBasePath() {
        return "games/";
    }

    public List<Game> go() throws UnirestException {
        return Arrays.asList(client.makeRequest(buildUrl())
                .asObject(Game[].class)
                .getBody());
    }

    public GameRequest withFields(GameFields... fields) {
        for (GameFields field : fields) {
            fieldStrings.add(field.getUrlFormat());
        }
        return this;
    }

    public GameRequest withSearch(String search) {
        this.searchString = search;
        return this;
    }

    public GameRequest addFilter(GameFilter.FilterBuilder builder) {
        this.filters.add(builder.build());
        return this;
    }


}
