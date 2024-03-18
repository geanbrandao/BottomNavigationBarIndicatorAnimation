package com.geanbrandao.br.learnig.bottomnavigation.animation.presentation.bottomnavigationbar

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.times
import com.geanbrandao.br.learnig.bottomnavigation.animation.data.model.BottomBarItem
import com.geanbrandao.br.learnig.bottomnavigation.animation.navigation.NavigationUtils
import com.geanbrandao.br.learnig.bottomnavigation.animation.navigation.Screen
import com.geanbrandao.br.learnig.bottomnavigation.animation.ui.theme.BottomNavigationAnimationTheme


@Composable
fun BottomBar(
    currentRoute: String,
    onNavigate: (route: String) -> Unit,
    modifier: Modifier = Modifier,
    items: List<BottomBarItem> = NavigationUtils.bottomBarItems,
) {
    BottomBarView(
        modifier = modifier,
        currentRoute = currentRoute,
        items = items,
        onNavigate = onNavigate
    )
}

@Composable
private fun BottomBarView(
    modifier: Modifier = Modifier,
    currentRoute: String = Screen.Network.route,
    items: List<BottomBarItem> = NavigationUtils.bottomBarItems,
    onNavigate: (route: String) -> Unit = {},
) {

    val indicatorWidth = getScreenWidthInDp() / items.size
    val position = items.getPositionByRoute(currentRoute)

    Box(
        modifier = Modifier.fillMaxWidth()
    ) {
        BottomAppBar(
            modifier = modifier,
            tonalElevation = 8.dp,
            contentPadding = PaddingValues(0.dp),
            containerColor = MaterialTheme.colorScheme.surface,
        ) {
            items.forEach { item ->
                NavigationBarItem(
                    selected = currentRoute == item.route,
                    onClick = { onNavigate(item.route) },
                    icon = {
                        Icon(
                            painter = painterResource(id = item.icon),
                            contentDescription = stringResource(id = item.label),
                        )
                    },
                    label = {
                        Text(
                            text = stringResource(id = item.label),
                            fontSize = 10.sp
                        )
                    }
                )
            }
        }
        BottomNavigationIndicator(position = position, indicatorWidth = indicatorWidth)
    }
}

@Composable
private fun BottomNavigationIndicator(
    position: Int,
    indicatorWidth: Dp
) {
    val xOffset = position.times(indicatorWidth)
    val xOffsetAnimated = animateDpAsState(
        targetValue = xOffset,
        label = "Offset animation label",
        animationSpec = tween(500),
    )
    Box(
        modifier = Modifier
            .offset(
                x = xOffsetAnimated.value
            )
            .height(2.dp)
            .width(indicatorWidth)
            .clip(shape = RoundedCornerShape(2.dp))
            .background(color = MaterialTheme.colorScheme.onSurface),
    )
}

@Composable
fun getScreenWidthInDp(): Dp {
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp
    return screenWidth
}

fun List<BottomBarItem>.getPositionByRoute(route: String): Int {
    return this.indexOfFirst { it.route == route }
}

@Preview(showBackground = true)
@Composable
private fun BottomBarPreview() {
    BottomNavigationAnimationTheme {
        BottomBarView()
    }
}