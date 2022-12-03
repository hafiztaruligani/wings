package com.hafiztaruligani.wings.data.local.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "transaction_detail")
data class TransactionDetailEntity(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "product_code")
    val productCode: String,
    @ColumnInfo(name = "document_number")
    val documentNumber: Int,
    @ColumnInfo(name = "document_code")
    val documentCode: String,
    val produceName: String,
    val price: Int,
    val quantity: Int,
    val unit: String,
    val currency: String,
    val subTotal: Int
) {
    constructor(
        documentNumber: Int,
        productCode: String,
        produceName: String,
        price: Int,
        quantity: Int,
        unit: String,
        currency: String,
        documentCode: String
    ) : this(
        productCode = productCode,
        produceName = produceName,
        price = price,
        quantity = quantity,
        unit = unit,
        currency = currency,
        subTotal = price * quantity,
        documentNumber = documentNumber,
        documentCode = documentCode
    )
}
