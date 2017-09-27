package ru.maximkulikov.goodgame.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * @author Maxim Kulikov
 * @since 03.01.2017
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Premium {

    private String id;

    private String username;

    @JsonProperty("created_at")
    private String createdAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Premium premium = (Premium) o;

        return new EqualsBuilder()
                .append(id, premium.id)
                .append(username, premium.username)
                .append(createdAt, premium.createdAt)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(username)
                .append(createdAt)
                .toHashCode();
    }

    /**

     * @return created_at
     */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final void setCreatedAt(final String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return id
     */
    public final String getId() {
        return this.id;
    }

    public final void setId(final String id) {
        this.id = id;
    }

    /**
     * @return username
     */
    public final String getUsername() {
        return this.username;
    }

    public final void setUsername(final String username) {
        this.username = username;
    }

    @Override
    public final String toString() {
        return "Premium{" +
                "id='" + this.id + '\'' +
                ", username='" + this.username + '\'' +
                ", createdAt='" + this.createdAt + '\'' +
                '}';
    }
}
