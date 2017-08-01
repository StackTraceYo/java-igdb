package org.stacktrace.yo.igdb.client.feed;


import org.stacktrace.yo.igdb.client.core.RequestFilter;

public class FeedFilter extends RequestFilter<FeedFields, FeedFilter> {

    @Override
    public String getField() {
        return field.getUrlFormat();
    }
}
