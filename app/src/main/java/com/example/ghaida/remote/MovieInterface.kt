package com.example.ghaida.remote

import com.example.ghaida.data.MovieResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieInterface {
    @GET("/")
    suspend fun getAllMovies(
        //here we apstract values from the link of the api
        @Query("i")s:String,
        @Query("page")page:Int,
        //page
        @Query("apikey")apikey:String
    ):Response<MovieResponse>

}