package org.stacktrace.yo.igdb.client.common;

public enum PostFix {
    EQUALS("eq"),
    NOT_EQUALS("not_eq"),
    GREATER_THAN("gt"),
    GREATER_THAN_OR_EQUALS("gte"),
    LESS_THAN("lt"),
    LESS_THAN_OR_EQUALS("lte"),
    PREFIX("prefix"),
    EXISTS("exists"),
    NOT_EXISTS("not_exists"),
    IN("in"),
    NOT_IN("not_in"),
    ANY("any");

    private String value;

    PostFix(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
