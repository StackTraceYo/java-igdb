package org.stacktrace.yo.igdb.client.engine;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.core.IGDBClientRequester;
import org.stacktrace.yo.igdb.model.GameEngine;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class GameEngineRequest extends IGDBClientRequester<GameEngine, GameEngineRequest, GameEngineFilter, GameEngineFields> {


    public GameEngineRequest(IGDBClient client) {
        super(client);
    }

    @Override
    public String getBasePath() {
        return "game_engines/";
    }

    public List<GameEngine> go() throws UnirestException {
        return Arrays.asList(client.makeRequest(buildUrl())
                .asObject(GameEngine[].class)
                .getBody());
    }

    @Override
    public String getFieldValue(GameEngineFields field) {
        return field.getUrlFormat();
    }
}
