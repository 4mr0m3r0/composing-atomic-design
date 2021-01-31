package com.example.atomicdesign.ui

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.font
import androidx.compose.ui.text.font.fontFamily
import androidx.compose.ui.unit.sp
import com.example.atomicdesign.R

val Light = fontFamily(font(R.font.source_sans_pro_light))
val Regular = fontFamily(font(R.font.source_sans_pro_regular))
val SemiBold = fontFamily(font(R.font.source_sans_pro_semi_bold))
val Bold = fontFamily(font(R.font.source_sans_pro_bold))

val Typography = Typography(
        h1 = TextStyle(
                fontFamily = Light,
                fontSize = 96.sp,
                letterSpacing = (-1.5).sp
        ),
        h2 = TextStyle(
                fontFamily = Light,
                fontSize = 60.sp,
                letterSpacing = (-0.5).sp
        ),
        h3 = TextStyle(
                fontFamily = Regular,
                fontSize = 48.sp
        ),
        h4 = TextStyle(
                fontFamily = Regular,
                fontSize = 34.sp,
                letterSpacing = (0.25).sp
        ),
        h5 = TextStyle(
                fontFamily = Regular,
                fontSize = 24.sp
        ),
        h6 = TextStyle(
                fontFamily = SemiBold,
                fontSize = 20.sp,
                letterSpacing = (0.15).sp
        ),
        subtitle1 = TextStyle(
                fontFamily = Regular,
                fontSize = 16.sp,
                letterSpacing = (0.15).sp
        ),
        subtitle2 = TextStyle(
                fontFamily = SemiBold,
                fontSize = 14.sp,
                letterSpacing = (0.1).sp
        ),
        body1 = TextStyle(
                fontFamily = Regular,
                fontSize = 18.sp,
                letterSpacing = (0.5).sp
        ),
        body2 = TextStyle(
                fontFamily = Regular,
                fontSize = 14.sp,
                letterSpacing = (0.25).sp
        ),
        button = TextStyle(
                fontFamily = SemiBold,
                fontSize = 14.sp,
                letterSpacing = (1.25).sp
        ),
        caption = TextStyle(
                fontFamily = Regular,
                fontSize = 12.sp,
                letterSpacing = (0.4).sp
        ),
)