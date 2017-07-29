package org.stacktrace.yo.igdb.client.collection;

import org.stacktrace.yo.igdb.client.core.RequestFilter;

public class CollectionFilter extends RequestFilter<CollectionFields, CollectionFilter> {

    @Override
    public String getField() {
        return field.getUrlFormat();
    }
}
