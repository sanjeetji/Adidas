package com.sanjeet.adidas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.sanjeet.adidas.navigation.Navigation
import com.sanjeet.adidas.ui.theme.AdidasShopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetAdidasShopUIMain()
        }
    }

    @Composable
    fun JetAdidasShopUIMain() {
        AdidasShopTheme{
            Surface(color = MaterialTheme.colors.background) {
                Navigation()
            }
        }
    }
}

