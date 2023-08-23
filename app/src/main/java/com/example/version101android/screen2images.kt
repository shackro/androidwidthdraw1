package com.example.version101android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.version101android.ui.theme.Version101ANDROIDTheme

class screen2images : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            myimage()
        }
    }
}

@Composable
fun myimage()
{
    Column(
        modifier = Modifier.fillMaxSize().padding(10.dp)
    )
    {

        Text(text = "SHACKRO HAS DOGS  ",
        fontSize = 22.sp,
        color = Color.Black,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.padding(start = 35.dp),
            fontWeight = FontWeight.Bold,



            )

        Spacer(modifier = Modifier.height(20.dp))
//first row
        Row {
            Image(painter = painterResource(id = R.drawable.sherpard),
                contentDescription = "germany sherpard one",
                //intagrade width and hieght
                modifier = Modifier.size(200.dp,150.dp),

                )
            Column {
                Text(text = "German sherphard",
                    fontSize = 20.sp,

                    )
                Text(text = "this is the most used animal for security and detection of crime related situations.",
                fontSize = 16.sp,
                    color =Color.Red,
                fontFamily = FontFamily.Cursive
                    )
                Image(
                    painter = painterResource(id = R.drawable.puppybool),
                    contentDescription ="young one",
                    modifier = Modifier.size(150.dp,50.dp),
                )
            }}
        Spacer(modifier = Modifier.height(20.dp))

        //second row
            Row {
                Image(painter = painterResource(id = R.drawable.sherpard2),
                    contentDescription = "germany sherpard two",
                    //intagrade width and hieght
                    modifier = Modifier.size(200.dp,150.dp),

                    )
                Column {
                    Text(text = "American sherphard",
                        fontSize = 20.sp,

                        )
                    Text(text = "this is the most used animal for security and detection of crime related situations.",
                        fontSize = 16.sp,
                        color =Color.Red,
                        fontFamily = FontFamily.Cursive
                    )
                    Image(
                        painter = painterResource(id = R.drawable.puppybool),
                        contentDescription ="young one",
                        modifier = Modifier.size(150.dp,50.dp),
                    )
                }}
        Spacer(modifier = Modifier.height(20.dp))

        //third row
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.bulldog),
                        contentDescription = "bulldog",
                        //intagrade width and hieght
                        modifier = Modifier.size(90.dp),

                        )
                    Column {
                        Text(
                            text = "Bull DOG",
                            fontSize = 20.sp,

                            )
                        Text(
                            text = "this is the most used animal for security and detection of crime related situations.",
                            fontSize = 16.sp,
                            color = Color.Red,
                            fontFamily = FontFamily.Cursive
                        )
                        Image(
                          painter = painterResource(id = R.drawable.puppybool),
                            contentDescription ="young one",
                           modifier = Modifier.size(150.dp,50.dp),
                        )
                    }
                }
        Spacer(modifier = Modifier.height(40.dp))

            Image(painter = painterResource(id = R.drawable.sherpard2),
                contentDescription = "germany sherpard one",
                //intagrade width and hieght
                modifier = Modifier.size(350.dp,150.dp).clip(shape = CircleShape),
                contentScale = ContentScale.Crop
                )
            


    }
}

@Preview(showBackground = true)
@Composable
fun previewimage()
{
    myimage()
}