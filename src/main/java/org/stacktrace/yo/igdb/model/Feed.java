package org.stacktrace.yo.igdb.model;

import java.util.List;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class Feed implements IGDBModel {

    private Integer id;
    private String url;
    private Integer createdAt;
    private Integer updatedAt;
    private String content;
    private Integer category;
    private Integer user;
    private List<Integer> games;
    private String title;
    private Integer feedLikesCount;

    public Feed() {
    }

    public Integer getId() {
        return id;
    }

    public Feed setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Feed setUrl(String url) {
        this.url = url;
        return this;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public Feed setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public Feed setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Feed setContent(String content) {
        this.content = content;
        return this;
    }

    public Integer getCategory() {
        return category;
    }

    public Feed setCategory(Integer category) {
        this.category = category;
        return this;
    }

    public Integer getUser() {
        return user;
    }

    public Feed setUser(Integer user) {
        this.user = user;
        return this;
    }

    public List<Integer> getGames() {
        return games;
    }

    public Feed setGames(List<Integer> games) {
        this.games = games;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Feed setTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getFeedLikesCount() {
        return feedLikesCount;
    }

    public Feed setFeedLikesCount(Integer feedLikesCount) {
        this.feedLikesCount = feedLikesCount;
        return this;
    }
}
