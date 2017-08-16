package org.stacktrace.yo.igdb.client.theme;

import org.stacktrace.yo.igdb.client.core.RequestFilter;

public class ThemeFilter extends RequestFilter<ThemeFields, ThemeFilter> {

    @Override
    public String getField() {
        return field.getUrlFormat();
    }
}