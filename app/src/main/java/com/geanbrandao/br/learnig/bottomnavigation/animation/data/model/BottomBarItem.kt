package com.geanbrandao.br.learnig.bottomnavigation.animation.data.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class BottomBarItem(
    @StringRes val label: Int,
    @DrawableRes val icon: Int,
    val route: String,
)