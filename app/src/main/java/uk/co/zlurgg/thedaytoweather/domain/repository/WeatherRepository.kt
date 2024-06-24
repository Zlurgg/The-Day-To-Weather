package uk.co.zlurgg.thedaytoweather.domain.repository

import uk.co.zlurgg.thedaytoweather.domain.model.WeatherInfo
import uk.co.zlurgg.thedaytoweather.domain.util.Resource

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}