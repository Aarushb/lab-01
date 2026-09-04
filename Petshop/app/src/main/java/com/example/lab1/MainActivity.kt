package com.example.lab1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab1.ui.theme.Lab1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val cat = Cat("Coco", 6)
        val dog = Dog("Mochi", 6)
        val scorpion = Scorpion("Stinger", 32)

        // List of all pets
        val pets = mutableListOf(cat, dog, scorpion)

        // List of only pettable pets (Cat and Dog)
        val pettablePets = mutableListOf<Pettable>(cat, dog)

        // Participation Exercise Instantiation
        val todayMood = HappyMood("2026-09-04")
        enableEdgeToEdge()
        setContent {
            Lab1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
        fun GreetingPreview() {
            Lab1Theme {
                Greeting("Android")
            }
        }