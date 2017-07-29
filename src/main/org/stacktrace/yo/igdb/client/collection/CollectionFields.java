package org.stacktrace.yo.igdb.client.collection;

public enum CollectionFields {

    ID("id"),
    NAME("name"),
    SLUG("slug"),
    URL("url"),
    CREATED_AT("created_at"),
    UPDATED_AT("updated_at"),
    GAMES("games"),
    ALL("*");

    private String urlFormat;

    CollectionFields(String fieldName) {
        this.urlFormat = fieldName;
    }

    public String getUrlFormat() {
        return urlFormat;
    }

    public void setUrlFormat(String urlFormat) {
        this.urlFormat = urlFormat;
    }
}
