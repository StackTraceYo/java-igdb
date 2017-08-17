package org.stacktrace.yo.igdb.model;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("created_at")
    private Long createdAt;
    @JsonProperty("updated_at")
    private Long updatedAt;
    private Image logo;
    private String description;
    private Integer country;
    private String website;
    @JsonProperty("start_date")
    private Long startDate;
    @JsonProperty("start_date_category")
    private Integer startDateCategory;
    @JsonProperty("changed_company_id")
    private Integer changedCompanyId;
    @JsonProperty("change_date")
    private Long changeDate;
    @JsonProperty("change_date_category")
    private Integer changeDateCategory;
    private String twitter;
    private List<Integer> published;
    private List<Integer> developed;
    private Integer parent;

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

    public Long getCreatedAt() {
        return createdAt;
    }

    public Company setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public Company setUpdatedAt(Long updatedAt) {
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

    public Long getStartDate() {
        return startDate;
    }

    public Company setStartDate(Long startDate) {
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

    public Long getChangeDate() {
        return changeDate;
    }

    public Company setChangeDate(Long changeDate) {
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

    public Integer getParent() {
        return parent;
    }

    public Company setParent(Integer parent) {
        this.parent = parent;
        return this;
    }
}
