package org.stacktrace.yo.igdb.client.game;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.core.IGDBClientRequester;
import org.stacktrace.yo.igdb.model.Game;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class GameRequest extends IGDBClientRequester<Game, GameRequest, GameFilter, GameFields> {


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

    @Override
    public String getFieldValue(GameFields field) {
        return field.getUrlFormat();
    }
}
