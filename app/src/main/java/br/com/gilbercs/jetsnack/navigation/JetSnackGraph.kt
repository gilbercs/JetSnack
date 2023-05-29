package br.com.gilbercs.jetsnack.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.gilbercs.jetsnack.ui.screens.login.LoginScreen

//----------------------------------------
//Navegation
//----------------------------------------
@Composable
fun JetSnackGraph(){
    val navHostController = rememberNavController()
    NavHost(navController = navHostController, startDestination = "login" ){
        /**
         * tela de Login
         */
        composable(route = "login"){
            LoginScreen()
        }
    }
}