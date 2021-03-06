package io.kotlin.stomp.client

import io.hotmoka.network.thin.client.webSockets.StompClient

/**
 * A subscription to a webSocket topic, can be used to unsubscribe from the topic.
 */
class Subscription(
    val topic: String,
    val subscriptionId: String,
    private val stompClient: StompClient
) {

    /**
     * It unsubscribes from the topic.
     */
    fun unsubscribe() {
        stompClient.unsubscribeFrom(topic)
    }
}