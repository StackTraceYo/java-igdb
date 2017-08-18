package org.stacktrace.yo.igdb.model.internal;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class Image {

    @JsonProperty("width")
    private Long width;
    @JsonProperty("cloudinary_id")
    private String cloudinaryId;
    @JsonProperty("url")
    private String url;
    @JsonProperty("height")
    private Long height;

    @JsonProperty("width")
    public Long getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Long width) {
        this.width = width;
    }

    @JsonProperty("cloudinary_id")
    public String getCloudinaryId() {
        return cloudinaryId;
    }

    @JsonProperty("cloudinary_id")
    public void setCloudinaryId(String cloudinaryId) {
        this.cloudinaryId = cloudinaryId;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("height")
    public Long getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Long height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(width).append(cloudinaryId).append(url).append(height).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Image) == false) {
            return false;
        }
        Image rhs = ((Image) other);
        return new EqualsBuilder().append(width, rhs.width).append(cloudinaryId, rhs.cloudinaryId).append(url, rhs.url).append(height, rhs.height).isEquals();
    }

}
