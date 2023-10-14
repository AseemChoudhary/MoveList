package com.imdb.movieList.ui.list

import androidx.lifecycle.LiveData
import com.imdb.movieList.model.MovieDetailsResponse
import com.imdb.movieList.repository.MovieRepository
import com.imdb.movieList.utils.NetworkResult
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import java.util.Collections

class MovieViewModelTest {
    @Mock
    lateinit var movieRepository: MovieRepository
    @org.junit.jupiter.api.BeforeEach
    fun setUp() {
        MockitoAnnotations.openMocks(this)

    }
    @Test
    fun testgetMovieList(){
        // TODo Pagination test cases
    //  Mockito.`when`(movieRepository.getMovieList()).thenReturn(LiveData<NetworkResult<MovieDetailsResponse>>)
    }
    @org.junit.jupiter.api.AfterEach
    fun tearDown() {
    }
}