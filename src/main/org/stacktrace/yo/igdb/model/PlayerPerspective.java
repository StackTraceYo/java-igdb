package org.stacktrace.yo.igdb.model;

import java.util.List;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class PlayerPerspective implements IGDBModel {

    private Integer id;
    private String name;
    private String slug;
    private String url;
    private Integer createdAt;
    private Integer updatedAt;
    private List<Integer> games;

    public PlayerPerspective() {
    }

    public Integer getId() {
        return id;
    }

    public PlayerPerspective setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public PlayerPerspective setName(String name) {
        this.name = name;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public PlayerPerspective setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public PlayerPerspective setUrl(String url) {
        this.url = url;
        return this;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public PlayerPerspective setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public PlayerPerspective setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public List<Integer> getGames() {
        return games;
    }

    public PlayerPerspective setGames(List<Integer> games) {
        this.games = games;
        return this;
    }
}
