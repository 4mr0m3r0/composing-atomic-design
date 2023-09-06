package com.example.ui_components.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.ui_components.R

//val Light = FontFamily(Font(R.font.source_sans_pro_light))
//val Regular = FontFamily(Font(R.font.source_sans_pro_regular))
//val SemiBold = FontFamily(Font(R.font.source_sans_pro_semi_bold))
//val Bold = FontFamily(Font(R.font.source_sans_pro_bold))

val SansPro = FontFamily(
        Font(R.font.source_sans_pro_light, FontWeight.Light),
        Font(R.font.source_sans_pro_regular, FontWeight.W400),
        Font(R.font.source_sans_pro_semi_bold, FontWeight.W600),
        Font(R.font.source_sans_pro_bold, FontWeight.W700),
)

val Typography = Typography(
        displayLarge = TextStyle(
                fontFamily = SansPro,
                lineHeight = 64.sp,
                fontWeight = FontWeight.Light,
                fontSize = 57.sp,
                letterSpacing = (-1.5).sp
        ),
        displayMedium = TextStyle(
                fontFamily = SansPro,
                lineHeight = 52.sp,
                fontWeight = FontWeight.Light,
                fontSize = 45.sp,
                letterSpacing = (-0.5).sp
        ),
        displaySmall = TextStyle(
                fontFamily = SansPro,
                lineHeight = 44.sp,
                fontWeight = FontWeight.W400,
                fontSize = 36.sp
        ),
        headlineLarge = TextStyle(
                fontFamily = SansPro,
                lineHeight = 40.sp,
                fontWeight = FontWeight.W400,
                fontSize = 32.sp,
        ),
        headlineMedium = TextStyle(
                fontFamily = SansPro,
                lineHeight = 36.sp,
                fontWeight = FontWeight.W400,
                fontSize = 28.sp
        ),
        headlineSmall = TextStyle(
                fontFamily = SansPro,
                lineHeight = 32.sp,
                fontWeight = FontWeight.W600,
                fontSize = 24.sp,
                letterSpacing = (0.15).sp
        ),
        titleLarge = TextStyle(
                fontFamily = SansPro,
                lineHeight = 28.sp,
                fontWeight = FontWeight.W400,
                fontSize = 22.sp,
                letterSpacing = (0.15).sp
        ),
        titleMedium = TextStyle(
                fontFamily = SansPro,
                lineHeight = 24.sp,
                fontWeight = FontWeight.W600,
                fontSize = 16.sp,
                letterSpacing = (0.1).sp
        ),
        titleSmall = TextStyle(
                fontFamily = SansPro,
                lineHeight = 16.sp,
                fontWeight = FontWeight.W400,
                fontSize = 14.sp,
                letterSpacing = (0.1).sp
        ),
        bodyLarge = TextStyle(
                fontFamily = SansPro,
                lineHeight = 24.sp,
                fontWeight = FontWeight.W400,
                fontSize = 16.sp,
                letterSpacing = (0.1).sp
        ),
        bodyMedium = TextStyle(
                fontFamily = SansPro,
                lineHeight = 20.sp,
                fontWeight = FontWeight.W600,
                fontSize = 14.sp,
                letterSpacing = (0.25).sp
        ),
        bodySmall = TextStyle(
                fontFamily = SansPro,
                lineHeight = 16.sp,
                fontWeight = FontWeight.W400,
                fontSize = 12.sp,
                letterSpacing = (0.4).sp
        ),
        labelLarge = TextStyle(
                fontFamily = SansPro,
                lineHeight = 20.sp,
                fontWeight = FontWeight.W400,
                fontSize = 14.sp,
                letterSpacing = (0.1).sp
        ),
        labelMedium = TextStyle(
                fontFamily = SansPro,
                lineHeight = 16.sp,
                fontWeight = FontWeight.W500,
                fontSize = 12.sp,
                letterSpacing = (0.5).sp
        ),
        labelSmall = TextStyle(
                fontFamily = SansPro,
                lineHeight = 16.sp,
                fontWeight = FontWeight.W500,
                fontSize = 11.sp,
                letterSpacing = (0.5).sp
        ),
)