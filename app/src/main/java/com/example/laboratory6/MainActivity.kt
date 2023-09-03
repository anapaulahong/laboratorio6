package com.example.laboratory6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.tooling.preview.Preview
import com.example.laboratory6.ui.theme.Laboratory6Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratory6Theme {
                // A surface container using the 'background' color from the theme
                Surface(color = Color.White) {
                    Login("")
                }
            }
        }
    }
}

@Composable
fun Login(name: String, modifier: Modifier = Modifier) {
    val username by remember {
         mutableStateOf("")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Laboratory6Theme {
        Login("Android")
    }
}