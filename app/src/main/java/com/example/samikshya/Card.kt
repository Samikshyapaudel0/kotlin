package com.example.samikshya

import android.os.Bundle
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
//import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.samikshya.ui.theme.SamikshyaTheme
//import java.time.format.TextStyle


class Card : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold {innerPadding->
                Card(innerPadding)
            }
        }
    }
}

@Composable
fun Card(innerPadding: PaddingValues) {

    Column(
        modifier = Modifier.padding(innerPadding)
            .fillMaxSize()
//            .background(color = Color.Black)
    ) {
    }
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End,
        )
        {
            Image(
                painter = painterResource(R.drawable.download),
                contentDescription = null,


                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp).clip(
                        shape = RoundedCornerShape(100.dp)
                    )
            )

        }



    Column(
        modifier =
            Modifier.padding(
                horizontal = 10.dp,
                vertical = 60.dp
            )
    ){
        Text(text = "Card", style = TextStyle(
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 40.sp
        )
        )

        Text(text = "Simple and easy to use", style = TextStyle(
                fontWeight = FontWeight.Medium,
                color = Color.White,
                fontSize = 20.sp
        )
        )

    }



}

@Preview
@Composable
fun PreviewCard(){
    Card(innerPadding = PaddingValues(0.dp))
}
