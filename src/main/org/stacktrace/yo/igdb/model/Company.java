package org.stacktrace.yo.igdb.model;

import org.stacktrace.yo.igdb.model.internal.Image;

import java.util.List;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class Company implements IGDBModel {

    private Integer id;
    private String name;
    private String slug;
    private String url;
    private Integer createdAt;
    private Integer updatedAt;
    private Image logo;
    private String description;
    private Integer country;
    private String website;
    private Integer startDate;
    private Integer startDateCategory;
    private Integer changedCompanyId;
    private Integer changeDate;
    private Integer changeDateCategory;
    private String twitter;
    private List<Integer> published;
    private List<Integer> developed;

    public Company() {
    }

    public Integer getId() {
        return id;
    }

    public Company setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Company setName(String name) {
        this.name = name;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public Company setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Company setUrl(String url) {
        this.url = url;
        return this;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public Company setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public Company setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public Image getLogo() {
        return logo;
    }

    public Company setLogo(Image logo) {
        this.logo = logo;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Company setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getCountry() {
        return country;
    }

    public Company setCountry(Integer country) {
        this.country = country;
        return this;
    }

    public String getWebsite() {
        return website;
    }

    public Company setWebsite(String website) {
        this.website = website;
        return this;
    }

    public Integer getStartDate() {
        return startDate;
    }

    public Company setStartDate(Integer startDate) {
        this.startDate = startDate;
        return this;
    }

    public Integer getStartDateCategory() {
        return startDateCategory;
    }

    public Company setStartDateCategory(Integer startDateCategory) {
        this.startDateCategory = startDateCategory;
        return this;
    }

    public Integer getChangedCompanyId() {
        return changedCompanyId;
    }

    public Company setChangedCompanyId(Integer changedCompanyId) {
        this.changedCompanyId = changedCompanyId;
        return this;
    }

    public Integer getChangeDate() {
        return changeDate;
    }

    public Company setChangeDate(Integer changeDate) {
        this.changeDate = changeDate;
        return this;
    }

    public Integer getChangeDateCategory() {
        return changeDateCategory;
    }

    public Company setChangeDateCategory(Integer changeDateCategory) {
        this.changeDateCategory = changeDateCategory;
        return this;
    }

    public String getTwitter() {
        return twitter;
    }

    public Company setTwitter(String twitter) {
        this.twitter = twitter;
        return this;
    }

    public List<Integer> getPublished() {
        return published;
    }

    public Company setPublished(List<Integer> published) {
        this.published = published;
        return this;
    }

    public List<Integer> getDeveloped() {
        return developed;
    }

    public Company setDeveloped(List<Integer> developed) {
        this.developed = developed;
        return this;
    }
}
