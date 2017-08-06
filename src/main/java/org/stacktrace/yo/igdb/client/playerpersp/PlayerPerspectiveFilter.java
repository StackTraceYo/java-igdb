package org.stacktrace.yo.igdb.client.playerpersp;

import org.stacktrace.yo.igdb.client.core.RequestFilter;

public class PlayerPerspectiveFilter extends RequestFilter<PlayerPerspectiveFields, PlayerPerspectiveFilter> {

    @Override
    public String getField() {
        return field.getUrlFormat();
    }
}