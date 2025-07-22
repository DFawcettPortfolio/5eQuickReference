package com.example.wildshapesmountsandfamiliars.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val UnifiedColorScheme = darkColorScheme(
    primary = AppPrimary,
    onPrimary = AppOnPrimary,
    background = AppBackground,
    onBackground = AppOnBackground,
    surface = AppSurface,
    onSurface = AppOnSurface,
    secondary = AppPrimary,
    tertiary = AppPrimary
)

@Composable
fun WildShapesMountsAndFamiliarsTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = UnifiedColorScheme,
        typography = Typography,
        content = content
    )
}
