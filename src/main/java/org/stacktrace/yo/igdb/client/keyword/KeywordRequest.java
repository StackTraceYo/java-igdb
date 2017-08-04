package org.stacktrace.yo.igdb.client.keyword;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.core.IGDBClientRequester;
import org.stacktrace.yo.igdb.model.Keyword;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class KeywordRequest extends IGDBClientRequester<Keyword, KeywordRequest, KeywordFilter, KeywordFields> {


    public KeywordRequest(IGDBClient client) {
        super(client);
    }

    @Override
    public String getBasePath() {
        return "keywords/";
    }

    public List<Keyword> go() throws UnirestException {
        return Arrays.asList(client.makeRequest(buildUrl())
                .asObject(Keyword[].class)
                .getBody());
    }

    @Override
    public String getFieldValue(KeywordFields field) {
        return field.getUrlFormat();
    }
}
