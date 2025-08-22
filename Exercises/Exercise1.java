//BSIT - 3B Exercise # 1 ITELEC1
//Galleto, Angel Avril S.
package com.example.my1stgreetingapp

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
import com.example.my1stgreetingapp.ui.theme.MY1STGREETINGAPPTheme


import androidx.compose.ui.graphics.Color
import androidx.compose.material3.Surface


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MY1STGREETINGAPPTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding))

                } } } } }



//statement of the Greeting & Color
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(color = Color.Yellow) {
        Text(
            text = "Hi! I'm glad your here, $name!",
            modifier = modifier
        )
    } }

//name to be displayed & background
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MY1STGREETINGAPPTheme {
        Greeting("Suzu")

    }}
