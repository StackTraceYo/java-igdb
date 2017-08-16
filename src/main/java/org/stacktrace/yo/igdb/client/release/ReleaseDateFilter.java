package org.stacktrace.yo.igdb.client.release;

import org.stacktrace.yo.igdb.client.core.RequestFilter;

public class ReleaseDateFilter extends RequestFilter<ReleaseDateFields, ReleaseDateFilter> {

    @Override
    public String getField() {
        return field.getUrlFormat();
    }
}