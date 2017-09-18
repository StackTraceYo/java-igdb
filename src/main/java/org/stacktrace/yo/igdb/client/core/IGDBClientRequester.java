package org.stacktrace.yo.igdb.client.core;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.stacktrace.yo.igdb.client.IGDBClient;

import java.util.Collections;
import java.util.List;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
abstract public class IGDBClientRequester<T, U, K extends Filter, J> implements IGDBApiRequest<T> {

    protected final IGDBClient client;
    private final IGDBRequesURL requestURL;

    public IGDBClientRequester(IGDBClient client) {
        this.client = client;
        this.requestURL = new IGDBRequesURL();
    }

    public abstract String getBasePath();

    public abstract List<T> go() throws UnirestException;

    @Override
    public String create() throws Exception {
        return client.getAPIUrl() + "/" + buildUrl();
    }

    public String buildUrl() {
        return getBasePath() + requestURL.build();
    }

    public U addFilter(K filter) {
        requestURL.addFilter(filter);
        return (U) this;
    }

    public U withSearch(String search) {
        requestURL.setSearchTerm(search);
        return (U) this;
    }

    @SafeVarargs
    public final U withFields(J... fields) {
        for (J field : fields) {
            requestURL.addField(getFieldValue(field));
        }
        return (U) this;
    }

    public U withIds(String... ids) {
        Collections.addAll(requestURL.getIds(), ids);
        return (U) this;
    }

    public U getCountOf(K filter) {
        requestURL.setCountFilter(filter);
        return (U) this;
    }

    public abstract String getFieldValue(J field);
}
