package org.stacktrace.yo.igdb.client;

import com.mashape.unirest.http.exceptions.UnirestException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
abstract public class IGDBClientRequester<T> {

    protected final IGDBClient client;
    protected List<String> fieldStrings = new ArrayList<>();
    protected List<Filter> filters = new ArrayList<>();
    protected String searchString = "";

    public IGDBClientRequester(IGDBClient client) {
        this.client = client;
    }

    public abstract String getBasePath();

    public abstract List<T> go() throws UnirestException;


    public String buildUrl() {
        return getBasePath() + RequestUtils.createParams(searchString, fieldStrings, filters);
    }
}
