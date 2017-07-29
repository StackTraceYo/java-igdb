package org.stacktrace.yo.igdb.client.character;

import org.stacktrace.yo.igdb.client.core.RequestFilter;
import org.stacktrace.yo.igdb.client.game.GameFilter;

public class CharacterFilter extends RequestFilter<CharacterFields, GameFilter> {

    @Override
    public String getField() {
        return field.getUrlFormat();
    }
}

