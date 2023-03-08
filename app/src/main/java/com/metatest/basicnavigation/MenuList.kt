package com.metatest.basicnavigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp


// c'est la fonction qui construit la page "Menu List", autre paradigme que celui des activity qui est plus orienté objet
@Composable
fun MenuListScreen() {
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
          )

    {
        Text(
            text = "Menu List",
            fontSize = 32.sp
            )

    }

}