package org.stacktrace.yo.igdb.client.pulse;

import org.stacktrace.yo.igdb.client.core.RequestFilter;

public class PulseFilter extends RequestFilter<PulseFields, PulseFilter> {

    @Override
    public String getField() {
        return field.getUrlFormat();
    }
}