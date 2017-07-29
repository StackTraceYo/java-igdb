package org.stacktrace.yo.igdb.client.core;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.utils.RequestUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
abstract public class IGDBClientRequester<T, U, K extends Filter, J> {

    protected final IGDBClient client;
    private List<String> fieldStrings = new ArrayList<>();
    private List<K> filters = new ArrayList<>();
    private String searchString = "";

    public IGDBClientRequester(IGDBClient client) {
        this.client = client;
    }

    public abstract String getBasePath();

    public abstract List<T> go() throws UnirestException;

    public String buildUrl() {
        return getBasePath() + RequestUtils.createParams(searchString, fieldStrings, (List<Filter>) filters);
    }

    public U addFilter(K filter) {
        this.filters.add(filter);
        return (U) this;
    }

    public U withSearch(String search) {
        this.searchString = search;
        return (U) this;
    }

    public U withFields(J... fields) {
        for (J field : fields) {
            this.fieldStrings.add(getFieldValue(field));
        }
        return (U) this;
    }

    public abstract String getFieldValue(J field);
}
