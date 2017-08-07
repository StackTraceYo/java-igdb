package org.stacktrace.yo.igdb.client.pulsegroup;

import org.stacktrace.yo.igdb.client.core.RequestFilter;
import org.stacktrace.yo.igdb.client.pulse.PulseGroupFields;

public class PulseGroupFilter extends RequestFilter<PulseGroupFields, PulseGroupFilter> {

    @Override
    public String getField() {
        return field.getUrlFormat();
    }
}