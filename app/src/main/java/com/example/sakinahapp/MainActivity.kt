package com.example.sakinahapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sakinahapp.ui.theme.SakinahAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SakinahAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    SakinahInfo()
                }
            }
        }
    }
}

@Composable
fun SakinahInfo(modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.TopCenter,
        modifier = modifier
            .fillMaxSize()
            .padding(top = 100.dp)

    ) {
        Image(
            painter = painterResource(R.drawable.logo_hsi_sakinah),
            contentDescription = null,
            modifier = modifier
        )
    }

     Box() {

         Image(
             painter = painterResource(R.drawable.bg_list_hsi),
             contentDescription = null,
             modifier = modifier
                 .padding(top = 200.dp, start = 20.dp, end = 20.dp)
                 .size(450.dp)
                 .clip(RoundedCornerShape(20.dp))
         )
         Column(
             verticalArrangement = Arrangement.Top,
             horizontalAlignment = Alignment.CenterHorizontally,
             modifier = modifier
                 .fillMaxWidth()
                 .fillMaxHeight()
                 .padding(top = 200.dp)
         ) {
             Text(
                 text = stringResource(R.string.judul),
                 fontWeight = FontWeight.Bold,
                 fontSize = 20.sp,
                 color = Color.Black,
                 modifier = modifier
                     .padding(10.dp)
             )
             Text(
                 text = stringResource(R.string.deskripsi),
                 fontSize = 15.sp,
                 color = Color.Black,
                 textAlign = TextAlign.Center,
                 modifier = modifier
                     .padding(top = 10.dp, start = 30.dp, end = 30.dp)
             )
         }
         Row(
             horizontalArrangement = Arrangement.SpaceEvenly,
             verticalAlignment = Alignment.Top,
             modifier = modifier
                 .fillMaxWidth()
                 .padding(top = 580.dp)
         ) {
             Button(onClick = { /*TODO*/ }) {
                 Text(text = "Lewati")
             }
             Button(onClick = { /*TODO*/ }) {
                 Text(text = "Isi CV")
             }
         }
     }
         Row(
             horizontalArrangement = Arrangement.SpaceEvenly,
             verticalAlignment = Alignment.Bottom,
             modifier = Modifier
                 .fillMaxWidth()
                 .padding(8.dp)
         ) {
             Column(
                 verticalArrangement = Arrangement.Center,
                 horizontalAlignment = Alignment.CenterHorizontally,
                 modifier = modifier
                     .weight(1f)
             ) {
                 Image(
                     painter = painterResource(R.drawable.icon_home_hsi),
                     contentDescription = null,
                     modifier = modifier
                         .size(40.dp)
                         .aspectRatio(1f)
                 )

             }
             Column(
                 verticalArrangement = Arrangement.Center,
                 horizontalAlignment = Alignment.CenterHorizontally,
                 modifier = modifier
                     .weight(1f)
             ) {
                 Image(
                     painter = painterResource(R.drawable.icon_pencarian_hsi),
                     contentDescription = null,
                     modifier = modifier
                         .size(40.dp)
                         .aspectRatio(1f)
                 )
             }
             Column(
                 verticalArrangement = Arrangement.Center,
                 horizontalAlignment = Alignment.CenterHorizontally,
                 modifier = modifier
                     .weight(1f)
             ) {
                 Image(
                     painterResource(R.drawable.icon_profil_hsi),
                     contentDescription = null,
                     modifier = modifier
                         .size(40.dp)
                         .aspectRatio(1f)
                 )
             }
         }
     }



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SakinahAppTheme {
        SakinahInfo()
    }
}