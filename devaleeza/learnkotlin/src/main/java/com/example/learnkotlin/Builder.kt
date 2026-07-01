package com.learning.learnkotlin

data class NotificationSettings(val enabled: Boolean = false, val subscriptions: List<Subscription> = emptyList())

data class Subscription(val destination: Destination, val topic: Topic, val frequency: Frequency) {
    enum class Topic { NEWS, ANALYTICS, SECURITY_ALERTS }
    enum class Frequency { IMMEDIATELY, DAILY, WEEKLY }
}

sealed interface Destination

@JvmInline value class EmailAddress(val value: String) : Destination
@JvmInline value class PhoneBox(val value: String) : Destination

fun notificationSettings(block: NotificationSettingsBuilder.() -> Unit) =
    NotificationSettingsBuilder().apply(block).build()

class NotificationSettingsBuilder {
    var enabled: Boolean = false
    private val subscriptions = mutableListOf<Subscription>()

    fun send(topicToDestination: Pair<Subscription.Topic, Destination>, frequency: Subscription.Frequency) {
        val (topic, destination) = topicToDestination
        subscriptions.add(Subscription(destination, topic, frequency))
    }

    fun build(): NotificationSettings = NotificationSettings(enabled, subscriptions.toList())
}

fun main() {
    createNotificationSettings(EmailAddress("example@example.com"), null)
}

fun createNotificationSettings(email: EmailAddress?, phone: PhoneBox?): NotificationSettings {
    val settings = notificationSettings {
        enabled = true

        if (email != null) send(Subscription.Topic.ANALYTICS to email, Subscription.Frequency.DAILY)
        if (email != null) send(Subscription.Topic.NEWS to email, Subscription.Frequency.WEEKLY)
        if (phone != null) send(Subscription.Topic.SECURITY_ALERTS to phone, Subscription.Frequency.IMMEDIATELY)
    }

    return settings
}