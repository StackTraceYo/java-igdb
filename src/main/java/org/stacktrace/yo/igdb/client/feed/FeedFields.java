package org.stacktrace.yo.igdb.client.feed;

public enum FeedFields {

    ID("id"),
    URL("url"),
    CREATED_AT("created_at"),
    UPDATED_AT("updated_at"),
    CONTENT("content"),
    CATEGORY("category"),
    COUNTRY("country"),
    USER("user"),
    GAMES("games"),
    TITLE("title"),
    ALL("*");

    private String urlFormat;

    FeedFields(String fieldName) {
        this.urlFormat = fieldName;
    }

    public String getUrlFormat() {
        return urlFormat;
    }

    public void setUrlFormat(String urlFormat) {
        this.urlFormat = urlFormat;
    }
}
