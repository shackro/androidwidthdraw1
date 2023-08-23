package com.example.version101android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.version101android.ui.theme.Version101ANDROIDTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            view()


        }
    }
}

@Composable
fun view(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)){
        Text(text = "Shackro ",
            fontSize = 40.sp,
            color = Color.Red,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.padding(start = 20.dp),
        )
            Text(text = "shackro @new android style....",
                fontSize = 12.sp,
                color = Color.Black,
                fontFamily = FontFamily.Serif,
            )
            Text(text = "welcome to mit class current topic ...",
                fontSize = 10.sp,
                color = Color.Black,
                fontFamily = FontFamily.Serif,)
        Row() {
            Text(
                text = "Welcome to Android Programming",
                color = Color.Blue,
                fontFamily = FontFamily.Cursive,
                fontSize = 16.sp
            )
            Text(text = "This is Shackro's First App",
                color = Color.Green
            )
        }

        Spacer(modifier = Modifier.height(40.dp))
Row() {
    Button(
        onClick = { /*TODO*/ },
        shape = RectangleShape,
        modifier = Modifier.padding(start = 20.dp),
        colors =  ButtonDefaults.buttonColors(Color.DarkGray
        )
    ) {
        Text(text = "click me")

    }

    Button(onClick = { /*TODO*/ },
        shape = CutCornerShape(5.dp),
        modifier = Modifier.padding(start = 20.dp),


        ) {
        Image(painter = painterResource(id = R.drawable.add), contentDescription = "",
            modifier = Modifier
                .size(20.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop,

            )

        Text( text= "add to cart",
            modifier =Modifier.padding(start = 10.dp))

    }

}

        Button(
            onClick = { /*TODO*/ },
            shape = CircleShape,
            modifier = Modifier.padding(start = 40.dp),
            colors =  ButtonDefaults.buttonColors(Color.DarkGray
            )
        ) {
            Text(text = "background color")

        }
        }

}

@Preview(showBackground = true)
@Composable
fun viewdemo(){
    view()
}