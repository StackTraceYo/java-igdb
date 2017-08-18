
package org.stacktrace.yo.igdb.model.internal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class TimeToBeat {

    @JsonProperty("hastly")
    private Long hastly;
    @JsonProperty("completely")
    private Long completely;
    @JsonProperty("normally")
    private Long normally;

    @JsonProperty("hastly")
    public Long getHastly() {
        return hastly;
    }

    @JsonProperty("hastly")
    public void setHastly(Long hastly) {
        this.hastly = hastly;
    }

    @JsonProperty("completely")
    public Long getCompletely() {
        return completely;
    }

    @JsonProperty("completely")
    public void setCompletely(Long completely) {
        this.completely = completely;
    }

    @JsonProperty("normally")
    public Long getNormally() {
        return normally;
    }

    @JsonProperty("normally")
    public void setNormally(Long normally) {
        this.normally = normally;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(hastly).append(completely).append(normally).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TimeToBeat) == false) {
            return false;
        }
        TimeToBeat rhs = ((TimeToBeat) other);
        return new EqualsBuilder().append(hastly, rhs.hastly).append(completely, rhs.completely).append(normally, rhs.normally).isEquals();
    }

}
