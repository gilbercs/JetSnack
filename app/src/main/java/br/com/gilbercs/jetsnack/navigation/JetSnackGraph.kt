package br.com.gilbercs.jetsnack.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

//----------------------------------------
//Navegation
//----------------------------------------
@Composable
fun JetSnackGraph(){
    val navHostController = rememberNavController()
    NavHost(navController = navHostController, startDestination = "login" ){

    }
}