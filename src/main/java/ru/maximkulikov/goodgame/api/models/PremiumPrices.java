package ru.maximkulikov.goodgame.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * @author Maxim Kulikov
 * @since 29.12.2016
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PremiumPrices {

    @JsonProperty("1")
    private String id1;

    @JsonProperty("2")
    private String id2;

    @JsonProperty("3")
    private String id3;

    @JsonProperty("4")
    private String id4;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        PremiumPrices that = (PremiumPrices) o;

        return new EqualsBuilder()
                .append(id1, that.id1)
                .append(id2, that.id2)
                .append(id3, that.id3)
                .append(id4, that.id4)
                .append(id5, that.id5)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id1)
                .append(id2)
                .append(id3)
                .append(id4)
                .append(id5)
                .toHashCode();
    }

    @JsonProperty("5")
    private String id5;

    /**
     * @return 1
     */
    public final String getId1() {
        return this.id1;
    }

    public final void setId1(final String id1) {
        this.id1 = id1;
    }

    /**
     * @return 2
     */
    public final String getId2() {
        return this.id2;
    }

    public final void setId2(final String id2) {
        this.id2 = id2;
    }

    /**
     * @return 3
     */
    public final String getId3() {
        return this.id3;
    }

    public final void setId3(final String id3) {
        this.id3 = id3;
    }

    /**
     * @return 4
     */
    public final String getId4() {
        return this.id4;
    }

    public final void setId4(final String id4) {
        this.id4 = id4;
    }

    /**
     * @return 5
     */
    public final String getId5() {
        return this.id5;
    }

    public final void setId5(final String id5) {
        this.id5 = id5;
    }

    @Override
    public final String toString() {
        return "PremiumPrices{" +
                "id1='" + this.id1 + '\'' +
                ", id2='" + this.id2 + '\'' +
                ", id3='" + this.id3 + '\'' +
                ", id4='" + this.id4 + '\'' +
                ", id5='" + this.id5 + '\'' +
                '}';
    }
}
