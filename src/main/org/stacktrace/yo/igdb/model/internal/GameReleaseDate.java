package org.stacktrace.yo.igdb.model.internal;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class GameReleaseDate {

    private Integer game;
    private Integer category;
    private Integer platform;
    private String human;
    private Integer updatedAt;
    private Integer createdAt;
    private Integer date;
    private Integer region;
    private Integer y;
    private Integer m;

    public GameReleaseDate() {
    }

    public Integer getGame() {
        return game;
    }

    public GameReleaseDate setGame(Integer game) {
        this.game = game;
        return this;
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

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public GameReleaseDate setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public GameReleaseDate setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public GameReleaseDate setDate(Integer date) {
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
