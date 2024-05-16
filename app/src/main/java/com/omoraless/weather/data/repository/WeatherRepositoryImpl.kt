package com.omoraless.weather.data.repository


import com.omoraless.weather.data.mappers.toWeatherInfo
import com.omoraless.weather.data.remote.WeatherApi
import com.omoraless.weather.domain.repository.WeatherRepository
import com.omoraless.weather.domain.util.Resource
import com.omoraless.weather.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
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