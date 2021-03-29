package com.example.quran.api

import retrofit2.Call
import retrofit2.http.GET

interface web_services {
    @GET("radios/get_radios.php")

    fun getradio(): Call<Response>




}