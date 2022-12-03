package com.hafiztaruligani.wings.domain.repository

import com.hafiztaruligani.wings.data.local.room.entity.ProductEntity
import com.hafiztaruligani.wings.data.local.room.entity.TransactionDetailEntity
import com.hafiztaruligani.wings.data.local.room.entity.TransactionHeaderEntity
import com.hafiztaruligani.wings.data.local.room.entity.TransactionHeaderWithDetail
import com.hafiztaruligani.wings.domain.model.Product
import kotlinx.coroutines.flow.Flow

interface ProductsRepository {
    suspend fun getProducts(): Flow<List<ProductEntity>>
    suspend fun addTransactionHeader(
        userName: String,
        total: Int,
        documentNumber: Int,
        documentCode: String
    ): TransactionHeaderEntity

    suspend fun addTransactionDetail(
        product: Product,
        quantity: Int,
        documentNumber: Int
    )

    fun getTransactionDetail(documentNumber: Int): Flow<List<TransactionDetailEntity>>
    fun getTransactionHeaderWithDetail(documentNumber: Int): Flow<TransactionHeaderWithDetail>
    suspend fun updateQuantity(item: TransactionDetailEntity, quantity: Int)
}
