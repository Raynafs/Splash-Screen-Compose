package com.example.splashscreen.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.splashscreen.Screen.Dashboard
import com.example.splashscreen.Screen.Screen
import com.example.splashscreen.Screen.SplashScreen

@Composable
fun splashNav(navController: NavHostController)
{

    NavHost(navController=navController, startDestination = Screen.SplashScreen.route)
    {
        composable(Screen.SplashScreen.route)
        {
            SplashScreen(navController= navController)
        }
        composable(Screen.Dashboard.route)
        {
            Dashboard()
        }
    }
}