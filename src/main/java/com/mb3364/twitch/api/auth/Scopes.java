package com.mb3364.twitch.api.auth;

/**
  *
 * Когда ваше приложение запрашивает доступ у пользователя Goodgame, в параметре scope вы должны указать список прав,
 * разделенных пробелом, которые нужны вашему приложению.
 * Указывайте только те scope, которые действительно нужны вашему приложению.
 *
 */
public enum Scopes {

    /**
     * Список подписчиков указанного канала. Необходим для получения списка подписчиков канала пользователя
     */
    CHANNEL_SUBSCRIBERS("channel.subscribers"),

    /**
     * Список премиум подписчиков указанного канала.
     * Необходим для получения списка премиум подписчиков (актуально только для премиум плееров)
     */
    CHANNEL_PREMIUMS("channel.premiums"),

    /**
     * Список поддержки указанного канала.
     * Необходим для получения истории доната.
     */
    CHANNEL_DONATIONS ("channel.donations"),

    /**
     * Получение токена чата для конкретного пользователя. Id-пользователя определяется из Access Token'a.
     * Необходим для получения токена чата и токена для сервера уведомлений
     */
    CHAT_TOKEN ("chat.token"),

    /**
     * Необходим для получения списка всех избранных стримов пользователя.
     */
    USER_FAVORITE ("user.favorites");



    private String key;

    Scopes(String key) {
        this.key = key;
    }

    /**
     * Combine <code>Scopes</code> into a '+' separated <code>String</code>.
     * This is the required input format for twitch.tv
     *
     * @param scopes <code>Scopes</code> to combine.
     * @return <code>String</code> representing '+' separated list of <code>Scopes</code>
     */
    public static String join(Scopes... scopes) {
        if (scopes == null) return "";
        StringBuilder sb = new StringBuilder();
        for (Scopes scope : scopes) {
            sb.append(scope.getKey()).append("%20");
        }
        return sb.toString();
    }

    /**
     * Convert the string representation of the Scope to the Enum.
     *
     * @param text Text representation of Enum value
     * @return Enum value that the text represents
     */
    public static Scopes fromString(String text) {
        if (text == null) return null;
        for (Scopes b : Scopes.values()) {
            if (text.equalsIgnoreCase(b.key)) {
                return b;
            }
        }
        return null;
    }

    /**
     * Get the identifier that twitch will recognize.
     *
     * @return A <code>String</code> identifier
     */
    public String getKey() {
        return key;
    }

    @Override
    public String toString() {
        return key;
    }
}
