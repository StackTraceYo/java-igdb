
package org.stacktrace.yo.igdb.model.internal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Website {

    @JsonProperty("category")
    private Long category;
    @JsonProperty("url")
    private String url;

    @JsonProperty("category")
    public Long getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(Long category) {
        this.category = category;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(category).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Website) == false) {
            return false;
        }
        Website rhs = ((Website) other);
        return new EqualsBuilder().append(category, rhs.category).append(url, rhs.url).isEquals();
    }

}
