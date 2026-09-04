package com.example.lab1

abstract class Mood(val date: String) {
    abstract fun getMoodString(): String
}

class HappyMood(date: String) : Mood(date) {
    override fun getMoodString(): String {
        return "I am feeling very happy today!"
    }
}

class SadMood(date: String) : Mood(date) {
    override fun getMoodString(): String {
        return "I am feeling a bit down today."
    }
}