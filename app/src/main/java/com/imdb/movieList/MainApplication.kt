package com.imdb.movieList

import android.app.Application
import com.imdb.movieList.api.MovieAPI
import com.imdb.movieList.repository.MovieRepository
import dagger.hilt.android.HiltAndroidApp
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@HiltAndroidApp
class MainApplication: Application() {
    lateinit var movieApi:MovieAPI
    lateinit var movieRepository: MovieRepository
    override fun onCreate() {
        super.onCreate()
    }
}