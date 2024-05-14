package com.becker.navigationcomposeneconaz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.becker.navigationcomposeneconaz.screens.Screen1
import com.becker.navigationcomposeneconaz.screens.Screen2
import com.becker.navigationcomposeneconaz.screens.Screen3
import com.becker.navigationcomposeneconaz.ui.theme.NavigationComposeNecoNazTheme

const val SCREEN_1 = "screen_1"
const val SCREEN_2 = "screen_2"
const val SCREEN_3 = "screen_3"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            val navController = rememberNavController()

            NavigationComposeNecoNazTheme {
                NavHost(
                    navController = navController,
                    startDestination = SCREEN_1  // show start screen
                ) {

                    composable(SCREEN_1) {
                        Screen1 { // show screen 1
                            navController.navigate(SCREEN_2) // callback to navigate to ...
                        }
                    }

                    composable(SCREEN_2) {
                        Screen2 {
                            navController.navigate(SCREEN_3)
                        }
                    }

                    composable(SCREEN_3) {
                        Screen3 {
                            navController.navigate(SCREEN_1) {
                                popUpTo(SCREEN_1) { inclusive = true } // clean backstack and allow
                            }                                          // only one inclusive version of screen 1
                        }
                    }
                }
            }
        }
    }
}
