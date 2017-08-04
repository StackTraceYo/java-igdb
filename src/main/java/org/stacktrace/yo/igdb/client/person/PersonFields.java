package org.stacktrace.yo.igdb.client.person;

public enum PersonFields {

    ID("id"),
    NAME("name"),
    SLUG("slug"),
    URL("url"),
    CREATED_AT("created_at"),
    UPDATED_AT("updated_at"),
    MUG_SHOT("mug_shot"),
    GAMES("games"),
    CHARACTERS("characters"),
    VOICE_ACTED("voice_acted"),
    ALL("*");

    private String urlFormat;

    PersonFields(String urlFormat) {
        this.urlFormat = urlFormat;
    }

    public String getUrlFormat() {
        return urlFormat;
    }
}
