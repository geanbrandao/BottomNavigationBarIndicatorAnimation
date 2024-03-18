package com.geanbrandao.br.learnig.bottomnavigation.animation.navigation

import com.geanbrandao.br.learnig.bottomnavigation.animation.navigation.NavigationUtils.HOME_ROUTE
import com.geanbrandao.br.learnig.bottomnavigation.animation.navigation.NavigationUtils.NETWORK_ROUTE
import com.geanbrandao.br.learnig.bottomnavigation.animation.navigation.NavigationUtils.NEW_POST_ROUTE
import com.geanbrandao.br.learnig.bottomnavigation.animation.navigation.NavigationUtils.NOTIFICATION_ROUTE
import com.geanbrandao.br.learnig.bottomnavigation.animation.navigation.NavigationUtils.PROFILE_ROUTE

sealed class Screen(
    val route: String,
) {
    data object Home : Screen(HOME_ROUTE)
    data object Network: Screen(NETWORK_ROUTE)
    data object Profile: Screen(PROFILE_ROUTE)
    data object Notification: Screen(NOTIFICATION_ROUTE)
    data object NewPost: Screen(NEW_POST_ROUTE)
}

