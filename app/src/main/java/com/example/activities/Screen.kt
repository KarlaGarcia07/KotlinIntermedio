package com.example.activities

sealed class Screen(val route: String){
    object  Login : Screen("Login")
    object  Home : Screen("Home")
}
