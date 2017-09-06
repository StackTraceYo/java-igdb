
package org.stacktrace.yo.igdb.model.internal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlatformCompany {

    @JsonProperty("company")
    private Long company;
    @JsonProperty("comment")
    private String comment;

    @JsonProperty("company")
    public Long getCompany() {
        return company;
    }

    @JsonProperty("company")
    public void setCompany(Long company) {
        this.company = company;
    }

    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(company).append(comment).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PlatformCompany) == false) {
            return false;
        }
        PlatformCompany rhs = ((PlatformCompany) other);
        return new EqualsBuilder().append(company, rhs.company).append(comment, rhs.comment).isEquals();
    }

}
