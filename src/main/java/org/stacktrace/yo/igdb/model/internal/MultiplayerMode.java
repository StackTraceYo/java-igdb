
package org.stacktrace.yo.igdb.model.internal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "platform",
    "offlinecoop",
    "onlinecoop",
    "lancoop",
    "campaigncoop",
    "splitscreenonline",
    "dropin",
    "offlinecoopmax",
    "onlinecoopmax",
    "offlinemax",
    "onlinemax",
    "splitscreen"
})
public class MultiplayerMode {

    @JsonProperty("platform")
    private Long platform;
    @JsonProperty("offlinecoop")
    private Boolean offlinecoop;
    @JsonProperty("onlinecoop")
    private Boolean onlinecoop;
    @JsonProperty("lancoop")
    private Boolean lancoop;
    @JsonProperty("campaigncoop")
    private Boolean campaigncoop;
    @JsonProperty("splitscreenonline")
    private Boolean splitscreenonline;
    @JsonProperty("dropin")
    private Object dropin;
    @JsonProperty("offlinecoopmax")
    private Long offlinecoopmax;
    @JsonProperty("onlinecoopmax")
    private Long onlinecoopmax;
    @JsonProperty("offlinemax")
    private Long offlinemax;
    @JsonProperty("onlinemax")
    private Long onlinemax;
    @JsonProperty("splitscreen")
    private Boolean splitscreen;

    @JsonProperty("platform")
    public Long getPlatform() {
        return platform;
    }

    @JsonProperty("platform")
    public void setPlatform(Long platform) {
        this.platform = platform;
    }

    @JsonProperty("offlinecoop")
    public Boolean getOfflinecoop() {
        return offlinecoop;
    }

    @JsonProperty("offlinecoop")
    public void setOfflinecoop(Boolean offlinecoop) {
        this.offlinecoop = offlinecoop;
    }

    @JsonProperty("onlinecoop")
    public Boolean getOnlinecoop() {
        return onlinecoop;
    }

    @JsonProperty("onlinecoop")
    public void setOnlinecoop(Boolean onlinecoop) {
        this.onlinecoop = onlinecoop;
    }

    @JsonProperty("lancoop")
    public Boolean getLancoop() {
        return lancoop;
    }

    @JsonProperty("lancoop")
    public void setLancoop(Boolean lancoop) {
        this.lancoop = lancoop;
    }

    @JsonProperty("campaigncoop")
    public Boolean getCampaigncoop() {
        return campaigncoop;
    }

    @JsonProperty("campaigncoop")
    public void setCampaigncoop(Boolean campaigncoop) {
        this.campaigncoop = campaigncoop;
    }

    @JsonProperty("splitscreenonline")
    public Boolean getSplitscreenonline() {
        return splitscreenonline;
    }

    @JsonProperty("splitscreenonline")
    public void setSplitscreenonline(Boolean splitscreenonline) {
        this.splitscreenonline = splitscreenonline;
    }

    @JsonProperty("dropin")
    public Object getDropin() {
        return dropin;
    }

    @JsonProperty("dropin")
    public void setDropin(Object dropin) {
        this.dropin = dropin;
    }

    @JsonProperty("offlinecoopmax")
    public Long getOfflinecoopmax() {
        return offlinecoopmax;
    }

    @JsonProperty("offlinecoopmax")
    public void setOfflinecoopmax(Long offlinecoopmax) {
        this.offlinecoopmax = offlinecoopmax;
    }

    @JsonProperty("onlinecoopmax")
    public Long getOnlinecoopmax() {
        return onlinecoopmax;
    }

    @JsonProperty("onlinecoopmax")
    public void setOnlinecoopmax(Long onlinecoopmax) {
        this.onlinecoopmax = onlinecoopmax;
    }

    @JsonProperty("offlinemax")
    public Long getOfflinemax() {
        return offlinemax;
    }

    @JsonProperty("offlinemax")
    public void setOfflinemax(Long offlinemax) {
        this.offlinemax = offlinemax;
    }

    @JsonProperty("onlinemax")
    public Long getOnlinemax() {
        return onlinemax;
    }

    @JsonProperty("onlinemax")
    public void setOnlinemax(Long onlinemax) {
        this.onlinemax = onlinemax;
    }

    @JsonProperty("splitscreen")
    public Boolean getSplitscreen() {
        return splitscreen;
    }

    @JsonProperty("splitscreen")
    public void setSplitscreen(Boolean splitscreen) {
        this.splitscreen = splitscreen;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(platform).append(offlinecoop).append(onlinecoop).append(lancoop).append(campaigncoop).append(splitscreenonline).append(dropin).append(offlinecoopmax).append(onlinecoopmax).append(offlinemax).append(onlinemax).append(splitscreen).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MultiplayerMode) == false) {
            return false;
        }
        MultiplayerMode rhs = ((MultiplayerMode) other);
        return new EqualsBuilder().append(platform, rhs.platform).append(offlinecoop, rhs.offlinecoop).append(onlinecoop, rhs.onlinecoop).append(lancoop, rhs.lancoop).append(campaigncoop, rhs.campaigncoop).append(splitscreenonline, rhs.splitscreenonline).append(dropin, rhs.dropin).append(offlinecoopmax, rhs.offlinecoopmax).append(onlinecoopmax, rhs.onlinecoopmax).append(offlinemax, rhs.offlinemax).append(onlinemax, rhs.onlinemax).append(splitscreen, rhs.splitscreen).isEquals();
    }

}
