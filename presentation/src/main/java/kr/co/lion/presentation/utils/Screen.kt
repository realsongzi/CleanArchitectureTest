package kr.co.lion.presentation.utils

sealed class Screen(val route: String) {
    data object Home : Screen("Home")
    data object Detail : Screen("Detail")
}