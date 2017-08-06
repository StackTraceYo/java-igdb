package org.stacktrace.yo.igdb.client.playerpersp;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.core.IGDBClientRequester;
import org.stacktrace.yo.igdb.model.PlayerPerspective;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class PlayerPerspectiveRequest extends IGDBClientRequester<PlayerPerspective, PlayerPerspectiveRequest, PlayerPerspectiveFilter, PlayerPerspectiveFields> {


    public PlayerPerspectiveRequest(IGDBClient client) {
        super(client);
    }

    @Override
    public String getBasePath() {
        return "player_perspectives/";
    }

    public List<PlayerPerspective> go() throws UnirestException {
        return Arrays.asList(client.makeRequest(buildUrl())
                .asObject(PlayerPerspective[].class)
                .getBody());
    }

    @Override
    public String getFieldValue(PlayerPerspectiveFields field) {
        return field.getUrlFormat();
    }
}
