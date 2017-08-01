package org.stacktrace.yo.igdb.client.page;

public enum PageFields {
    ID("id"),
    NAME("name"),
    SLUG("slug"),
    URL("url"),
    CREATED_AT("created_at"),
    UPDATED_AT("updated_at"),
    CONTENT("content"),
    CATEGORY("category"),
    SUB_CATEGORY("sub_category"),
    STORYLINE("storyline"),
    COUNTRY("country"),
    COLOR("color"),
    USER("user"),
    GAME("game"),
    COMPANY("company"),
    DESCRIPTION("description"),
    PAGE_FOLLOWS_COUNT("page_follows_count"),
    LOGO("logo"),
    BACKGROUND("background"),
    FACEBOOK("facebook"),
    TWITTER("twitter"),
    TWITCH("twitch"),
    INSTAGRAM("instagram"),
    YOUTUBE("youtube"),
    GAME_ENGINES("game_engines"),
    TIME_TO_BEAT("time_to_beat"),
    PLAYER_PERSPECTIVES("player_perspectives"),
    GAME_MODES("game_modes"),
    KEYWORDS("keywords"),
    THEMES("themes"),
    GENRES("genres"),
    FIRST_RELEASE_DATE("first_release_date"),
    STATUS("status"),
    RELEASE_DATES("release_dates"),
    ALTERNATIVE_NAMES("alternative_names"),
    SCREEN_SHOTS("screen_shots"),
    VIDEOS("videos"),
    COVER("cover"),
    ESRB("esrb"),
    PEGI("pegi"),
    WEBSITES("websites"),
    TAGS("websites"),
    ALL("*");

    private String urlFormat;

    PageFields(String urlFormat) {
        this.urlFormat = urlFormat;
    }

    public String getUrlFormat() {
        return urlFormat;
    }
}
