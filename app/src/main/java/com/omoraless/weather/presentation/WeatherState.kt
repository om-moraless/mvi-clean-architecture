package com.omoraless.weather.presentation

import com.omoraless.weather.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null, val isLoading: Boolean = false, val error: String? = null
)
