package uk.co.zlurgg.thedaytoweather.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uk.co.zlurgg.thedaytoweather.data.data_source.WeatherApiService
import uk.co.zlurgg.thedaytoweather.data.repository.WeatherRepository

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
//    @Provides
//    fun provideWeatherApiService(): WeatherApiService {
//        return Retrofit.Builder()
//            .baseUrl("https://api.openweathermap.org/data/2.5/")
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//            .create(WeatherApiService::class.java)
//    }

//    @Provides
//    fun provideWeatherRepository(apiService: WeatherApiService): WeatherRepository {
//        return WeatherRepository(apiService)
//    }
}