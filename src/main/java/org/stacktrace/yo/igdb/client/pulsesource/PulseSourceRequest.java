package org.stacktrace.yo.igdb.client.pulsesource;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.core.IGDBClientRequester;
import org.stacktrace.yo.igdb.model.PulseGroup;

import java.util.Arrays;
import java.util.List;

public class PulseSourceRequest extends IGDBClientRequester<PulseGroup, PulseSourceRequest, PulseSourceFilter, PulseSourceFields> {


    public PulseSourceRequest(IGDBClient client) {
        super(client);
    }

    @Override
    public String getBasePath() {
        return "pulse_sources/";
    }

    public List<PulseGroup> go() throws UnirestException {
        return Arrays.asList(client.makeRequest(buildUrl())
                .asObject(PulseGroup[].class)
                .getBody());
    }

    @Override
    public String getFieldValue(PulseSourceFields field) {
        return field.getUrlFormat();
    }
}
