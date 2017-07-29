package org.stacktrace.yo.igdb.model;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class Review implements IGDBModel {

    private Integer id;
    private String username;
    private String slug;
    private String url;
    private String title;
    private Integer createdAt;
    private Integer updatedAt;
    private Integer game;
    private Integer category;
    private Integer likes;
    private Integer views;
    private Integer ratingCategory;
    private Integer platform;
    private String youtube;
    private String introduction;
    private String content;
    private String conclusion;
    private String positivePoints;
    private String negativePoints;

    public Review() {
    }

    public Integer getId() {
        return id;
    }

    public Review setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Review setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public Review setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Review setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Review setTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public Review setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public Review setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public Integer getGame() {
        return game;
    }

    public Review setGame(Integer game) {
        this.game = game;
        return this;
    }

    public Integer getCategory() {
        return category;
    }

    public Review setCategory(Integer category) {
        this.category = category;
        return this;
    }

    public Integer getLikes() {
        return likes;
    }

    public Review setLikes(Integer likes) {
        this.likes = likes;
        return this;
    }

    public Integer getViews() {
        return views;
    }

    public Review setViews(Integer views) {
        this.views = views;
        return this;
    }

    public Integer getRatingCategory() {
        return ratingCategory;
    }

    public Review setRatingCategory(Integer ratingCategory) {
        this.ratingCategory = ratingCategory;
        return this;
    }

    public Integer getPlatform() {
        return platform;
    }

    public Review setPlatform(Integer platform) {
        this.platform = platform;
        return this;
    }

    public String getYoutube() {
        return youtube;
    }

    public Review setYoutube(String youtube) {
        this.youtube = youtube;
        return this;
    }

    public String getIntroduction() {
        return introduction;
    }

    public Review setIntroduction(String introduction) {
        this.introduction = introduction;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Review setContent(String content) {
        this.content = content;
        return this;
    }

    public String getConclusion() {
        return conclusion;
    }

    public Review setConclusion(String conclusion) {
        this.conclusion = conclusion;
        return this;
    }

    public String getPositivePoints() {
        return positivePoints;
    }

    public Review setPositivePoints(String positivePoints) {
        this.positivePoints = positivePoints;
        return this;
    }

    public String getNegativePoints() {
        return negativePoints;
    }

    public Review setNegativePoints(String negativePoints) {
        this.negativePoints = negativePoints;
        return this;
    }
}
