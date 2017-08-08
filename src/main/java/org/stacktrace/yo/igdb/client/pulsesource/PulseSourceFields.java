package org.stacktrace.yo.igdb.client.pulsesource;

public enum PulseSourceFields {


    ID("id"),
    NAME("name"),
    PAGE("page"),
    GAME("game"),
    ALL("*");

    private String urlFormat;

    PulseSourceFields(String urlFormat) {
        this.urlFormat = urlFormat;
    }

    public String getUrlFormat() {
        return urlFormat;
    }
}