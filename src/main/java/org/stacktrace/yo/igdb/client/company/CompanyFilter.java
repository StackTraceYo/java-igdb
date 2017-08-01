package org.stacktrace.yo.igdb.client.company;


import org.stacktrace.yo.igdb.client.core.RequestFilter;

public class CompanyFilter extends RequestFilter<CompanyFields, CompanyFilter> {

    @Override
    public String getField() {
        return field.getUrlFormat();
    }
}
