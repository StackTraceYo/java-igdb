package org.stacktrace.yo.igdb.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.stacktrace.yo.igdb.model.internal.Image;

import java.util.List;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class Character implements IGDBModel {

    private Integer id;
    private String name;
    private String slug;
    private String url;
    @JsonProperty("created_at")
    private Long createdAt;
    @JsonProperty("updated_at")
    private Long updatedAt;
    @JsonProperty("mug_shot")
    private Image mugShot;
    private Integer gender;
    private List<String> aliases;
    private Integer species;
    private List<Integer> games;
    private List<Integer> people;

    public Character() {
    }

    public Integer getId() {
        return id;
    }

    public Character setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Character setName(String name) {
        this.name = name;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public Character setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Character setUrl(String url) {
        this.url = url;
        return this;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public Character setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public Character setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public Image getMugShot() {
        return mugShot;
    }

    public Character setMugShot(Image mugShot) {
        this.mugShot = mugShot;
        return this;
    }

    public Integer getGender() {
        return gender;
    }

    public Character setGender(Integer gender) {
        this.gender = gender;
        return this;
    }

    public List<String> getAliases() {
        return aliases;
    }

    public Character setAliases(List<String> aliases) {
        this.aliases = aliases;
        return this;
    }

    public Integer getSpecies() {
        return species;
    }

    public Character setSpecies(Integer species) {
        this.species = species;
        return this;
    }

    public List<Integer> getGames() {
        return games;
    }

    public Character setGames(List<Integer> games) {
        this.games = games;
        return this;
    }

    public List<Integer> getPeople() {
        return people;
    }

    public Character setPeople(List<Integer> people) {
        this.people = people;
        return this;
    }
}
