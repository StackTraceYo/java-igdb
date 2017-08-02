package org.stacktrace.yo.igdb.client.gamemode;

import org.stacktrace.yo.igdb.client.core.RequestFilter;

public class GameModeFilter extends RequestFilter<GameModeFields, GameModeFilter> {

    @Override
    public String getField() {
        return field.getUrlFormat();
    }
}