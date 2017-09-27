package ru.maximkulikov.goodgame.api.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * @author Maxim Kulikov
 * @since 29.12.2016
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Player {

    @JsonProperty("channel_id")
    private String channelId;

    @JsonProperty("channel_key")
    private String channelKey;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        return new EqualsBuilder()
                .append(channelId, player.channelId)
                .append(channelKey, player.channelKey)
                .append(channelTitle, player.channelTitle)
                .append(broadcastTitle, player.broadcastTitle)
                .append(channelStatus, player.channelStatus)
                .append(channelPoster, player.channelPoster)
                .append(channelPremium, player.channelPremium)
                .append(streamerAvatar, player.streamerAvatar)
                .append(premiumOnly, player.premiumOnly)
                .append(adult, player.adult)
                .append(channelStart, player.channelStart)
                .append(gaCode, player.gaCode)
                .append(broadcasts, player.broadcasts)
                .append(premiumPrices, player.premiumPrices)
                .append(users, player.users)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(channelId)
                .append(channelKey)
                .append(channelTitle)
                .append(broadcastTitle)
                .append(channelStatus)
                .append(channelPoster)
                .append(channelPremium)
                .append(streamerAvatar)
                .append(premiumOnly)
                .append(adult)
                .append(channelStart)
                .append(gaCode)
                .append(broadcasts)
                .append(premiumPrices)
                .append(users)
                .toHashCode();
    }

    @JsonProperty("channel_title")
    private String channelTitle;

    @JsonProperty("broadcast_title")
    private String broadcastTitle;

    @JsonProperty("channel_status")
    private String channelStatus;

    @JsonProperty("channel_poster")
    private String channelPoster;

    @JsonProperty("channel_premium")
    private String channelPremium;

    @JsonProperty("streamer_avatar")
    private String streamerAvatar;

    @JsonProperty("premium_only")
    private String premiumOnly;

    private String adult;

    @JsonProperty("channel_start")
    private String channelStart;

    @JsonProperty("ga_code")
    private String gaCode;

    private List<Broadcast> broadcasts;

    @JsonProperty("premium_prices")
    private PremiumPrices premiumPrices;

    private List<User> users;

    /**
     * @return adult
     */
    public final String getAdult() {
        return this.adult;
    }

    public final void setAdult(final String adult) {
        this.adult = adult;
    }

    /**
     * @return broadcast_title
     */
    public final String getBroadcastTitle() {
        return this.broadcastTitle;
    }

    public final void setBroadcastTitle(final String broadcastTitle) {
        this.broadcastTitle = broadcastTitle;
    }

    /**
     * @return broadcasts
     */
    public final List<Broadcast> getBroadcasts() {
        return this.broadcasts;
    }

    public final void setBroadcasts(final List<Broadcast> broadcasts) {
        this.broadcasts = broadcasts;
    }

    /**
     * @return channel_id
     */
    public final String getChannelId() {
        return this.channelId;
    }

    public final void setChannelId(final String channelId) {
        this.channelId = channelId;
    }

    /**
     * @return channel_key
     */
    public final String getChannelKey() {
        return this.channelKey;
    }

    public final void setChannelKey(final String channelKey) {
        this.channelKey = channelKey;
    }

    /**
     * @return channel_poster
     */
    public final String getChannelPoster() {
        return this.channelPoster;
    }

    public final void setChannelPoster(final String channelPoster) {
        this.channelPoster = channelPoster;
    }

    /**
     * @return channel_premium
     */
    public final String getChannelPremium() {
        return this.channelPremium;
    }

    public final void setChannelPremium(final String channelPremium) {
        this.channelPremium = channelPremium;
    }

    /**
     * @return channel_start
     */
    public final String getChannelStart() {
        return this.channelStart;
    }

    public final void setChannelStart(final String channelStart) {
        this.channelStart = channelStart;
    }

    /**
     * @return channel_status
     */
    public final String getChannelStatus() {
        return this.channelStatus;
    }

    public final void setChannelStatus(final String channelStatus) {
        this.channelStatus = channelStatus;
    }

    /**
     * @return channel_title
     */
    public final String getChannelTitle() {
        return this.channelTitle;
    }

    public final void setChannelTitle(final String channelTitle) {
        this.channelTitle = channelTitle;
    }

    /**
     * @return ga_code
     */
    public final String getGaCode() {
        return this.gaCode;
    }

    public final void setGaCode(final String gaCode) {
        this.gaCode = gaCode;
    }

    /**
     * @return premium_only
     */
    public final String getPremiumOnly() {
        return this.premiumOnly;
    }

    public final void setPremiumOnly(final String premiumOnly) {
        this.premiumOnly = premiumOnly;
    }

    /**
     * @return premium_prices
     */
    public final PremiumPrices getPremiumPrices() {
        return this.premiumPrices;
    }

    public final void setPremiumPrices(final PremiumPrices premiumPrices) {
        this.premiumPrices = premiumPrices;
    }

    /**
     * @return streamer_avatar
     */
    public final String getStreamerAvatar() {
        return this.streamerAvatar;
    }

    public final void setStreamerAvatar(final String streamerAvatar) {
        this.streamerAvatar = streamerAvatar;
    }

    /**
     * @return users
     */
    public final List<User> getUsers() {
        return this.users;
    }

    public final void setUsers(final List<User> users) {
        this.users = users;
    }

    @Override
    public final String toString() {
        return "Player{" +
                "channelId='" + this.channelId + '\'' +
                ", channelKey='" + this.channelKey + '\'' +
                ", channelTitle='" + this.channelTitle + '\'' +
                ", broadcastTitle='" + this.broadcastTitle + '\'' +
                ", channelStatus='" + this.channelStatus + '\'' +
                ", channelPoster='" + this.channelPoster + '\'' +
                ", channelPremium='" + this.channelPremium + '\'' +
                ", streamerAvatar='" + this.streamerAvatar + '\'' +
                ", premiumOnly='" + this.premiumOnly + '\'' +
                ", adult='" + this.adult + '\'' +
                ", channelStart='" + this.channelStart + '\'' +
                ", gaCode='" + this.gaCode + '\'' +
                ", broadcasts=" + this.broadcasts +
                ", premiumPrices=" + this.premiumPrices +
                ", users=" + this.users +
                '}';
    }
}
