package org.stacktrace.yo.igdb.client.engine;

public enum GameEngineFields {

    ID("id"),
    NAME("name"),
    SLUG("slug"),
    URL("url"),
    CREATED_AT("created_at"),
    UPDATED_AT("updated_at"),
    LOGO("logo"),
    GAMES("games"),
    COMPANOES("companies"),
    PLATFORMS("platforms"),
    ALL("*");

    private String urlFormat;

    GameEngineFields(String urlFormat) {
        this.urlFormat = urlFormat;
    }

    public String getUrlFormat() {
        return urlFormat;
    }
}
