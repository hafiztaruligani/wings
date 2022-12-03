package com.hafiztaruligani.wings.data.local.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.hafiztaruligani.wings.domain.model.Product

@Entity(tableName = "product")
data class ProductEntity(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "product_code")
    val productCode: String,
    @ColumnInfo(name = "product_name")
    val productName: String,
    val price: Int,
    val currency: String,
    val discount: Int,
    val dimension: String,
    val unit: String
) {
    fun toProduct() = Product(
        productCode,
        productName,
        price,
        getActualPrice(),
        currency,
        discount,
        dimension,
        unit
    )

    private fun getActualPrice(): Int = try {
        price - (price * discount / 100)
    } catch (e: Exception) {
        price
    }
}
