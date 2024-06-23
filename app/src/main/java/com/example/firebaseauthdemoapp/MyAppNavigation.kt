package com.example.firebaseauthdemoapp


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier // Import Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.firebaseauthdemoapp.pages.HomePage
import com.example.firebaseauthdemoapp.pages.LoginPage
import com.example.firebaseauthdemoapp.pages.SignupPage

@Composable
fun MyAppNavigation(modifier: Modifier = Modifier, authViewModel: AuthViewModel){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login", builder = {
        composable("login"){
            LoginPage(
               Modifier, navController,authViewModel
            )
        }

        composable("signup"){
            SignupPage(
                Modifier, navController,authViewModel
            )
        }

        composable("home"){
            HomePage(
                Modifier, navController,authViewModel
            )
        }
    })
}