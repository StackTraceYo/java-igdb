package org.stacktrace.yo.igdb.model.internal;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class Website {

    private String url;
    private Integer category;

    public Website() {
    }

    public String getUrl() {
        return url;
    }

    public Website setUrl(String url) {
        this.url = url;
        return this;
    }

    public Integer getCategory() {
        return category;
    }

    public Website setCategory(Integer category) {
        this.category = category;
        return this;
    }
}
