package org.stacktrace.yo.igdb.client.game;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.core.IGDBClientRequester;
import org.stacktrace.yo.igdb.client.core.count.Count;
import org.stacktrace.yo.igdb.client.core.count.Countable;
import org.stacktrace.yo.igdb.model.Game;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class GameRequest extends IGDBClientRequester<Game, GameRequest, GameFilter, GameFields> implements Countable {


    public GameRequest(IGDBClient client) {
        super(client);
    }

    @Override
    public String getBasePath() {
        return "games/";
    }

    public List<Game> go() throws UnirestException {
        try {
            return Arrays.asList(client.makeRequest(buildUrl())
                    .asObject(Game[].class)
                    .getBody());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print((client.makeRequest(buildUrl()).asString().getBody()));
            return null;
        }
    }

    @Override
    public String getFieldValue(GameFields field) {
        return field.getUrlFormat();
    }

    @Override
    public Count count() throws UnirestException {
        return client.makeRequest(getBasePath() + COUNT).asObject(Count.class).getBody();
    }
}
