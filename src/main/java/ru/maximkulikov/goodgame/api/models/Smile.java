package ru.maximkulikov.goodgame.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * @author Maxim Kulikov
 * @since 04.01.2017
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Smile {

    private String key;

    @JsonProperty("donate_lvl")
    private Long donateLvl;

    @JsonProperty("is_premium")
    private Boolean isPremium;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Smile smile = (Smile) o;

        return new EqualsBuilder()
                .append(key, smile.key)
                .append(donateLvl, smile.donateLvl)
                .append(isPremium, smile.isPremium)
                .append(isPaid, smile.isPaid)
                .append(channelId, smile.channelId)
                .append(urls, smile.urls)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(key)
                .append(donateLvl)
                .append(isPremium)
                .append(isPaid)
                .append(channelId)
                .append(urls)
                .toHashCode();
    }

    @JsonProperty("is_paid")
    private Boolean isPaid;

    @JsonProperty("channel_id")
    private String channelId;

    private SmileUrls urls;

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
     * @return donate_lvl
     */
    public final Long getDonateLvl() {
        return this.donateLvl;
    }

    public final void setDonateLvl(final Long donateLvl) {
        this.donateLvl = donateLvl;
    }

    /**
     * @return key
     */
    public final String getKey() {
        return this.key;
    }

    public final void setKey(final String key) {
        this.key = key;
    }

    /**
     * @return is_paid
     */
    public final Boolean isPaid() {
        return this.isPaid;
    }

    public final void setPaid(final Boolean isPaid) {
        this.isPaid = isPaid;
    }

    /**
     * @return is_premium
     */
    public final Boolean isPremium() {
        return this.isPremium;
    }

    public final void setPremium(final Boolean isPremium) {
        this.isPremium = isPremium;
    }

    /**
     * @return urls
     */
    public final SmileUrls getUrls() {
        return this.urls;
    }

    public final void setUrls(final SmileUrls urls) {
        this.urls = urls;
    }

    @Override
    public final String toString() {
        return "Smile{" +
                "key='" + this.key + '\'' +
                ", donateLvl=" + this.donateLvl +
                ", isPremium=" + this.isPremium +
                ", isPaid=" + this.isPaid +
                ", channelId='" + this.channelId + '\'' +
                ", urls=" + this.urls +
                '}';
    }
}
