package com.example.andreaejercicio.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.andreaejercicio.screens.HomeScreen
import com.example.andreaejercicio.screens.ExercisesListScreen
import com.example.andreaejercicio.screens.MultiplicationTableScreen
import com.example.andreaejercicio.screens.RectangleAreaScreen
import com.example.andreaejercicio.screens.UserFormScreen

sealed class Screen(val route: String) {
    object Home : Screen("home_screen")
    object Menu : Screen("menu_screen")
    object Table : Screen("table_screen")
    object Rectangle : Screen("rectangle_screen")
    object Form : Screen("form_screen")
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) { HomeScreen(navController) }
        composable(Screen.Menu.route) { ExercisesListScreen(navController) }
        composable(Screen.Table.route) { MultiplicationTableScreen(navController) }
        composable(Screen.Rectangle.route) { RectangleAreaScreen(navController) }
        composable(Screen.Form.route) { UserFormScreen(navController) }
    }
}