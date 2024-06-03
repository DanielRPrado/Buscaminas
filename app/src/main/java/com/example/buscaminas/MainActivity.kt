package com.example.buscaminas

import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.buscaminas.ui.theme.BuscaminasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BuscaminasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    buscaMinas("Android")
                }
            }
        }
    }
}

@Composable
fun buscaMinas(name: String, modifier: Modifier = Modifier) {


    val filas = 10
    val columnas = 6

    val listaBotones = remember {
        List(filas * columnas) { mutableListOf(true)}
    }
    Column (modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween){
        for (i in 0  until  filas)
        {
            Row (modifier = Modifier.fillMaxSize().weight(.1f)){
                for (j in 0 until columnas){
                    Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxSize().weight(.1f), shape = androidx.compose.ui.graphics.Shape) {
                        Text(text = "0")
                    }
                }
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BuscaminasTheme {
        buscaMinas("Android")
    }
}