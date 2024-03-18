package com.geanbrandao.br.learnig.bottomnavigation.animation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.geanbrandao.br.learnig.bottomnavigation.animation.navigation.Screen
import com.geanbrandao.br.learnig.bottomnavigation.animation.presentation.bottomnavigationbar.BottomBar
import com.geanbrandao.br.learnig.bottomnavigation.animation.ui.theme.BottomNavigationAnimationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var currentRoute by remember { mutableStateOf(Screen.Home.route) }
            BottomNavigationAnimationTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = {
                        BottomBar(
                            currentRoute = currentRoute,
                            onNavigate = {
                                currentRoute = it
                            }
                        )
                    }
                ) { innerPadding ->
                    Greeting(
                        name = currentRoute,
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
        text = "Screen $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BottomNavigationAnimationTheme {
        Greeting("Home")
    }
}