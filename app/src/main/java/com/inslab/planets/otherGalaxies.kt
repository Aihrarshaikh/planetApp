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
fun othergalaxies(
){
    val lazyListState = rememberLazyListState()
    LazyRow( state = lazyListState,
        flingBehavior = rememberSnapperFlingBehavior(lazyListState),content = {
        item {
            PLanet(painter = painterResource(id = R.drawable.andromeda), name = "Andromeda Galaxy", position = "#1", tagline = "Andromeda gets its name from the area of the sky in which it appears ", desc = "Andromeda is the closest big galaxy to the Milky Way and is expected to collide with the Milky Way around 4.5 billion years from now. The two will eventually merge into a single new galaxy called Milkdromeda", size = 230)
        }
        item {
            PLanet(painter = painterResource(id = R.drawable.condor), name = "Conder Galaxy", position = "#2", tagline = "Named after a condor, a type of vulture that is one of the largest flying birds.", desc = "The largest known spiral galaxy, it has a diameter of over 665,300 light-years (204.0 kiloparsecs).[3] It is tidally disturbed by the smaller galaxy IC 4970.[4]", size = 250)
        }
        item {
            PLanet(painter = painterResource(id = R.drawable.cr7), name = "Cosmos Redshift 7", position = "#3", tagline = "The name of this galaxy is based on a Redshift measurement of nearly 7 (actually, z = 6.604)", desc = "Galaxy Cosmos Redshift 7 is reported to be the brightest of distant galaxies (z > 6) and to contain some of the earliest first stars (first generation; Population III) that produced the chemical elements needed for the later formation of planets and life as we know it.", size = 230)
        }
        item {
            PLanet(painter = painterResource(id = R.drawable.large), name = "Large Magellanic Cloud", position = "#4", tagline = "Named after Ferdinand Magellan", desc = "This is the fourth-largest galaxy in the Local Group, and forms a pair with the SMC, and from recent research, may not be part of the Milky Way system of satellites at all.", size = 230)
        }
        item {
            PLanet(painter = painterResource(id = R.drawable.mayall_s), name = "Mayall's Object", position = "#5", tagline = "This is named after Nicholas Mayall, of the Lick Observatory, who discovered it.", desc = "Also called VV 32 and Arp 148, this is a very peculiar looking object, and is likely to be not one galaxy, but two galaxies undergoing a collision. Event in images is a spindle shape and a ring shape.", size = 230)
        }
    }
    )
}