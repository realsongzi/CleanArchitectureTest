package kr.co.lion.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kr.co.lion.presentation.ui.screens.DetailScreen
import kr.co.lion.presentation.ui.screens.HomeScreen
import kr.co.lion.presentation.utils.Screen

@Composable
fun mainNavigation(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
    ){
        composable(Screen.Home.route){
            HomeScreen()
        }

        composable(Screen.Detail.route){
            DetailScreen()
        }
    }
}