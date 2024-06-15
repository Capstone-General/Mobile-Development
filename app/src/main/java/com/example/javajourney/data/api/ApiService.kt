package com.example.javajourney.data.api

import com.example.javajourney.data.response.GetPlace
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("places")
    fun getPlaces(): Call<GetPlace>
}

