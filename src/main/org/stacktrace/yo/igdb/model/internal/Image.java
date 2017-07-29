package org.stacktrace.yo.igdb.model.internal;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class Image {

    private String url;
    @JsonProperty("cloudinary_id")
    private String cloudinaryId;
    private Integer width;
    private Integer height;

    public Image() {
    }

    public String getUrl() {
        return url;
    }

    public Image setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getCloudinaryId() {
        return cloudinaryId;
    }

    public Image setCloudinaryId(String cloudinaryId) {
        this.cloudinaryId = cloudinaryId;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public Image setWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public Image setHeight(Integer height) {
        this.height = height;
        return this;
    }
}
