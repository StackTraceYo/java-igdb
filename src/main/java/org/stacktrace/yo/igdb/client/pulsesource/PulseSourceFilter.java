package org.stacktrace.yo.igdb.client.pulsesource;

import org.stacktrace.yo.igdb.client.core.RequestFilter;

public class PulseSourceFilter extends RequestFilter<PulseSourceFields, PulseSourceFilter> {

    @Override
    public String getField() {
        return field.getUrlFormat();
    }
}