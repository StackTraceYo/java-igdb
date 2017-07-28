package org.stacktrace.yo.igdb.model;

import java.util.List;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class Collection implements IGDBModel {

    private Integer id;
    private String name;
    private String slug;
    private String url;
    private Integer createdAt;
    private Integer updatedAt;
    private List<Integer> games;

    public Collection() {
    }

    public Integer getId() {
        return id;
    }

    public Collection setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Collection setName(String name) {
        this.name = name;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public Collection setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Collection setUrl(String url) {
        this.url = url;
        return this;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public Collection setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public Collection setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public List<Integer> getGames() {
        return games;
    }

    public Collection setGames(List<Integer> games) {
        this.games = games;
        return this;
    }
}
