package org.stacktrace.yo.igdb.client.franchise;


import org.stacktrace.yo.igdb.client.core.RequestFilter;

public class FranchiseFilter extends RequestFilter<FranchiseFields, FranchiseFilter> {

    @Override
    public String getField() {
        return field.getUrlFormat();
    }
}
