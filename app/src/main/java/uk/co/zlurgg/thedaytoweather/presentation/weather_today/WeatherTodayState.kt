package uk.co.zlurgg.thedaytoweather.presentation.weather_today

import uk.co.zlurgg.thedaytoweather.domain.weather.WeatherInfo

data class WeatherTodayState (
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)