package com.metatest.basicnavigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

// c'est la fonction qui construit la page d'accueil
@Composable
fun HomeScreen(navController: NavHostController) { // ajout tardif du paramètre navController

    Column (
        modifier = Modifier
            .fillMaxSize(),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

            )

    {   // Columnn Scope
        Text(
            text = "Home Screen",
            fontSize = 32.sp,



            )

        Button(
            onClick = {
                      navController.navigate(MenuList.route) // enclenche le composable MenuList.route = ouvre une nouvelle fenêtre.
                      },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFF1CE14))


              )

        {  // Scope of Button
            Text(text = "Order Take Away")

        }



    }






}
