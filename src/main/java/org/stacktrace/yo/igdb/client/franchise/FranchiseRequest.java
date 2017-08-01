package org.stacktrace.yo.igdb.client.franchise;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.core.IGDBClientRequester;
import org.stacktrace.yo.igdb.model.Franchise;

import java.util.Arrays;
import java.util.List;

public class FranchiseRequest extends IGDBClientRequester<Franchise, FranchiseRequest, FranchiseFilter, FranchiseFields> {

    public FranchiseRequest(IGDBClient client) {
        super(client);
    }

    @Override
    public String getBasePath() {
        return "franchises/";
    }

    @Override
    public List<Franchise> go() throws UnirestException {
        return Arrays.asList(client.makeRequest(buildUrl())
                .asObject(Franchise[].class)
                .getBody());
    }

    @Override
    public String getFieldValue(FranchiseFields field) {
        return field.getUrlFormat();
    }
}
