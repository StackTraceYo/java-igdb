package org.stacktrace.yo.igdb.model;

import java.util.List;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class Character implements IGDBModel {

    private Integer id;
    private String name;
    private String slug;
    private String url;
    private Integer createdAt;
    private Integer updatedAt;
    private Object mugShot;
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

    public Integer getCreatedAt() {
        return createdAt;
    }

    public Character setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public Character setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public Object getMugShot() {
        return mugShot;
    }

    public Character setMugShot(Object mugShot) {
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
