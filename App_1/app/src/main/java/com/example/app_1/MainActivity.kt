package com.example.app_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app_1.ui.theme.App_1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App_1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    jetpackScreen()
                }
            }
        }
    }
}

@Composable
fun jetpackScreen() {
    jetpackImageAndText()
}

@Composable
fun jetpackImageAndText(modifier: Modifier = Modifier) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {

        Image(
            painter = painterResource(id = R.drawable.jetpackcomposeicon),
            contentDescription = "Jetpack Logo"
        )
        Text(
            text = stringResource(id = R.string.Mandar),
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                color = Color.Blue,
                textAlign = TextAlign.Center
            )
        )
        Spacer(modifier = modifier.height(20.dp))
        Text(
            text = "❤",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 50.sp,
                color = Color.Red,
                textAlign = TextAlign.Center,
            )

        )
        Text(
            text = stringResource(id = R.string.Jetpack),
            color = Color(8, 48, 66, 255),
            style = TextStyle(fontSize = 45.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(21.dp)
        )


    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    App_1Theme {
        jetpackImageAndText()
    }
}