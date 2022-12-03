package com.hafiztaruligani.wings.data.local.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import androidx.room.Transaction
import com.hafiztaruligani.wings.data.local.room.entity.ProductEntity
import com.hafiztaruligani.wings.data.local.room.entity.TransactionDetailEntity
import com.hafiztaruligani.wings.data.local.room.entity.TransactionHeaderEntity
import com.hafiztaruligani.wings.data.local.room.entity.TransactionHeaderWithDetail
import kotlinx.coroutines.flow.Flow

@Dao
interface ProductDao {

    @Query("SELECT * FROM product")
    fun getProducts(): Flow<List<ProductEntity>>

    @Insert(onConflict = REPLACE)
    suspend fun insertProducts(data: List<ProductEntity>)

    @Query("SELECT * FROM transaction_header")
    fun getTransactionHeader(): Flow<List<TransactionHeaderEntity>>

    @Insert(onConflict = REPLACE)
    suspend fun insertTransactionHeader(transactionHeader: TransactionHeaderEntity)

    @Insert(onConflict = REPLACE)
    fun insertTransactionDetail(data: TransactionDetailEntity)

    @Query("SELECT * FROM transaction_detail WHERE document_number=:documentNumber")
    fun getTransactionDetail(documentNumber: Int): Flow<List<TransactionDetailEntity>>

    @Transaction
    @Query("SELECT * FROM transaction_header WHERE document_number=:documentNumber")
    fun getTransactionHeaderWithDetail(documentNumber: Int): Flow<TransactionHeaderWithDetail>

    @Query("UPDATE transaction_detail SET quantity=:quantity WHERE product_code=:productCode")
    suspend fun updateQuantity(productCode: String, quantity: Int)

    @Query("UPDATE transaction_detail SET subTotal=:subTotal WHERE product_code=:productCode")
    suspend fun updateSubTotal(productCode: String, subTotal: Int)

    @Query("SELECT * FROM product WHERE product_code=:productCode")
    suspend fun getProduct(productCode: String): ProductEntity
}
