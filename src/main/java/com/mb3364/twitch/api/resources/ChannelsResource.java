package com.mb3364.twitch.api.resources;

import com.mb3364.http.RequestParams;
import com.mb3364.twitch.api.handlers.DonationsResponseHandler;
import com.mb3364.twitch.api.handlers.PremiumsResponseHandler;
import com.mb3364.twitch.api.handlers.SubscriberResponseHandler;
import com.mb3364.twitch.api.models.DonationsContainer;
import com.mb3364.twitch.api.models.PremiumsContainer;
import com.mb3364.twitch.api.models.SubscrurersContainer;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * The {@link ChannelsResource} provides the functionality
 * to access the <code>/channels</code> endpoints of the Twitch API.
 *
 * @author Matthew Bell
 */
public class ChannelsResource extends AbstractResource {

    /**
     * Construct the resource using the Twitch API base URL and specified API version.
     *
     * @param baseUrl    the base URL of the Twitch API
     * @param apiVersion the requested version of the Twitch API
     */
    public ChannelsResource(String baseUrl, int apiVersion) {
        super(baseUrl, apiVersion);
    }

    public void getSubscribers(final String channel, final SubscriberResponseHandler handler) {
        String url = String.format("%s/channel/%s/subscribers", getBaseUrl(), channel);


        http.get(url, new GoodGameHttpResponseHandler(handler) {
            @Override
            public void onSuccess(int statusCode, Map<String, List<String>> headers, String content) {
                try {
                    SubscrurersContainer value = objectMapper.readValue(content, SubscrurersContainer.class);
                    handler.onSuccess(value);
                } catch (IOException e) {
                    handler.onFailure(e);
                }
            }
        });
    }

    public void getSubscribers(final String channel, final RequestParams params, final SubscriberResponseHandler handler) {
        String url = String.format("%s/channel/%s/subscribers", getBaseUrl(), channel);


        http.get(url, params, new GoodGameHttpResponseHandler(handler) {
            @Override
            public void onSuccess(int statusCode, Map<String, List<String>> headers, String content) {
                try {
                    SubscrurersContainer value = objectMapper.readValue(content, SubscrurersContainer.class);
                    handler.onSuccess(value);
                } catch (IOException e) {
                    handler.onFailure(e);
                }
            }
        });
    }

    public void getPremiums (final String channel, final PremiumsResponseHandler handler) {
        String url = String.format("%s/channel/%s/premiums", getBaseUrl(), channel);

        http.get(url, new GoodGameHttpResponseHandler(handler) {
            @Override
            public void onSuccess(int statusCode, Map<String, List<String>> headers, String content) {
                try {
                    PremiumsContainer value = objectMapper.readValue(content, PremiumsContainer.class);
                    handler.onSuccess(value);
                } catch (IOException e) {
                    handler.onFailure(e);
                }
            }
        });
    }

    public void getPremiums (final String channel, final RequestParams params, final PremiumsResponseHandler handler) {
        String url = String.format("%s/channel/%s/premiums", getBaseUrl(), channel);

        http.get(url, params, new GoodGameHttpResponseHandler(handler) {
            @Override
            public void onSuccess(int statusCode, Map<String, List<String>> headers, String content) {
                try {
                    PremiumsContainer value = objectMapper.readValue(content, PremiumsContainer.class);
                    handler.onSuccess(value);
                } catch (IOException e) {
                    handler.onFailure(e);
                }
            }
        });
    }

    public void getDonations (final String channel, final DonationsResponseHandler handler) {
        String url = String.format("%s/channel/%s/donations", getBaseUrl(), channel);
        http.get(url, new GoodGameHttpResponseHandler(handler) {
            @Override
            public void onSuccess(int statusCode, Map<String, List<String>> headers, String content) {
                try {
                    DonationsContainer value = objectMapper.readValue(content, DonationsContainer.class);
                    handler.onSuccess(value);
                } catch (IOException e) {
                    handler.onFailure(e);
                }
            }
        });
    }

    public void getDonations (final String channel, final RequestParams params, final DonationsResponseHandler handler) {
        String url = String.format("%s/channel/%s/donations", getBaseUrl(), channel);
        http.get(url, params, new GoodGameHttpResponseHandler(handler) {
            @Override
            public void onSuccess(int statusCode, Map<String, List<String>> headers, String content) {
                try {
                    DonationsContainer value = objectMapper.readValue(content, DonationsContainer.class);
                    handler.onSuccess(value);
                } catch (IOException e) {
                    handler.onFailure(e);
                }
            }
        });
    }





}
