package org.stacktrace.yo.igdb.model.internal;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class GameReleaseDate {

    private Integer category;
    private Integer platform;
    private String human;
    private Long date;
    private Integer region;
    private Integer y;
    private Integer m;

    public GameReleaseDate() {
    }

    public Integer getCategory() {
        return category;
    }

    public GameReleaseDate setCategory(Integer category) {
        this.category = category;
        return this;
    }

    public Integer getPlatform() {
        return platform;
    }

    public GameReleaseDate setPlatform(Integer platform) {
        this.platform = platform;
        return this;
    }

    public String getHuman() {
        return human;
    }

    public GameReleaseDate setHuman(String human) {
        this.human = human;
        return this;
    }

    public Long getDate() {
        return date;
    }

    public GameReleaseDate setDate(Long date) {
        this.date = date;
        return this;
    }

    public Integer getRegion() {
        return region;
    }

    public GameReleaseDate setRegion(Integer region) {
        this.region = region;
        return this;
    }

    public Integer getY() {
        return y;
    }

    public GameReleaseDate setY(Integer y) {
        this.y = y;
        return this;
    }

    public Integer getM() {
        return m;
    }

    public GameReleaseDate setM(Integer m) {
        this.m = m;
        return this;
    }
}
