package uk.co.zlurgg.thedaytoweather.domain.model

data class WeatherResponse(
    val weather: List<WeatherDescription>,
    val main: TemperatureData,
    val name: String)

data class WeatherDescription(
    val description: String,
    val icon: String
)

data class TemperatureData(
    val temp: Double,
    val feels_like: Double,
    val temp_min: Double,
    val temp_max: Double
)