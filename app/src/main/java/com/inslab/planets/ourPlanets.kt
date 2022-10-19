package com.inslab.planets

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.inslab.planets.planets.PLanet
import dev.chrisbanes.snapper.ExperimentalSnapperApi
import dev.chrisbanes.snapper.rememberSnapperFlingBehavior

@OptIn(ExperimentalSnapperApi::class)
@Composable
fun showPlanets(
){
    val lazyListState = rememberLazyListState()
    LazyRow( state = lazyListState,
        flingBehavior = rememberSnapperFlingBehavior(lazyListState),content = {
        item {
            PLanet(painter = painterResource(id = R.drawable.ourgalaxy), name = "Milky way", position = "#0", tagline = "this is milky way galaxy, our home", desc = "The Milky Way is a huge collection of stars, dust and gas. It’s called a spiral galaxy because if you could view it from the top or bottom, it would look like a spinning pinwheel. The Sun is located on one of the spiral arms, about 25,000 light-years away from the center of the galaxy. Even if you could travel at the speed of light (300,000 kilometers, or 186,000 miles, per second), it would take you about 25,000 years to reach the middle of the Milky Way.", size = 230)
        }
                item {
                    PLanet(painter = painterResource(id = R.drawable.mercury), name = "Mercury", position = "#1", tagline = mercuryTag, desc = mercuryDes, size = 230)
                }
                item {
                    PLanet(painter = painterResource(id = R.drawable.venus), name = "Venus", position = "#2", tagline = venusTag, desc = venusDes, size = 230)
                }
                item {
                    PLanet(painter = painterResource(id = R.drawable.earth), name = "Earth", position = "#3", tagline = earthTag, desc = earthDes, size = 230)
                }
                item {
                    PLanet(painter = painterResource(id = R.drawable.mars), name = "Mars", position = "#4", tagline = marsTag, desc = marsDes, size = 230)
                }
                item {
                    PLanet(painter = painterResource(id = R.drawable.jupiter), name = "Jupiter", position = "#5", tagline = jupiterTag, desc = jupiterDes, size = 230)
                }
                item {
                    PLanet(painter = painterResource(id = R.drawable.saturn), name = "Saturn", position = "#6", tagline = saturnTag, desc = saturnDes, size = 170)
                }
                item {
                    PLanet(painter = painterResource(id = R.drawable.uranus), name = "Uranus", position = "#7", tagline = uranusTag, desc = uranusDes, size = 230)
                }
                item {
                    PLanet(painter = painterResource(id = R.drawable.neptune), name = "Neptune", position = "#8", tagline = neptuneTag, desc = neptuneDes, size = 230)
                }
            }
            )
}