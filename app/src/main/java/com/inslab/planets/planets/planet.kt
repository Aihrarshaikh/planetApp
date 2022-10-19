package com.inslab.planets.planets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.inslab.planets.ui.theme.Satoshi

@Composable
fun PLanet(painter: Painter, name: String, position: String, tagline: String, desc: String, size: Int) {
    val wid = LocalConfiguration.current.screenWidthDp;
    Column(
        Modifier
            .fillMaxHeight()
            .width(wid.dp)
            .background(color = Color.White)
            .padding(horizontal = 10.dp, vertical = 10.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.Bottom
        ) {
            Text(text = position,
                style = TextStyle(
                    fontSize = wid.sp/4,
                    fontFamily = Satoshi,
                    fontWeight = FontWeight.Black,
                    color = Color(0xFFEEEDF0),
                )
            )
            Image(
                painter = painter,
                contentDescription = name,
                contentScale = ContentScale.FillHeight,
                modifier = Modifier
                    .height(wid.dp/2)
                    .fillMaxWidth()
            )
        }
        Text(
            text = name,
            style = TextStyle(
                fontSize = 64.sp,
                fontFamily = Satoshi,
                fontWeight = FontWeight.Black,
                color = Color(0xFF454C6A),
            ),
        )
        Text(
            text = tagline,
            style = TextStyle(
                fontSize = 32.sp,
                fontFamily = Satoshi,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF636776),

            )
        )
        Text(
            text = desc,
            style = TextStyle(
                fontSize = 24.sp,
                fontFamily = Satoshi,
                fontWeight = FontWeight.Normal,
                color = Color(0xFF9B9EA9),
            ),
        )
    }
}