package com.example.jetpagerfull

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text


import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.compose.rememberNavController


@Composable
fun MainScreen(modifier: Modifier = Modifier) {

    val navItemList= listOf(
        BottomNavItem("Home", Icons.Filled.Home),
        BottomNavItem("Samples", Icons.Filled.PlayArrow),
        BottomNavItem("Explore", Icons.Filled.DateRange),
        BottomNavItem("Library", Icons.Filled.MailOutline)
    )

    var selectedIndex by remember {
        mutableStateOf(0)
    }

    Scaffold(
        modifier=Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar(
                modifier = Modifier.background(Color.Black)
            ) {
                navItemList.forEachIndexed { index, bottomNavItem ->
                     NavigationBarItem(
                         label = {
                             Text(text = bottomNavItem.title)
                         },
                         selected = selectedIndex==index,
                         onClick = {
                             selectedIndex=index
                         },
                         icon = {
                             Icon(imageVector = bottomNavItem.selectedIcon, contentDescription = null)
                         }
                     )
                }
            }
        }

    ) { innerPadding ->
        ContentScreen(modifier=Modifier.padding(innerPadding),selectedIndex)
    }
}

@SuppressLint("ViewModelConstructorInComposable")
@Composable
fun ContentScreen(modifier: Modifier = Modifier,selectedIndex:Int) {
    when(selectedIndex){
        0-> HomePage()
        1-> SamplePage(MusicVideoViewModel())
        2-> ExplorePage()
        3-> LibraryPage()
    }
}

