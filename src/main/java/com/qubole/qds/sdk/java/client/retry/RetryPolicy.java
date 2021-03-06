package com.qubole.qds.sdk.java.client.retry;

import org.glassfish.jersey.client.ClientResponse;
import java.net.URI;

/**
 * Functor to determine what is or isn't retry-able
 */
public interface RetryPolicy
{
    public enum Mode
    {
        RETRY_ALL,
        RETRY_CONNECTION_ONLY
    }

    /**
     * Return true if the given arguments require a retry
     *
     * @param uri request URI
     * @param retryCount 0 based retry count
     * @param response the client response (might be null)
     * @param exception any exception (might be null)
     * @param mode retry mode
     * @return true/false
     */
    public boolean shouldBeRetried(URI uri, int retryCount, ClientResponse response, Throwable exception, Mode mode);
}
