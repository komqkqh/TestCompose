package com.example.testcompose2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.testcompose2.compose.ComposeChapter1
import com.example.testcompose2.ui.theme.TestCompose2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestCompose2Theme {
                ComposeChapter1().MyApp()
            }
        }
    }
}
