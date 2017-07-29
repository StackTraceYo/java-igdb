package org.stacktrace.yo.igdb.model.internal;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class ESRB {

    private Integer rating;
    private String synopsis;

    public ESRB() {
    }

    public Integer getRating() {
        return rating;
    }

    public ESRB setRating(Integer rating) {
        this.rating = rating;
        return this;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public ESRB setSynopsis(String synopsis) {
        this.synopsis = synopsis;
        return this;
    }
}
