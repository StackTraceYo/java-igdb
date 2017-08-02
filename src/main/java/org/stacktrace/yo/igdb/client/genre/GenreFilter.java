package org.stacktrace.yo.igdb.client.genre;

import org.stacktrace.yo.igdb.client.core.RequestFilter;

public class GenreFilter extends RequestFilter<GenreFields, GenreFilter> {

    @Override
    public String getField() {
        return field.getUrlFormat();
    }
}