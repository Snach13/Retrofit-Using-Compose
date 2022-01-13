package com.example.retrofitusingcompose.repository

import com.example.retrofitusingcompose.model.UserResponse
import com.example.retrofitusingcompose.network.ApiInterface
import com.example.retrofitusingcompose.utils.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject


@ActivityScoped
class UserRepository @Inject constructor(
    private val apiInterface : ApiInterface
) {

    suspend fun getUserResponse() : Resource<List<UserResponse>> {
        val response  = try {
            apiInterface.getUserData()
        }catch (e: Exception) {
            return Resource.Error("An Unknown Error Occurred: ${e.localizedMessage}")
        }

        return Resource.Success(response)
    }


}