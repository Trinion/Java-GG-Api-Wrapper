package ru.maximkulikov.goodgame.api.chatmodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Java-GoodGame-Api-Wrapper
 * Created by maxim on 09.01.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChatUser implements ResChatObject {

    private String id;

    private String name;

    private Long right;

    private Boolean premium;

    private String payments;

    private Boolean mobile;

    private Boolean hidden;

    public final Boolean getHidden() {
        return this.hidden;
    }

    public final void setHidden(final Boolean hidden) {
        this.hidden = hidden;
    }

    public final String getId() {
        return this.id;
    }

    public final void setId(final String id) {
        this.id = id;
    }

    public final Boolean getMobile() {
        return this.mobile;
    }

    public final void setMobile(final Boolean mobile) {
        this.mobile = mobile;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(final String name) {
        this.name = name;
    }

    public final String getPayments() {
        return this.payments;
    }

    public final void setPayments(final String payments) {
        this.payments = payments;
    }

    public final Boolean getPremium() {
        return this.premium;
    }

    public final void setPremium(final Boolean premium) {
        this.premium = premium;
    }

    public final Long getRight() {
        return this.right;
    }

    public final void setRight(final Long right) {
        this.right = right;
    }

    @Override
    public final String toString() {
        return "ChatUser{" +
                "id='" + this.id + '\'' +
                ", name='" + this.name + '\'' +
                ", right=" + this.right +
                ", premium=" + this.premium +
                ", payments='" + this.payments + '\'' +
                ", mobile=" + this.mobile +
                ", hidden=" + this.hidden +
                '}';
    }
}