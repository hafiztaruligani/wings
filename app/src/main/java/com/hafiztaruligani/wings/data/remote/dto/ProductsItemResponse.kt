package com.hafiztaruligani.wings.data.remote.dto

import com.google.gson.annotations.SerializedName
import com.hafiztaruligani.wings.data.local.room.entity.ProductEntity

data class ProductsItemResponse(

    @field:SerializedName("unit")
    val unit: String,

    @field:SerializedName("price")
    val price: Int,

    @field:SerializedName("discount")
    val discount: Int,

    @field:SerializedName("currency")
    val currency: String,

    @field:SerializedName("product_code")
    val productCode: String,

    @field:SerializedName("product_name")
    val productName: String,

    @field:SerializedName("dimension")
    val dimension: String
) {
    fun toProductEntity() = ProductEntity(
        unit = unit,
        price = price,
        discount = discount,
        currency = currency,
        productCode = productCode,
        productName = productName,
        dimension = dimension
    )
}
