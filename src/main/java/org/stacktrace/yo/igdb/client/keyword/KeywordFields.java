package org.stacktrace.yo.igdb.client.keyword;

public enum KeywordFields {

    ID("id"),
    NAME("name"),
    SLUG("slug"),
    URL("url"),
    CREATED_AT("created_at"),
    UPDATED_AT("updated_at"),
    GAMES("games"),
    ALL("*");

    private String urlFormat;

    KeywordFields(String urlFormat) {
        this.urlFormat = urlFormat;
    }

    public String getUrlFormat() {
        return urlFormat;
    }
}
