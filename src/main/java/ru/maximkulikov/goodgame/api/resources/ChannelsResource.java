package ru.maximkulikov.goodgame.api.resources;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import com.mb3364.http.RequestParams;
import lombok.extern.slf4j.Slf4j;
import ru.maximkulikov.goodgame.api.handlers.DonationsResponseHandler;
import ru.maximkulikov.goodgame.api.handlers.PremiumsResponseHandler;
import ru.maximkulikov.goodgame.api.handlers.SubscriberResponseHandler;
import ru.maximkulikov.goodgame.api.models.DonationsContainer;
import ru.maximkulikov.goodgame.api.models.PremiumsContainer;
import ru.maximkulikov.goodgame.api.models.SubscrurersContainer;

/**
 * {@link ChannelsResource} предоставляет функциональность к ресурсам канала,
 * доступным по запросам к <code>/channel/</code>.
 *
 * @author Maxim Kulikov
 */
@Slf4j
public class ChannelsResource extends AbstractResource {

    private static final String PARAMETERS_NULL = "{} parameters are null";

    /**
     * @param baseUrl    Базовая ссылка для доступа к ресурсу
     * @param apiVersion Версия АПИ.
     */
    public ChannelsResource(final String baseUrl, final int apiVersion) {
        super(baseUrl, apiVersion);
    }

    /**
     * Список поддержки указанного канала.<br>
     * Требуется OAuth 2.0 аутентификация.<br>
     * Scope: channel.donations
     *
     * @param channel Channel ID or Channel Key
     * @param handler
     */
    public final boolean getDonations(final String channel, final DonationsResponseHandler handler) {
        if (channel == null) {
            log.error(PARAMETERS_NULL, getClass().getEnclosingMethod().getName());
            return false;
        }
        String url = String.format("%s/channel/%s/donations", getBaseUrl(), channel);
        this.configureHeaders();
        http.get(url, new GoodGameHttpResponseHandler(handler) {
            @Override
            public void onSuccess(final int statusCode, final Map<String, List<String>> headers, final String content) {
                try {
                    DonationsContainer value = objectMapper.readValue(content, DonationsContainer.class);
                    handler.onSuccess(value);
                } catch (IOException e) {
                    log.error("IOException {}", e.getLocalizedMessage());
                    handler.onFailure(e);
                }
            }
        });
        return true;
    }

    /**
     * Список поддержки указанного канала.<br>
     * Требуется OAuth 2.0 аутентификация.<br>
     * Scope: channel.donations
     *
     * @param channel Channel ID or Channel Key
     * @param params  Дополнительные параметры: page (номер страницы при постраничном выводе) и from_timestamp
     *                (timestamp, начиная с которого следует вернуть историю поддержки)
     * @param handler
     */
    public final boolean getDonations(final String channel, final RequestParams params,
                                      final DonationsResponseHandler handler) {
        if (channel == null || params == null) {
            log.error(PARAMETERS_NULL, getClass().getEnclosingMethod().getName());
            return false;
        }
        String url = String.format("%s/channel/%s/donations", getBaseUrl(), channel);
        this.configureHeaders();
        http.get(url, params, new GoodGameHttpResponseHandler(handler) {
            @Override
            public void onSuccess(final int statusCode, final Map<String, List<String>> headers, final String content) {
                try {
                    DonationsContainer value = objectMapper.readValue(content, DonationsContainer.class);
                    handler.onSuccess(value);
                } catch (IOException e) {
                    log.error("IOException {}", e.getLocalizedMessage());
                    handler.onFailure(e);
                }
            }
        });
        return true;
    }

    /**
     * Список премиум подписчиков указанного канала<br>
     * Требуется OAuth 2.0 аутентификация.<br>
     * Scope: channel.premiums
     *
     * @param channel Channel ID or Channel Key
     * @param handler
     */
    public final boolean getPremiums(final String channel, final PremiumsResponseHandler handler) {
        if (channel == null) {
            log.error(PARAMETERS_NULL, getClass().getEnclosingMethod().getName());
            return false;
        }
        String url = String.format("%s/channel/%s/premiums", getBaseUrl(), channel);

        this.configureHeaders();
        http.get(url, new GoodGameHttpResponseHandler(handler) {
            @Override
            public void onSuccess(final int statusCode, final Map<String, List<String>> headers, final String content) {
                try {
                    PremiumsContainer value = objectMapper.readValue(content, PremiumsContainer.class);
                    handler.onSuccess(value);
                } catch (IOException e) {
                    handler.onFailure(e);
                }
            }
        });
        return true;
    }

    /**
     * Список премиум подписчиков указанного канала<br>
     * Требуется OAuth 2.0 аутентификация.<br>
     * Scope: channel.premiums
     *
     * @param channel Channel ID or Channel Key
     * @param params  Дополнительные параметры: page (номер страницы) и from_timestamp (timestamp, начиная с которого
     *                выводить премиум подписчиков)
     * @param handler
     */
    public final boolean getPremiums(final String channel, final RequestParams params,
                                     final PremiumsResponseHandler handler) {
        if (channel == null || params == null) {
            log.error(PARAMETERS_NULL, getClass().getEnclosingMethod().getName());
            return false;
        }
        String url = String.format("%s/channel/%s/premiums", getBaseUrl(), channel);

        this.configureHeaders();
        http.get(url, params, new GoodGameHttpResponseHandler(handler) {
            @Override
            public void onSuccess(final int statusCode, final Map<String, List<String>> headers, final String content) {
                try {
                    PremiumsContainer value = objectMapper.readValue(content, PremiumsContainer.class);
                    handler.onSuccess(value);
                } catch (IOException e) {
                    handler.onFailure(e);
                }
            }
        });
        return true;
    }

    /**
     * Список подписчиков указанного канала<br>
     * Требуется OAuth 2.0 аутентификация. <br>
     * Scope: channel.subscriber
     *
     * @param channel Channel ID or Channel Key
     * @param handler
     */
    public final boolean getSubscribers(final String channel, final SubscriberResponseHandler handler) {
        if (channel == null) {
            log.error(PARAMETERS_NULL, getClass().getEnclosingMethod().getName());
            return false;
        }
        String url = String.format("%s/channel/%s/subscribers", getBaseUrl(), channel);

        this.configureHeaders();
        http.get(url, new GoodGameHttpResponseHandler(handler) {
            @Override
            public void onSuccess(final int statusCode, final Map<String, List<String>> headers, final String content) {
                try {
                    SubscrurersContainer value = objectMapper.readValue(content, SubscrurersContainer.class);
                    handler.onSuccess(value);
                } catch (IOException e) {
                    handler.onFailure(e);
                }
            }
        });
        return true;
    }

    /**
     * Список подписчиков указанного канала<br>
     * Требуется OAuth 2.0 аутентификация. <br>
     * Scope: channel.subscriber
     *
     * @param channel Channel ID or Channel Key
     * @param params  Дополнительные параметры: page (номер страницы при постраничном выводе) и from_timestamp
     *                (timestamp, начиная с которого следует вернуть подписчиков канала)
     * @param handler
     */
    public final boolean getSubscribers(final String channel, final RequestParams params,
                                        final SubscriberResponseHandler handler) {
        if (channel == null || params == null) {
            log.error(PARAMETERS_NULL, getClass().getEnclosingMethod().getName());
            return false;
        }
        String url = String.format("%s/channel/%s/subscribers", getBaseUrl(), channel);

        this.configureHeaders();
        http.get(url, params, new GoodGameHttpResponseHandler(handler) {
            @Override
            public void onSuccess(final int statusCode, final Map<String, List<String>> headers, final String content) {
                try {
                    SubscrurersContainer value = objectMapper.readValue(content, SubscrurersContainer.class);
                    handler.onSuccess(value);
                } catch (IOException e) {
                    handler.onFailure(e);
                }
            }
        });
        return true;
    }
}
