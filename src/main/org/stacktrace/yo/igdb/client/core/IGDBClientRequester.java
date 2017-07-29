package org.stacktrace.yo.igdb.client.core;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.utils.RequestUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
abstract public class IGDBClientRequester<T, U, K extends Filter, J> {

    protected final IGDBClient client;
    private List<String> fieldStrings;
    private List<K> filters;
    private K countFilter;
    private String searchString = "";
    private List<String> ids;

    public IGDBClientRequester(IGDBClient client) {
        this.client = client;
    }

    public abstract String getBasePath();

    public abstract List<T> go() throws UnirestException;

    //todo fix all these nulls
    public String buildUrl() {
        if (filters == null) {
            this.filters = new ArrayList<>();
        }
        if (fieldStrings == null) {
            this.fieldStrings = new ArrayList<>();
        }
        if (ids == null) {
            this.ids = new ArrayList<>();
        }
        return getBasePath() + RequestUtils.createParams(searchString, fieldStrings, (List<Filter>) filters, ids, countFilter);
    }

    public U addFilter(K filter) {
        if (filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filter);
        return (U) this;
    }

    public U withSearch(String search) {
        this.searchString = search;
        return (U) this;
    }

    @SafeVarargs
    public final U withFields(J... fields) {
        if (fieldStrings == null) {
            fieldStrings = new ArrayList<>();
        }
        for (J field : fields) {
            this.fieldStrings.add(getFieldValue(field));
        }
        return (U) this;
    }

    public U withIds(String... ids) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        Collections.addAll(this.ids, ids);
        return (U) this;
    }

    public U getCountOf(K filter) {
        this.countFilter = filter;
        return (U) this;
    }

    public abstract String getFieldValue(J field);
}
