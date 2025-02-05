package com.example.jetpagerfull

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
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpagerfull.ui.theme.JetpagerfullTheme

class MainActivity : ComponentActivity() {

    companion object{
        val dataImage = listOf(
            DataImage(
                title = "Item 1",
                image = R.drawable.rock
            ),
            DataImage(
                title = "Item 2",
                image = R.drawable.rock
            ),
            DataImage(
                title = "Item 3",
                image = R.drawable.rock
            ),
            DataImage(
                title = "Item 4",
                image = R.drawable.rock
            ),
            DataImage(
                title = "Item 5",
                image = R.drawable.rock
            ),
            DataImage(
                title = "Item 6",
                image = R.drawable.rock
            ),
            DataImage(
                title = "Item 7",
                image = R.drawable.rock
            ),
            DataImage(
                title = "Item 8",
                image = R.drawable.rock
            ),
            DataImage(
                title = "Item 9",
                image = R.drawable.rock
            ),
            DataImage(
                title = "Item 10",
                image = R.drawable.rock
            )
        )
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpagerfullTheme {
                MainScreen()
            }
        }
    }
}

