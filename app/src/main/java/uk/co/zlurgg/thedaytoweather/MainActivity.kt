package uk.co.zlurgg.thedaytoweather

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dagger.hilt.android.AndroidEntryPoint
import uk.co.zlurgg.thedaytoweather.presentation.weather_today.WeatherTodayScreen
import uk.co.zlurgg.thedaytoweather.ui.theme.TheDayToWeatherTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TheDayToWeatherTheme {
                WeatherTodayScreen()
            }
        }
    }
}
