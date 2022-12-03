package com.hafiztaruligani.wings.data.repository

import com.hafiztaruligani.wings.data.local.room.ProductDao
import com.hafiztaruligani.wings.data.local.room.entity.ProductEntity
import com.hafiztaruligani.wings.data.local.room.entity.TransactionDetailEntity
import com.hafiztaruligani.wings.data.local.room.entity.TransactionHeaderEntity
import com.hafiztaruligani.wings.data.local.room.entity.TransactionHeaderWithDetail
import com.hafiztaruligani.wings.data.remote.ApiService
import com.hafiztaruligani.wings.data.remote.dto.ProductsItemResponse
import com.hafiztaruligani.wings.domain.model.Product
import com.hafiztaruligani.wings.domain.repository.ProductsRepository
import java.text.SimpleDateFormat
import java.util.*
import kotlinx.coroutines.flow.Flow

class ProductsRepositoryImpl(
    private val apiService: ApiService,
    private val productDao: ProductDao
) : ProductsRepository {
    override suspend fun getProducts(): Flow<List<ProductEntity>> {
        val remoteData: List<ProductsItemResponse> = apiService.getProductList().products.filter {
            it.productName.isNotBlank()
        }
        productDao.insertProducts(remoteData.map { it.toProductEntity() })
        return productDao.getProducts()
    }

    override suspend fun addTransactionHeader(
        userName: String,
        total: Int,
        documentNumber: Int,
        documentCode: String
    ): TransactionHeaderEntity {
        val transactionHeader = TransactionHeaderEntity(
            user = userName,
            total = total,
            date = getDate(),
            documentNumber = documentNumber,
            documentCode = documentCode
        )
        productDao.insertTransactionHeader(transactionHeader)
        return transactionHeader
    }

    override suspend fun addTransactionDetail(
        product: Product,
        quantity: Int,
        documentNumber: Int
    ) {
        val data = TransactionDetailEntity(
            productCode = product.productCode,
            documentNumber = documentNumber,
            documentCode = "TRX-$documentNumber",
            produceName = product.productName,
            price = product.actualPrice,
            quantity = quantity,
            unit = product.unit,
            currency = product.currency,
        )
        productDao.insertTransactionDetail(data)
    }

    override fun getTransactionDetail(documentNumber: Int): Flow<List<TransactionDetailEntity>> {
        return productDao.getTransactionDetail(documentNumber)
    }

    override fun getTransactionHeaderWithDetail(documentNumber: Int): Flow<TransactionHeaderWithDetail> {
        return productDao.getTransactionHeaderWithDetail(documentNumber)
    }

    override suspend fun updateQuantity(item: TransactionDetailEntity, quantity: Int) {
        productDao.updateQuantity(item.productCode, quantity)
        val productPrice = productDao.getProduct(item.productCode).toProduct().actualPrice
        if (item.subTotal> 0)
            productDao.updateSubTotal(
                item.productCode,
                quantity * productPrice
            )
    }

    private fun getDate(): String {
        val sdf = SimpleDateFormat("dd-MM-yyyy", Locale.US)
        return sdf.format(Date())
    }
}
