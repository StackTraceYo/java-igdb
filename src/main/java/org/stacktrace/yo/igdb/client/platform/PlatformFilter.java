package org.stacktrace.yo.igdb.client.platform;

import org.stacktrace.yo.igdb.client.core.RequestFilter;

public class PlatformFilter extends RequestFilter<PlatformFields, PlatformFilter> {

    @Override
    public String getField() {
        return field.getUrlFormat();
    }
}