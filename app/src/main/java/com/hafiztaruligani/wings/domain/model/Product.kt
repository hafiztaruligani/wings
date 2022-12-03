package com.hafiztaruligani.wings.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Product(
    val productCode: String,
    val productName: String,
    val price: Int,
    val actualPrice: Int,
    val currency: String,
    val discount: Int,
    val dimension: String,
    val unit: String
) : Parcelable
