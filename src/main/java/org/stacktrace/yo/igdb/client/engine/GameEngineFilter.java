package org.stacktrace.yo.igdb.client.engine;

import org.stacktrace.yo.igdb.client.core.RequestFilter;

public class GameEngineFilter extends RequestFilter<GameEngineFields, GameEngineFilter> {

    @Override
    public String getField() {
        return field.getUrlFormat();
    }
}