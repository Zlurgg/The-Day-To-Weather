package uk.co.zlurgg.thedaytoweather.data.repository

import uk.co.zlurgg.thedaytoweather.data.mappers.toWeatherInfo
import uk.co.zlurgg.thedaytoweather.data.remote.WeatherApiService
import uk.co.zlurgg.thedaytoweather.domain.model.WeatherInfo
import uk.co.zlurgg.thedaytoweather.domain.repository.WeatherRepository
import uk.co.zlurgg.thedaytoweather.domain.util.Resource
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApiService
): WeatherRepository {

    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        } catch(e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}