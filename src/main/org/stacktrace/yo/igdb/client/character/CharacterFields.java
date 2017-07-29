package org.stacktrace.yo.igdb.client.character;

public enum CharacterFields {

    ID("id"),
    NAME("name"),
    SLUG("slug"),
    URL("url"),
    CREATED_AT("created_at"),
    UPDATED_AT("updated_at"),
    MUG_SHOT("mug_shot"),
    GENDER("gender"),
    ALIASES("aliases"),
    SPECIES("species"),
    GAMES("games"),
    PEOPLE("people"),
    ALL("*");

    private String urlFormat;

    CharacterFields(String fieldName) {
        this.urlFormat = fieldName;
    }

    public String getUrlFormat() {
        return urlFormat;
    }

    public void setUrlFormat(String urlFormat) {
        this.urlFormat = urlFormat;
    }
}
