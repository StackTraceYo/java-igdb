package org.stacktrace.yo.igdb.client;

import com.mashape.unirest.http.exceptions.UnirestException;

import java.util.List;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
abstract public class IGDBClientRequester<T> {

    protected final IGDBClient client;

    public IGDBClientRequester(IGDBClient client) {
        this.client = client;
    }

    abstract String createUrl();

    abstract List<T> go() throws UnirestException;
}
