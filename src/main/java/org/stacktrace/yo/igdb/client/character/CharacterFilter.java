package org.stacktrace.yo.igdb.client.character;

import org.stacktrace.yo.igdb.client.core.RequestFilter;

public class CharacterFilter extends RequestFilter<CharacterFields, CharacterFilter> {

    @Override
    public String getField() {
        return field.getUrlFormat();
    }
}

