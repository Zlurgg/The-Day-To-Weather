package uk.co.zlurgg.thedaytoweather.presentation.weather_today

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import uk.co.zlurgg.thedaytoweather.ui.theme.TheDayToWeatherTheme

@Composable
fun WeatherTodayScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        Row(
            modifier = modifier
                .align(Alignment.CenterHorizontally),
            ) {
            Text(
                text = "Weather data"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TheDayToWeatherTheme {
        WeatherTodayScreen()
    }
}