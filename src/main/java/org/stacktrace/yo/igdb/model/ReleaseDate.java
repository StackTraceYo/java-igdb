package org.stacktrace.yo.igdb.model;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class ReleaseDate implements IGDBModel {

    private Integer id;
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

    public ReleaseDate() {

    }

    public Integer getId() {
        return id;
    }

    public ReleaseDate setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getGame() {
        return game;
    }

    public ReleaseDate setGame(Integer game) {
        this.game = game;
        return this;
    }

    public Integer getCategory() {
        return category;
    }

    public ReleaseDate setCategory(Integer category) {
        this.category = category;
        return this;
    }

    public Integer getPlatform() {
        return platform;
    }

    public ReleaseDate setPlatform(Integer platform) {
        this.platform = platform;
        return this;
    }

    public String getHuman() {
        return human;
    }

    public ReleaseDate setHuman(String human) {
        this.human = human;
        return this;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public ReleaseDate setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public ReleaseDate setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public ReleaseDate setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getRegion() {
        return region;
    }

    public ReleaseDate setRegion(Integer region) {
        this.region = region;
        return this;
    }

    public Integer getY() {
        return y;
    }

    public ReleaseDate setY(Integer y) {
        this.y = y;
        return this;
    }

    public Integer getM() {
        return m;
    }

    public ReleaseDate setM(Integer m) {
        this.m = m;
        return this;
    }
}
