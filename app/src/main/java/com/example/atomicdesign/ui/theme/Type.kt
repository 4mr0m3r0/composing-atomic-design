package com.example.atomicdesign.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.atomicdesign.R

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
        h1 = TextStyle(
                fontFamily = SansPro,
                fontWeight = FontWeight.Light,
                fontSize = 82.sp,
                letterSpacing = (-1.5).sp
        ),
        h2 = TextStyle(
                fontFamily = SansPro,
                fontWeight = FontWeight.Light,
                fontSize = 60.sp,
                letterSpacing = (-0.5).sp
        ),
        h3 = TextStyle(
                fontFamily = SansPro,
                fontWeight = FontWeight.W400,
                fontSize = 48.sp
        ),
        h4 = TextStyle(
                fontFamily = SansPro,
                fontWeight = FontWeight.W400,
                fontSize = 34.sp,
                letterSpacing = (0.25).sp
        ),
        h5 = TextStyle(
                fontFamily = SansPro,
                fontWeight = FontWeight.W400,
                fontSize = 24.sp
        ),
        h6 = TextStyle(
                fontFamily = SansPro,
                fontWeight = FontWeight.W600,
                fontSize = 20.sp,
                letterSpacing = (0.15).sp
        ),
        subtitle1 = TextStyle(
                fontFamily = SansPro,
                fontWeight = FontWeight.W400,
                fontSize = 16.sp,
                letterSpacing = (0.15).sp
        ),
        subtitle2 = TextStyle(
                fontFamily = SansPro,
                fontWeight = FontWeight.W600,
                fontSize = 14.sp,
                letterSpacing = (0.1).sp
        ),
        body1 = TextStyle(
                fontFamily = SansPro,
                fontWeight = FontWeight.W400,
                fontSize = 18.sp,
                letterSpacing = (0.5).sp
        ),
        body2 = TextStyle(
                fontFamily = SansPro,
                fontWeight = FontWeight.W400,
                fontSize = 14.sp,
                letterSpacing = (0.25).sp
        ),
        button = TextStyle(
                fontFamily = SansPro,
                fontWeight = FontWeight.W600,
                fontSize = 14.sp,
                letterSpacing = (1.25).sp
        ),
        caption = TextStyle(
                fontFamily = SansPro,
                fontWeight = FontWeight.W400,
                fontSize = 12.sp,
                letterSpacing = (0.4).sp
        ),
)