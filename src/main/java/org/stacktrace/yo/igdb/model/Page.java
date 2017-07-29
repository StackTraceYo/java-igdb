package org.stacktrace.yo.igdb.model;

import org.stacktrace.yo.igdb.model.internal.Image;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class Page implements IGDBModel {

    private Integer id;
    private String url;
    private String slug;
    private Integer createdAt;
    private Integer updatedAt;
    private String name;
    private String content;
    private Integer category;
    private Integer subCategory;
    private Integer country;
    private Integer color;
    private Integer user;
    private Integer game;
    private Integer Company;
    private String description;
    private Integer pageFollowsCount;
    private Image logo;
    private Image background;
    private String facebook;
    private String twitter;
    private String twitch;
    private String instagram;
    private String youtube;
    private String steam;
    private String linkedin;
    private String pinterest;
    private String soundcloud;
    private String google_plus;
    private String reddit;
    private String battlenet;
    private String origin;
    private String uplay;
    private String discord;

    public Page() {
    }

    public Integer getId() {
        return id;
    }

    public Page setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Page setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public Page setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public Page setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public Page setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getName() {
        return name;
    }

    public Page setName(String name) {
        this.name = name;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Page setContent(String content) {
        this.content = content;
        return this;
    }

    public Integer getCategory() {
        return category;
    }

    public Page setCategory(Integer category) {
        this.category = category;
        return this;
    }

    public Integer getSubCategory() {
        return subCategory;
    }

    public Page setSubCategory(Integer subCategory) {
        this.subCategory = subCategory;
        return this;
    }

    public Integer getCountry() {
        return country;
    }

    public Page setCountry(Integer country) {
        this.country = country;
        return this;
    }

    public Integer getColor() {
        return color;
    }

    public Page setColor(Integer color) {
        this.color = color;
        return this;
    }

    public Integer getUser() {
        return user;
    }

    public Page setUser(Integer user) {
        this.user = user;
        return this;
    }

    public Integer getGame() {
        return game;
    }

    public Page setGame(Integer game) {
        this.game = game;
        return this;
    }

    public Integer getCompany() {
        return Company;
    }

    public Page setCompany(Integer company) {
        Company = company;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Page setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getPageFollowsCount() {
        return pageFollowsCount;
    }

    public Page setPageFollowsCount(Integer pageFollowsCount) {
        this.pageFollowsCount = pageFollowsCount;
        return this;
    }

    public Image getLogo() {
        return logo;
    }

    public Page setLogo(Image logo) {
        this.logo = logo;
        return this;
    }

    public Image getBackground() {
        return background;
    }

    public Page setBackground(Image background) {
        this.background = background;
        return this;
    }

    public String getFacebook() {
        return facebook;
    }

    public Page setFacebook(String facebook) {
        this.facebook = facebook;
        return this;
    }
}
