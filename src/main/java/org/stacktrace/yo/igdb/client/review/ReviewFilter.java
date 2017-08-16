package org.stacktrace.yo.igdb.client.review;

import org.stacktrace.yo.igdb.client.core.RequestFilter;

public class ReviewFilter extends RequestFilter<ReviewFields, ReviewFilter> {

    @Override
    public String getField() {
        return field.getUrlFormat();
    }
}