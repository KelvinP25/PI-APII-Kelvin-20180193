package com.example.pi_api_kelvin_20180193

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pi_api_kelvin_20180193.ui.theme.PIAPIKelvin20180193Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PIAPIKelvin20180193Theme {
               MyApp()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyApp(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PIAPIKelvin20180193Theme {
        MyApp()
    }
}