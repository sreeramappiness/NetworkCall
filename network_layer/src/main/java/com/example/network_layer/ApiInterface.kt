package com.example.network_layer

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    companion object {fun <T> get(endPoint: String, model: T) {

        val LOGIN = endPoint
        @GET(value = Test.LOGIN)

        fun <T>getPhotos(): Call<List<T>>? {

            return null
        }
    }
    }
}

