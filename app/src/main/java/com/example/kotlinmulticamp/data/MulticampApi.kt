package com.example.kotlinmulticamp.data

import com.example.kotlinmulticamp.data.model.Array
import retrofit2.http.GET

interface MulticampApi {
    @GET("multicamp/communities")
    suspend fun getCommunities(): List<Array>
}