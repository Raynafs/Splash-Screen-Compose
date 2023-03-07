package com.example.splashscreen.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.splashscreen.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen (navController : NavController)
{
    showBars(flag = false)
    LaunchedEffect(key1 = true)
    {
        delay(2500)
        navController.navigate(Screen.Dashboard.route)
        {
            popUpTo(0)
        }

    }
    Column (
        modifier= Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
            )
    {

        Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "")
    }
}