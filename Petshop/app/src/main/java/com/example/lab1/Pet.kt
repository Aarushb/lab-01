package com.example.lab1

abstract class Pet(val name: String, var age: Int) {
    abstract fun speak(): String
}