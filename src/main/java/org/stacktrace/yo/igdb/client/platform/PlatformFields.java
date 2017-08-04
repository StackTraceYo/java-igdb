package org.stacktrace.yo.igdb.client.platform;

public enum PlatformFields {

    ID("id"),
    NAME("name"),
    SLUG("slug"),
    URL("url"),
    CREATED_AT("created_at"),
    UPDATED_AT("updated_at"),
    LOGO("logo"),
    WEBSITE("website"),
    SUMMARY("summary"),
    ALTERNATIVE_NAME("alternative_name"),
    GENERATION("generation"),
    GAMES("games"),
    VERSION("version"),
    ALL("*");

    private String urlFormat;

    PlatformFields(String urlFormat) {
        this.urlFormat = urlFormat;
    }

    public String getUrlFormat() {
        return urlFormat;
    }
}
