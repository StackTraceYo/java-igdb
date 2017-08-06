package org.stacktrace.yo.igdb.client.pulse;

public enum PulseFields {


    ID("id"),
    PULSE_SOURCE("pulse_source"),
    TITLE("title"),
    SUMMARY("summary"),
    URL("url"),
    UID("uid"),
    CREATED_AT("created_at"),
    UPDATED_AT("updated_at"),
    PUBLISHED_AT("published_at"),
    IMAGE("image"),
    AUTHOR("author"),
    TAGS("games"),
    ALL("*");

    private String urlFormat;

    PulseFields(String urlFormat) {
        this.urlFormat = urlFormat;
    }

    public String getUrlFormat() {
        return urlFormat;
    }
}
