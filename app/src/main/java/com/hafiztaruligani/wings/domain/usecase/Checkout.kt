package com.hafiztaruligani.wings.domain.usecase

import com.hafiztaruligani.wings.data.local.room.entity.TransactionHeaderWithDetail
import com.hafiztaruligani.wings.domain.repository.ProductsRepository
import com.hafiztaruligani.wings.domain.repository.UserRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import javax.inject.Inject

class Checkout @Inject constructor(
    private val productsRepository: ProductsRepository,
    private val userRepository: UserRepository
) {
    suspend operator fun invoke(documentNumber: Int): Flow<TransactionHeaderWithDetail> {
        observerTransactionDetail(documentNumber)
        return productsRepository.getTransactionHeaderWithDetail(documentNumber)
    }

    private suspend fun observerTransactionDetail(
        documentNumber: Int
    ) = CoroutineScope(Dispatchers.IO).launch {
        productsRepository.getTransactionDetail(documentNumber).collect { listTransactionDetail ->
            var total = 0
            var documentCode = ""
            listTransactionDetail.forEach { detail ->
                total += detail.subTotal
                documentCode = detail.documentCode
            }
            addTransactionHeader(total, documentNumber, documentCode)
        }
    }

    private suspend fun addTransactionHeader(
        total: Int,
        documentNumber: Int,
        documentCode: String
    ) {
        val username = userRepository.getUserName().first()
        username?.let {
            productsRepository.addTransactionHeader(
                userName = username,
                total = total,
                documentNumber = documentNumber,
                documentCode = documentCode
            )
        }
    }
}
