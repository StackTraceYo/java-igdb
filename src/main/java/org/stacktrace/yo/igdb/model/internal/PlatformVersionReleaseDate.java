
package org.stacktrace.yo.igdb.model.internal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlatformVersionReleaseDate {

    @JsonProperty("date")
    private Long date;
    @JsonProperty("region")
    private Long region;

    @JsonProperty("date")
    public Long getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(Long date) {
        this.date = date;
    }

    @JsonProperty("region")
    public Long getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(Long region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(date).append(region).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PlatformVersionReleaseDate) == false) {
            return false;
        }
        PlatformVersionReleaseDate rhs = ((PlatformVersionReleaseDate) other);
        return new EqualsBuilder().append(date, rhs.date).append(region, rhs.region).isEquals();
    }

}
