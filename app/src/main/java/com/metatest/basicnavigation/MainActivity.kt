package com.metatest.basicnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            AMyNavigation() // la fonction est juste en dessous

        }
    }
}

@Composable
fun AMyNavigation() /* no parameters just body */ {
    val navController = rememberNavController() // to save the state if the NavController
    NavHost(navController = navController, startDestination = Home.route) {
        composable(Home.route) { // écran accueil, va chercher le composable dans un autre fichier (Destinations.kt)
            HomeScreen(navController)    // définit Home.route, définit écran accueil,  va chercher la méthode dans HomeScreen.kt
        }
        composable(MenuList.route) {// va chercher le composable dans un autre fichier (Destinations.kt)
            MenuListScreen()  // définit MenuListScreen, va chercher la méthode dans MenuList.kt

        }
    }


}