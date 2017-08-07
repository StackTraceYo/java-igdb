package org.stacktrace.yo.igdb.client.pulsegroup;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.core.IGDBClientRequester;
import org.stacktrace.yo.igdb.client.pulse.PulseGroupFields;
import org.stacktrace.yo.igdb.model.PulseGroup;

import java.util.Arrays;
import java.util.List;

public class PulseGroupRequest extends IGDBClientRequester<PulseGroup, PulseGroupRequest, PulseGroupFilter, PulseGroupFields> {


    public PulseGroupRequest(IGDBClient client) {
        super(client);
    }

    @Override
    public String getBasePath() {
        return "pulse_groups/";
    }

    public List<PulseGroup> go() throws UnirestException {
        return Arrays.asList(client.makeRequest(buildUrl())
                .asObject(PulseGroup[].class)
                .getBody());
    }

    @Override
    public String getFieldValue(PulseGroupFields field) {
        return field.getUrlFormat();
    }
}
