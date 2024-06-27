package uk.co.zlurgg.thedaytoweather.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import uk.co.zlurgg.thedaytoweather.data.location.DefaultLocationTracker
import uk.co.zlurgg.thedaytoweather.data.repository.WeatherRepositoryImpl
import uk.co.zlurgg.thedaytoweather.domain.location.LocationTracker
import uk.co.zlurgg.thedaytoweather.domain.repository.WeatherRepository
import javax.inject.Singleton

@ExperimentalCoroutinesApi
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRepository(
        weatherRepositoryImpl: WeatherRepositoryImpl
    ): WeatherRepository
}