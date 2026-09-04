package com.example.petshop

class HappyMood(date: String) : Mood(date) {
    override fun describeMood(): String {
        return "Feeling happy!"
    }
}