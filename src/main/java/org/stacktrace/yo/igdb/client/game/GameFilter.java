package org.stacktrace.yo.igdb.client.game;

import org.stacktrace.yo.igdb.client.core.RequestFilter;

public class GameFilter extends RequestFilter<GameFields, GameFilter> {

    @Override
    public String getField() {
        return field.getUrlFormat();
    }
}