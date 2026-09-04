package com.example.petshop

abstract class Mood(val date: String) {
    abstract fun describeMood(): String

    fun getSummary(): String {
        return "On $date: ${describeMood()}"
    }
}