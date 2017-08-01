package org.stacktrace.yo.igdb.client.page;

import org.stacktrace.yo.igdb.client.core.RequestFilter;

public class PageFilter extends RequestFilter<PageFields, PageFilter> {

    @Override
    public String getField() {
        return field.getUrlFormat();
    }
}