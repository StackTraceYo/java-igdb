package org.stacktrace.yo.igdb.client.game;

public enum GameFields {
    ID("id"),
    NAME("name"),
    SLUG("slug"),
    URL("url"),
    CREATED_AT("created_at"),
    UPDATED_AT("updated_at"),
    SUMMARY("summary"),
    STORYLINE("storyline"),
    COLLECTION("collection"),
    FRANCHISE("franchise"),
    HYPES("hypes"),
    POPULARITY("popularity"),
    RATING("rating"),
    RATING_COUNT("rating_count"),
    AGGREGATED_RATING("aggregated_rating"),
    AGGREGATED_RATING_COUNT("aggregated_rating_count"),
    TOTAL_RATING("total_rating"),
    TOTAL_RATING_COUNT("total_rating_count"),
    GAME("game"),
    DEVELOPERS("developers"),
    PUBLISHERS("publishers"),
    GAME_ENGINES("game_engines"),
    CATEGORY("category"),
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

    GameFields(String urlFormat) {
        this.urlFormat = urlFormat;
    }

    public String getUrlFormat() {
        return urlFormat;
    }
}
