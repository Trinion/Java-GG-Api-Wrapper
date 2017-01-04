package com.mb3364.twitch.api.auth.grants.implicit;

/**
 * Interface for listening to twitch.tv authentication
 * access tokens
 */
public interface AuthenticationListener {
    /**
     * Called when a twitch.tv authentication access token has been received.
     *
     * @param token twitch.tv authentication access token
     */
    void onAccessTokenReceived(String token, String state);

    /**
     * An authentication error occurred.
     * Usually due to user denying the request.
     *
     * @param error       Error name
     * @param description Error description
     */
    void onAuthenticationError(String error, String description);
}
