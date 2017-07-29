package org.stacktrace.yo.igdb.model;

import org.stacktrace.yo.igdb.model.internal.Image;

import java.util.List;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class Person implements IGDBModel {

    private Integer id;
    private String name;
    private String slug;
    private String url;
    private Integer createdAt;
    private Integer updatedAt;
    private Image mugShot;
    private List<Integer> games;
    private List<Integer> characters;
    private List<Integer> voiceActed;

    public Person() {
    }

    public Integer getId() {
        return id;
    }

    public Person setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public Person setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Person setUrl(String url) {
        this.url = url;
        return this;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public Person setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public Person setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public Image getMugShot() {
        return mugShot;
    }

    public Person setMugShot(Image mugShot) {
        this.mugShot = mugShot;
        return this;
    }

    public List<Integer> getGames() {
        return games;
    }

    public Person setGames(List<Integer> games) {
        this.games = games;
        return this;
    }

    public List<Integer> getCharacters() {
        return characters;
    }

    public Person setCharacters(List<Integer> characters) {
        this.characters = characters;
        return this;
    }

    public List<Integer> getVoiceActed() {
        return voiceActed;
    }

    public Person setVoiceActed(List<Integer> voiceActed) {
        this.voiceActed = voiceActed;
        return this;
    }
}
