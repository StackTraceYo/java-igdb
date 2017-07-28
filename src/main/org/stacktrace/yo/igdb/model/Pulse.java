package org.stacktrace.yo.igdb.model;

import java.util.List;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class Pulse implements IGDBModel {

    private Integer id;
    private Integer pulseSource;
    private String title;
    private String summary;
    private String url;
    private String uid;
    private Integer createdAt;
    private Integer updatedAt;
    private Integer publishedAt;
    private String image;
    private String author;
    private List<Integer> tags;

    public Pulse() {
    }

    public Integer getId() {
        return id;
    }

    public Pulse setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getPulseSource() {
        return pulseSource;
    }

    public Pulse setPulseSource(Integer pulseSource) {
        this.pulseSource = pulseSource;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Pulse setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getSummary() {
        return summary;
    }

    public Pulse setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Pulse setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getUid() {
        return uid;
    }

    public Pulse setUid(String uid) {
        this.uid = uid;
        return this;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public Pulse setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public Pulse setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public Integer getPublishedAt() {
        return publishedAt;
    }

    public Pulse setPublishedAt(Integer publishedAt) {
        this.publishedAt = publishedAt;
        return this;
    }

    public String getImage() {
        return image;
    }

    public Pulse setImage(String image) {
        this.image = image;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Pulse setAuthor(String author) {
        this.author = author;
        return this;
    }

    public List<Integer> getTags() {
        return tags;
    }

    public Pulse setTags(List<Integer> tags) {
        this.tags = tags;
        return this;
    }
}
