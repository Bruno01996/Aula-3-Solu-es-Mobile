package com.example.lista_contatos_aula_3_jetpackcompose

import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lista_contatos_aula_3_jetpackcompose.ui.theme.Lista_contatos_Aula_3_JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lista_contatos_Aula_3_JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxWidth(), color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }

    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {

        Column {


            Column {

                Row(
                    modifier = Modifier.fillMaxWidth().padding(end = 25.dp),
                    horizontalArrangement = Arrangement.End

                ) {
                        Text("0", style = TextStyle(fontSize = 24.sp))
                    }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    ElevatedButton(onClick = { }) {
                        Text("AC")
                    }
                    ElevatedButton(onClick = { }) {
                        Text("( )", style = TextStyle(fontSize = 18.sp))
                    }
                    ElevatedButton(onClick = { }) {
                        Text("%")
                    }
                    ElevatedButton(onClick = { }) {
                        Text("%")
                    }
                }
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ){
                    ElevatedButton(onClick = { }) {
                        Text("1", style = TextStyle(fontSize = 18.sp))
                    }
                    ElevatedButton(onClick = { }) {
                        Text("2", style = TextStyle(fontSize = 18.sp))
                    }
                    ElevatedButton(onClick = { }) {
                        Text("3", style = TextStyle(fontSize = 18.sp))
                    }
                    ElevatedButton(onClick = { }) {
                        Text("X", style = TextStyle(fontSize = 18.sp))
                    }
                }
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ){
                    ElevatedButton(onClick = { }) {
                        Text("4", style = TextStyle(fontSize = 18.sp))
                    }
                    ElevatedButton(onClick = { }) {
                        Text("5", style = TextStyle(fontSize = 18.sp))
                    }
                    ElevatedButton(onClick = { }) {
                        Text("6", style = TextStyle(fontSize = 18.sp))
                    }
                    ElevatedButton(onClick = { }) {
                        Text("-", style = TextStyle(fontSize = 18.sp))
                    }
                }
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ){
                    ElevatedButton(onClick = { }) {
                        Text("7", style = TextStyle(fontSize = 18.sp))
                    }
                    ElevatedButton(onClick = { }) {
                        Text("8", style = TextStyle(fontSize = 18.sp))
                    }
                    ElevatedButton(onClick = { }) {
                        Text("9", style = TextStyle(fontSize = 18.sp))
                    }
                    ElevatedButton(onClick = { }) {
                        Text("+", style = TextStyle(fontSize = 18.sp))
                    }
                }
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ){
                    ElevatedButton(onClick = { }) {
                        Text("0", style = TextStyle(fontSize = 18.sp))
                    }
                    ElevatedButton(onClick = { }) {
                        Text(",", style = TextStyle(fontSize = 18.sp))
                    }
                    ElevatedButton(onClick = { }) {
                        Text("<x", style = TextStyle(fontSize = 18.sp))
                    }
                    ElevatedButton(onClick = { }) {
                        Text("=", style = TextStyle(fontSize = 18.sp))
                    }

                }


            }


        }
    }

    fun onClick() {
        Log.d("tag", "mensagem")
    }


    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        Lista_contatos_Aula_3_JetpackComposeTheme {
            Greeting("Vindo")
        }
    }
}