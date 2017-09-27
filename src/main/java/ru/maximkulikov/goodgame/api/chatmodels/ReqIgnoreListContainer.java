package ru.maximkulikov.goodgame.api.chatmodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * @author Maxim Kulikov
 * @since 09.01.2017
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReqIgnoreListContainer implements ReqChatObject {

    private String type = "get_ignore_list";

    private Empty data = new Empty();

    public final Empty getData() {
        return this.data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ReqIgnoreListContainer that = (ReqIgnoreListContainer) o;

        return new EqualsBuilder()
                .append(type, that.type)
                .append(data, that.data)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(type)
                .append(data)
                .toHashCode();
    }

    /**
     *
     */

    public ReqIgnoreListContainer() {
    }

    public final void setData(final Empty data) {
        this.data = data;
    }

    public final String getType() {
        return this.type;
    }

    public final void setType(final String type) {
        this.type = type;
    }

    @Override
    public final String toString() {
        return "ReqIgnoreListContainer{" +
                "type='" + this.type + '\'' +
                ", data=" + this.data +
                '}';
    }
}
