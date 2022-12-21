package com.example.core.domain.model

sealed class ActivityLevel(val level: String) {
    object Low: ActivityLevel("low")
    object Medium: ActivityLevel("medium")
    object High: ActivityLevel("high")

    companion object {
        fun fromString(level: String): ActivityLevel {
            return when(level) {
                "lose_weight" -> Low
                "keep_weight" -> Medium
                "gain_weight" -> High
                else -> Medium
            }
        }
    }
}
