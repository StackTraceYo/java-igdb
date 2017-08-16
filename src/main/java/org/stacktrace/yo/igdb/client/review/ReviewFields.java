package org.stacktrace.yo.igdb.client.review;

public enum ReviewFields {
    ID("id"),
    USERNAME("username"),
    SLUG("slug"),
    URL("url"),
    TITLE("title"),
    CREATED_AT("created_at"),
    UPDATED_AT("updated_at"),
    GAME("game"),
    CATEGORY("category"),
    LIKES("likes"),
    VIEWS("views"),
    RATING_CATEGORY("rating_category"),
    PLATFORM("platform"),
    video("video"),
    INTRODUCTION("user"),
    CONTENT("company"),
    CONCLUSION("description"),
    POSITIVE_POINTS("page_follows_count"),
    NEGATIVE_POINTS("logo"),
    ALL("*");

    private String urlFormat;

    ReviewFields(String urlFormat) {
        this.urlFormat = urlFormat;
    }

    public String getUrlFormat() {
        return urlFormat;
    }
}
