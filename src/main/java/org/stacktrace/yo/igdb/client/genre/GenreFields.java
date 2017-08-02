package org.stacktrace.yo.igdb.client.genre;

public enum GenreFields {

    ID("id"),
    NAME("name"),
    SLUG("slug"),
    URL("url"),
    CREATED_AT("created_at"),
    UPDATED_AT("updated_at"),
    GAMES("games"),
    ALL("*");

    private String urlFormat;

    GenreFields(String urlFormat) {
        this.urlFormat = urlFormat;
    }

    public String getUrlFormat() {
        return urlFormat;
    }
}
