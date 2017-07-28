package org.stacktrace.yo.igdb.model.internal;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class PEGI {

    private Integer rating;
    private String synopsis;

    public PEGI() {

    }

    public Integer getRating() {
        return rating;
    }

    public PEGI setRating(Integer rating) {
        this.rating = rating;
        return this;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public PEGI setSynopsis(String synopsis) {
        this.synopsis = synopsis;
        return this;
    }
}
