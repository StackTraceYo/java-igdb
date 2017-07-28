package org.stacktrace.yo.igdb.model;

import org.stacktrace.yo.igdb.model.internal.Image;
import org.stacktrace.yo.igdb.model.internal.PlatformVersion;

import java.util.List;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class Platform implements IGDBModel {

    private Integer id;
    private String name;
    private String slug;
    private String url;
    private Integer createdAt;
    private Integer updatedAt;
    private Image logo;
    private String website;
    private String summary;
    private String alternativeName;
    private Integer generation;
    private List<Integer> games;
    private List<PlatformVersion> versions;

    public Platform() {
    }

    public Integer getId() {
        return id;
    }

    public Platform setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Platform setName(String name) {
        this.name = name;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public Platform setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Platform setUrl(String url) {
        this.url = url;
        return this;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public Platform setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public Platform setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public Image getLogo() {
        return logo;
    }

    public Platform setLogo(Image logo) {
        this.logo = logo;
        return this;
    }

    public String getWebsite() {
        return website;
    }

    public Platform setWebsite(String website) {
        this.website = website;
        return this;
    }

    public String getSummary() {
        return summary;
    }

    public Platform setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public String getAlternativeName() {
        return alternativeName;
    }

    public Platform setAlternativeName(String alternativeName) {
        this.alternativeName = alternativeName;
        return this;
    }

    public Integer getGeneration() {
        return generation;
    }

    public Platform setGeneration(Integer generation) {
        this.generation = generation;
        return this;
    }

    public List<Integer> getGames() {
        return games;
    }

    public Platform setGames(List<Integer> games) {
        this.games = games;
        return this;
    }

    public List<PlatformVersion> getVersions() {
        return versions;
    }

    public Platform setVersions(List<PlatformVersion> versions) {
        this.versions = versions;
        return this;
    }
}
