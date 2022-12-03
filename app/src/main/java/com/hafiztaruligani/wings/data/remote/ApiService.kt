package com.hafiztaruligani.wings.data.remote

import com.hafiztaruligani.wings.data.remote.dto.ProductsResponse
import retrofit2.http.GET

interface ApiService {
    @GET("3a77288a-edcb-4b8f-9f55-8a6aff7063d6")
    suspend fun getProductList(): ProductsResponse
}
