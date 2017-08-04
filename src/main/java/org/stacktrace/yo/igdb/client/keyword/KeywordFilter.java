package org.stacktrace.yo.igdb.client.keyword;

import org.stacktrace.yo.igdb.client.core.RequestFilter;
import org.stacktrace.yo.igdb.client.genre.GenreFields;

public class KeywordFilter extends RequestFilter<KeywordFields, KeywordFilter> {

    @Override
    public String getField() {
        return field.getUrlFormat();
    }
}