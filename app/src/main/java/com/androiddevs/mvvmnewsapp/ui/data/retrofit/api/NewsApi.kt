package com.androiddevs.mvvmnewsapp.ui.data.retrofit.api

import com.androiddevs.mvvmnewsapp.ui.data.retrofit.untils.Constants.Companion.API_KEY
import com.androiddevs.mvvmnewsapp.ui.model.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {

    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country")
        countryCode:String = "us",
        @Query("page")
        pageNumber:Int = 1,
        @Query("apiKey")
        apiKey:String = API_KEY
    ):Response<NewsResponse>

    @GET("v2/top-everything")
    suspend fun searchForMews(
        @Query("q")
        searchQuery:String = "us",
        @Query("page")
        pageNumber:Int = 1,
        @Query("apiKey")
        apiKey:String = API_KEY
    ):Response<NewsResponse>

}