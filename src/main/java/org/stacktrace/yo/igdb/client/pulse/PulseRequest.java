package org.stacktrace.yo.igdb.client.pulse;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.core.IGDBClientRequester;
import org.stacktrace.yo.igdb.model.Pulse;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class PulseRequest extends IGDBClientRequester<Pulse, PulseRequest, PulseFilter, PulseFields> {


    public PulseRequest(IGDBClient client) {
        super(client);
    }

    @Override
    public String getBasePath() {
        return "pulses/";
    }

    public List<Pulse> go() throws UnirestException {
        return Arrays.asList(client.makeRequest(buildUrl())
                .asObject(Pulse[].class)
                .getBody());
    }

    @Override
    public String getFieldValue(PulseFields field) {
        return field.getUrlFormat();
    }
}
