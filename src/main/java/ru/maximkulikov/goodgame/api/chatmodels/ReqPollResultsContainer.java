package ru.maximkulikov.goodgame.api.chatmodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Maxim Kulikov
 * @since 11.01.2017
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReqPollResultsContainer implements ReqChatObject {

    private String type = "get_poll_results";

    private ReqGetPoll data;

    /**
     * @param channelId channel_id
     */
    public ReqPollResultsContainer(final String channelId) {
        this.data = new ReqGetPoll(channelId);
    }

    public final ReqGetPoll getData() {
        return this.data;
    }

    public final void setData(final ReqGetPoll data) {
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
        return "ReqPollResultsContainer{" +
                "type='" + this.type + '\'' +
                ", data=" + this.data +
                '}';
    }
}
