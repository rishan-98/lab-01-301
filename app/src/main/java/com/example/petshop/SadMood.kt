package com.example.petshop

class SadMood(date: String) : Mood(date) {
    override fun describeMood(): String {
        return "Feeling sad."
    }
}