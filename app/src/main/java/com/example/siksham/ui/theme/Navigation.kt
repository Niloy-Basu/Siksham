package com.example.siksham.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController=navController,startDestination="Home",builder= {
        composable("Home") {
            NestedScrolling(navController)
        }
        composable("All") {
            PopularCoursesRows()
        }

        composable("Homes") {
            HomeScreen(navController)
        }
        composable("All") {
            PopularCoursesRows()
        }

    })
}
