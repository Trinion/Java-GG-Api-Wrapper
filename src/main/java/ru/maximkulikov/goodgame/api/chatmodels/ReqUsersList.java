package ru.maximkulikov.goodgame.api.chatmodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * @author Maxim Kulikov
 * @since 09.01.2017
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReqUsersList {

    @JsonProperty("channel_id")
    private String channelId;

    /**
     * @param channelId channel_id
     */
    public ReqUsersList(final String channelId) {
        this.channelId = channelId;
    }

    public final String getChannelId() {
        return this.channelId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ReqUsersList that = (ReqUsersList) o;

        return new EqualsBuilder()
                .append(channelId, that.channelId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(channelId)
                .toHashCode();
    }

    public final void setChannelId(final String channelId) {
        this.channelId = channelId;
    }

    @Override
    public final String toString() {
        return "ReqUsersList{" +
                "channelId='" + this.channelId + '\'' +
                '}';
    }
}
