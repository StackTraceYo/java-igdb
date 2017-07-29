package org.stacktrace.yo.igdb.model.internal;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class TimeToBeat {

    private Integer hastly;
    private Integer normally;
    private Integer completely;

    public TimeToBeat() {
    }

    public Integer getHastly() {
        return hastly;
    }

    public TimeToBeat setHastly(Integer hastly) {
        this.hastly = hastly;
        return this;
    }

    public Integer getNormally() {
        return normally;
    }

    public TimeToBeat setNormally(Integer normally) {
        this.normally = normally;
        return this;
    }

    public Integer getCompletely() {
        return completely;
    }

    public TimeToBeat setCompletely(Integer completely) {
        this.completely = completely;
        return this;
    }
}
