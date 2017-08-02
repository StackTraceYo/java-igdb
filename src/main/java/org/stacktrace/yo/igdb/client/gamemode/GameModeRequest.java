package org.stacktrace.yo.igdb.client.gamemode;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.core.IGDBClientRequester;
import org.stacktrace.yo.igdb.model.GameMode;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class GameModeRequest extends IGDBClientRequester<GameMode, GameModeRequest, GameModeFilter, GameModeFields> {


    public GameModeRequest(IGDBClient client) {
        super(client);
    }

    @Override
    public String getBasePath() {
        return "game_modes/";
    }

    public List<GameMode> go() throws UnirestException {
        return Arrays.asList(client.makeRequest(buildUrl())
                .asObject(GameMode[].class)
                .getBody());
    }

    @Override
    public String getFieldValue(GameModeFields field) {
        return field.getUrlFormat();
    }
}
