package com.hafiztaruligani.wings.data.local.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "transaction_header")
data class TransactionHeaderEntity(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "document_number")
    val documentNumber: Int,
    @ColumnInfo(name = "document_code")
    val documentCode: String,
    val user: String,
    val total: Int,
    val date: String
)
