package com.omoraless.weather.domain.repository

import com.omoraless.weather.domain.util.Resource
import com.omoraless.weather.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}