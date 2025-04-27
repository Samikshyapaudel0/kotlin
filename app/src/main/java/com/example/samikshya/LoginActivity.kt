package com.example.samikshya

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.samikshya.ui.theme.SamikshyaTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold {innerPadding->
                LoginBody(innerPadding)
                }


            }

        }


    }



@Composable
fun LoginBody(innerPadding: PaddingValues){

    Column(
        modifier = Modifier.
        padding(innerPadding)
            .fillMaxSize()
            .background(color= Color.White )
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Absolute.SpaceBetween
        ) {

//method1
            Icon(
                imageVector = Icons.Default.KeyboardArrowLeft,
                contentDescription = null,
                tint = Color.Green,
                modifier = Modifier
                    .height(30.dp)
                    .width(30.dp)
            )

            Text(
                text = "Andrew",
                style = TextStyle(
                    fontStyle = FontStyle.Italic,
                    fontSize = 15.sp,
                )

            )

//method2
            Icon(
                painter = painterResource(R.drawable.baseline_more_horiz_24),
                contentDescription = null,
                tint = Color.Black,
                modifier = Modifier
                    .height(30.dp).width(30.dp)
            )
        }


        Row (modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround,)
        {
            Image(
                painter = painterResource(R.drawable.insta),
                contentDescription = null,
                contentScale = ContentScale.Crop,

                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp).clip(
                        shape = RoundedCornerShape(100.dp)
                    )
            )


            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

            )
            {
                Text(text ="174" )
                Text(text = "Posts")
            }
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text ="770k" )
                Text(text = "Followers")

            }
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "173")
                Text(text = "Following")
            }
        }
        Column(
            modifier =
                Modifier.padding(
                    horizontal = 10.dp,
                    vertical = 15.dp
                )
        ){
            Text("Andrew Queo", style = TextStyle(
                fontWeight = FontWeight.Bold,
                color = Color.Red,
                fontSize = 19.sp
            )
            )
            Text("Artist", modifier = Modifier.alpha(0.5f))
            Text("DESIGNER")
            Text("isabella@art.design")
            Text("Followed by jenna and anna")
        }
//        Row{
//            Button(
//                onClick = {
//                    // user le button Thiche paxi ke garne to-do
//                    //when clicked
//                },
//                shape = RoundedCornerShape(10.dp),
//                colors = ButtonDefaults.buttonColors(
//                    containerColor = Color.Blue,
//                    contentColor = Color.White
//                )
//            ){
//                Text("Follow")
//            }
//        }

    }

}







@Preview
@Composable
fun PreviewBody(){
    LoginBody(innerPadding = PaddingValues(0.dp))
}


