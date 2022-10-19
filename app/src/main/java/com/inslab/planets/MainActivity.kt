package com.inslab.planets

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.ui.res.painterResource
import com.inslab.planets.planets.PLanet


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

               HomeScreen()

//            LazyRow(content = {
//                item {
//                    PLanet(painter = painterResource(id = R.drawable.mercury), name = "Mercury", position = "#1", tagline = mercuryTag, desc = mercuryDes, size = 230)
//                }
//                item {
//                    PLanet(painter = painterResource(id = R.drawable.venus), name = "Venus", position = "#2", tagline = venusTag, desc = venusDes, size = 230)
//                }
//                item {
//                    PLanet(painter = painterResource(id = R.drawable.earth), name = "Earth", position = "#3", tagline = earthTag, desc = earthDes, size = 230)
//                }
//                item {
//                    PLanet(painter = painterResource(id = R.drawable.mars), name = "Mars", position = "#4", tagline = marsTag, desc = marsDes, size = 230)
//                }
//                item {
//                    PLanet(painter = painterResource(id = R.drawable.jupiter), name = "Jupiter", position = "#5", tagline = jupiterTag, desc = jupiterDes, size = 230)
//                }
//                item {
//                    PLanet(painter = painterResource(id = R.drawable.saturn), name = "Saturn", position = "#6", tagline = saturnTag, desc = saturnDes, size = 170)
//                }
//                item {
//                    PLanet(painter = painterResource(id = R.drawable.uranus), name = "Uranus", position = "#7", tagline = uranusTag, desc = uranusDes, size = 230)
//                }
//                item {
//                    PLanet(painter = painterResource(id = R.drawable.neptune), name = "Neptune", position = "#8", tagline = neptuneTag, desc = neptuneDes, size = 230)
//                }
//            }
//            )
        }
    }
}


