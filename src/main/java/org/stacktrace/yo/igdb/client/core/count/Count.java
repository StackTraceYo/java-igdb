package org.stacktrace.yo.igdb.client.core.count;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Stacktraceyo on 8/18/17.
 */
public class Count {

    @JsonProperty("count")
    private Long count;

    public Count() {

    }

    public Long getCount() {
        return count;
    }

    public Count setCount(Long count) {
        this.count = count;
        return this;
    }
}
