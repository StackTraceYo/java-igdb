package org.stacktrace.yo.igdb.client.page;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.core.IGDBClientRequester;
import org.stacktrace.yo.igdb.model.Page;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class PageRequest extends IGDBClientRequester<Page, PageRequest, PageFilter, PageFields> {


    public PageRequest(IGDBClient client) {
        super(client);
    }

    @Override
    public String getBasePath() {
        return "pages/";
    }

    public List<Page> go() throws UnirestException {
        return Arrays.asList(client.makeRequest(buildUrl())
                .asObject(Page[].class)
                .getBody());
    }

    @Override
    public String getFieldValue(PageFields field) {
        return field.getUrlFormat();
    }
}
