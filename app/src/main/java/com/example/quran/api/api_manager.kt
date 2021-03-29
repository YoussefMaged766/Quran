package com.example.quran.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create


class api_manager {

    companion object {
     private   var retrofit: Retrofit? = null
       @Synchronized fun getinstance(): Retrofit {
            if (retrofit == null) {
                retrofit = Retrofit.Builder().
                baseUrl("http://api.mp3quran.net/").
                addConverterFactory(GsonConverterFactory.create()).build()
                return retrofit!!
            }
            return retrofit!!
        }

        fun getapi(): web_services {
            return getinstance().create(web_services::class.java)
        }

    }
}