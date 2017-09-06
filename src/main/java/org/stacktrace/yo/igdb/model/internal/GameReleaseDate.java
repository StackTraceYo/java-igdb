
package org.stacktrace.yo.igdb.model.internal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GameReleaseDate {

    @JsonProperty("date")
    private Long date;
    @JsonProperty("y")
    private Long y;
    @JsonProperty("category")
    private Long category;
    @JsonProperty("region")
    private Long region;
    @JsonProperty("human")
    private String human;
    @JsonProperty("m")
    private Long m;
    @JsonProperty("platform")
    private Long platform;

    @JsonProperty("date")
    public Long getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(Long date) {
        this.date = date;
    }

    @JsonProperty("y")
    public Long getY() {
        return y;
    }

    @JsonProperty("y")
    public void setY(Long y) {
        this.y = y;
    }

    @JsonProperty("category")
    public Long getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(Long category) {
        this.category = category;
    }

    @JsonProperty("region")
    public Long getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(Long region) {
        this.region = region;
    }

    @JsonProperty("human")
    public String getHuman() {
        return human;
    }

    @JsonProperty("human")
    public void setHuman(String human) {
        this.human = human;
    }

    @JsonProperty("m")
    public Long getM() {
        return m;
    }

    @JsonProperty("m")
    public void setM(Long m) {
        this.m = m;
    }

    @JsonProperty("platform")
    public Long getPlatform() {
        return platform;
    }

    @JsonProperty("platform")
    public void setPlatform(Long platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(date).append(y).append(category).append(region).append(human).append(m).append(platform).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GameReleaseDate) == false) {
            return false;
        }
        GameReleaseDate rhs = ((GameReleaseDate) other);
        return new EqualsBuilder().append(date, rhs.date).append(y, rhs.y).append(category, rhs.category).append(region, rhs.region).append(human, rhs.human).append(m, rhs.m).append(platform, rhs.platform).isEquals();
    }

}
