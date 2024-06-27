package uk.co.zlurgg.thedaytoweather.data.remote

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class WeatherDto(
    @field:Json(name = "hourly")
    val weatherData: WeatherDataDto
)