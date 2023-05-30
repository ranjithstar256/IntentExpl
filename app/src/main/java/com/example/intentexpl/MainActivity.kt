package com.example.intentexpl

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.ContentInfoCompat.Flags
import com.example.intentexpl.ui.theme.IntentExplTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IntentExplTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //var min =Intent(this@MainActivity, MainActivity2::class.java)
                    Greeting(applicationContext)
                }
            }
        }
    }
}

@Composable
fun Greeting(contxt: Context) {
    Column() {

        Button(onClick = {
            var min =Intent(contxt, MainActivity2::class.java)

            min.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            min.putExtra("firstdata","ranjith")
            min.putExtra("seconddata","chennai")
            min.putExtra("tech","android")

            contxt.startActivity(min)

        }) {
            Text(text = "go to next")
        }
    }
}

 