package org.stacktrace.yo.igdb.client.release;

public enum ReleaseDateFields {


    ID("id"),
    GAME("game"),
    CATEGORY("category"),
    PLATFORM("platform"),
    HUMAN("human"),
    CREATED_AT("created_at"),
    UPDATED_AT("updated_at"),
    DATE("date"),
    REGION("region"),
    Y("y"),
    M("m"),
    ALL("*");

    private String urlFormat;

    ReleaseDateFields(String urlFormat) {
        this.urlFormat = urlFormat;
    }

    public String getUrlFormat() {
        return urlFormat;
    }
}