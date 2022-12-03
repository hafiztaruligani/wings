package com.hafiztaruligani.wings.data.remote.dto

import com.google.gson.annotations.SerializedName

data class ProductsResponse(

    @field:SerializedName("products")   
    val products: List<ProductsItemResponse>
)
