package uk.co.zlurgg.thedaytoweather.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiService {

    // https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&hourly=temperature_2m,relative_humidity_2m,wind_speed_10m

    @GET("v1/forecast")
    suspend fun getWeatherData(
        @Query("latitude") lat: Double,
        @Query("longitude") long: Double,
        @Query("hourly") hourlyParams: String =
            "temperature_2m,weather_code,relative_humidity_2m,wind_speed_10m,pressure_msl"
    ): WeatherDto
}