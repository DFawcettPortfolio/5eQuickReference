package com.example.wildshapesmountsandfamiliars.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontSize = 18.sp,
        letterSpacing = 0.25.sp,
        color = AppTextPrimary
    ),
    titleLarge = TextStyle(
        fontSize = 22.sp,
        fontWeight = FontWeight.Bold,
        color = AppTextPrimary
    ),
    headlineMedium = TextStyle(
        fontSize = 26.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = 0.15.sp,
        color = AppTextPrimary
    )
)
