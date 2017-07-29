package org.stacktrace.yo.igdb.model.internal;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class AlternativeName {

    private String name;
    private String comment;

    public AlternativeName() {
    }

    public String getName() {
        return name;
    }

    public AlternativeName setName(String name) {
        this.name = name;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public AlternativeName setComment(String comment) {
        this.comment = comment;
        return this;
    }
}
