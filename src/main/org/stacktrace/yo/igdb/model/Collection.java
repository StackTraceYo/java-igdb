package org.stacktrace.yo.igdb.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class Collection implements IGDBModel {

    private Integer id;
    private String name;
    private String slug;
    private String url;
    @JsonProperty("created_at")
    private Long createdAt;
    @JsonProperty("updated_at")
    private Long updatedAt;
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

    public Long getCreatedAt() {
        return createdAt;
    }

    public Collection setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public Collection setUpdatedAt(Long updatedAt) {
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
