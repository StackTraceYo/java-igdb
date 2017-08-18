package org.stacktrace.yo.igdb.client.core.count;

import com.mashape.unirest.http.exceptions.UnirestException;

/**
 * Created by Stacktraceyo on 8/18/17.
 */
public interface Countable {

    String COUNT = "count";

    Count count() throws UnirestException;

}
