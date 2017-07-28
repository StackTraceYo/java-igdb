package org.stacktrace.yo.igdb.response;

import org.stacktrace.yo.igdb.model.Game;

import java.util.List;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class GameResponse {

    List<Game> games;

    public List<Game> getGames() {
        return games;
    }

    public GameResponse setGames(List<Game> games) {
        this.games = games;
        return this;
    }
}
