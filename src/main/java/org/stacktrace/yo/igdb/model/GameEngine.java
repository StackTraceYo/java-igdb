package org.stacktrace.yo.igdb.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.stacktrace.yo.igdb.model.internal.Image;

import java.util.List;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class GameEngine implements IGDBModel {

    private Integer id;
    private String name;
    private String slug;
    private String url;
    @JsonProperty("created_at")
    private Long createdAt;
    @JsonProperty("updated_at")
    private Long updatedAt;
    private Image logo;
    private List<Integer> games;
    private List<Integer> companies;
    private List<Integer> platforms;

    public GameEngine() {
    }

    public Integer getId() {
        return id;
    }

    public GameEngine setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GameEngine setName(String name) {
        this.name = name;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public GameEngine setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public GameEngine setUrl(String url) {
        this.url = url;
        return this;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public GameEngine setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public GameEngine setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public Image getLogo() {
        return logo;
    }

    public GameEngine setLogo(Image logo) {
        this.logo = logo;
        return this;
    }

    public List<Integer> getGames() {
        return games;
    }

    public GameEngine setGames(List<Integer> games) {
        this.games = games;
        return this;
    }

    public List<Integer> getCompanies() {
        return companies;
    }

    public GameEngine setCompanies(List<Integer> companies) {
        this.companies = companies;
        return this;
    }

    public List<Integer> getPlatforms() {
        return platforms;
    }

    public GameEngine setPlatforms(List<Integer> platforms) {
        this.platforms = platforms;
        return this;
    }
}
