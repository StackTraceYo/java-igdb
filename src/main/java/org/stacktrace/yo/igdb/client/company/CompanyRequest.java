package org.stacktrace.yo.igdb.client.company;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.core.IGDBClientRequester;
import org.stacktrace.yo.igdb.model.Company;

import java.util.Arrays;
import java.util.List;

public class CompanyRequest extends IGDBClientRequester<Company, CompanyRequest, CompanyFilter, CompanyFields> {

    public CompanyRequest(IGDBClient client) {
        super(client);
    }

    @Override
    public String getBasePath() {
        return "companies/";
    }

    @Override
    public List<Company> go() throws UnirestException {
        return Arrays.asList(client.makeRequest(buildUrl())
                .asObject(Company[].class)
                .getBody());
    }

    @Override
    public String getFieldValue(CompanyFields field) {
        return field.getUrlFormat();
    }
}
