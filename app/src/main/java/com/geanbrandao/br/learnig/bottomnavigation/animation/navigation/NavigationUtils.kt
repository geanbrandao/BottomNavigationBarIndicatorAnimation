package com.geanbrandao.br.learnig.bottomnavigation.animation.navigation

import com.geanbrandao.br.learnig.bottomnavigation.animation.R
import com.geanbrandao.br.learnig.bottomnavigation.animation.data.model.BottomBarItem

object NavigationUtils {
    const val HOME_ROUTE = "home"
    const val NETWORK_ROUTE = "network"
    const val PROFILE_ROUTE = "profile"
    const val NOTIFICATION_ROUTE = "notification"
    const val NEW_POST_ROUTE = "new_post"

    val bottomBarItems = listOf(
        BottomBarItem(
            route = HOME_ROUTE,
            icon = R.drawable.ic_android,
            label = R.string.bottom_bar_home_label,
        ),
        BottomBarItem(
            route = NETWORK_ROUTE,
            icon = R.drawable.ic_android,
            label = R.string.bottom_bar_network_label,
        ),
        BottomBarItem(
            route = NEW_POST_ROUTE,
            icon = R.drawable.ic_android,
            label = R.string.bottom_bar_new_post_label,
        ),
        BottomBarItem(
            route = NOTIFICATION_ROUTE,
            icon = R.drawable.ic_android,
            label = R.string.bottom_bar_notification_label,
        ),
        BottomBarItem(
            route = PROFILE_ROUTE,
            icon = R.drawable.ic_android,
            label = R.string.bottom_bar_profile_label,
        ),
    )
}