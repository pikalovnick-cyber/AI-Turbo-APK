
package com.turbo.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { App() }
    }
}

@Composable
fun App() {
    var fps by remember { mutableStateOf(60) }

    LaunchedEffect(Unit) {
        while (true) {
            fps = (30..60).random()
            kotlinx.coroutines.delay(1000)
        }
    }

    Text("🎮 AI TURBO")
    Text("FPS: $fps")
}
