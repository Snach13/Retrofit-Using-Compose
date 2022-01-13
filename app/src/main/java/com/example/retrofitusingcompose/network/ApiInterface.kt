package com.example.retrofitusingcompose.network

import com.example.retrofitusingcompose.model.UserResponse
import retrofit2.http.GET
import javax.inject.Singleton


@Singleton
interface ApiInterface {

    @GET("todos")
    suspend fun getUserData() : List<UserResponse>
}