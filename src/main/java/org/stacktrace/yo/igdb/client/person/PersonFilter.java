package org.stacktrace.yo.igdb.client.person;

import org.stacktrace.yo.igdb.client.core.RequestFilter;

public class PersonFilter extends RequestFilter<PersonFields, PersonFilter> {

    @Override
    public String getField() {
        return field.getUrlFormat();
    }
}