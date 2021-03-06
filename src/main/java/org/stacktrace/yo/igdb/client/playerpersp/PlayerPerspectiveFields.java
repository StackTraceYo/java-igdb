package org.stacktrace.yo.igdb.client.playerpersp;

public enum PlayerPerspectiveFields {

    ID("id"),
    NAME("name"),
    SLUG("slug"),
    URL("url"),
    CREATED_AT("created_at"),
    UPDATED_AT("updated_at"),
    GAMES("games"),
    ALL("*");

    private String urlFormat;

    PlayerPerspectiveFields(String urlFormat) {
        this.urlFormat = urlFormat;
    }

    public String getUrlFormat() {
        return urlFormat;
    }
}
