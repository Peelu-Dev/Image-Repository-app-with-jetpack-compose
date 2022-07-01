package com.example.imagerepository.network

import com.example.imagerepository.Image
import com.skydoves.sandwich.ApiResponse
import retrofit2.http.GET

interface ImageService {
    @GET("image.json")
    suspend fun retrieveImageList():ApiResponse<List<Image>>
}