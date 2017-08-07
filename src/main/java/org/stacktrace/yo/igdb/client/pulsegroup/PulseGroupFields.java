package org.stacktrace.yo.igdb.client.pulse;

public enum PulseGroupFields {


    ID("id"),
    NAME("name"),
    CATEGORY("category"),
    CREATED_AT("created_at"),
    UPDATED_AT("updated_at"),
    PUBLISHED_AT("published_at"),
    TAGS("tags"),
    PULSES("pulses"),
    GAME("game"),
    ALL("*");

    private String urlFormat;

    PulseGroupFields(String urlFormat) {
        this.urlFormat = urlFormat;
    }

    public String getUrlFormat() {
        return urlFormat;
    }
}