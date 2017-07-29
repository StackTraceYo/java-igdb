package org.stacktrace.yo.igdb.model;

import java.util.List;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class PulseGroup implements IGDBModel {

    private Integer id;
    private String name;
    private Integer category;
    private Integer createdAt;
    private Integer updatedAt;
    private Integer publishedAt;
    private List<Integer> tags;
    private List<Integer> pulses;
    private List<Integer> game;

    public PulseGroup() {
    }

    public Integer getId() {
        return id;
    }

    public PulseGroup setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public PulseGroup setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getCategory() {
        return category;
    }

    public PulseGroup setCategory(Integer category) {
        this.category = category;
        return this;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public PulseGroup setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public PulseGroup setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public Integer getPublishedAt() {
        return publishedAt;
    }

    public PulseGroup setPublishedAt(Integer publishedAt) {
        this.publishedAt = publishedAt;
        return this;
    }

    public List<Integer> getTags() {
        return tags;
    }

    public PulseGroup setTags(List<Integer> tags) {
        this.tags = tags;
        return this;
    }

    public List<Integer> getPulses() {
        return pulses;
    }

    public PulseGroup setPulses(List<Integer> pulses) {
        this.pulses = pulses;
        return this;
    }

    public List<Integer> getGame() {
        return game;
    }

    public PulseGroup setGame(List<Integer> game) {
        this.game = game;
        return this;
    }
}
