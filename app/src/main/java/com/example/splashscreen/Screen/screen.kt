package com.example.splashscreen.Screen

sealed class Screen ( var route: String)
{
    object SplashScreen : Screen ("splashScreen")
    object Dashboard : Screen ("dashboard")
}