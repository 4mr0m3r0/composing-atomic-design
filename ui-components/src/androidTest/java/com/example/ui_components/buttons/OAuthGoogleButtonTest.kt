package com.example.ui_components.buttons

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import org.junit.Rule
import org.junit.Test
import java.util.UUID

class OAuthGoogleButtonTest {
    @get:Rule val composeTestRule = createComposeRule()

    @Test
    fun givenRandomText_thenSameText() {
        val randomText = UUID.randomUUID().toString()

        composeTestRule.setContent {
            OAuthGoogleButton(onClick = { /*TODO*/ }, text = randomText)
        }

        composeTestRule.onNodeWithText(randomText).assertIsDisplayed()
    }
}