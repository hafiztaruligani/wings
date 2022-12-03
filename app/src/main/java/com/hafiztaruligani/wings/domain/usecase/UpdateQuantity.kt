package com.hafiztaruligani.wings.domain.usecase

import com.hafiztaruligani.wings.data.local.room.entity.TransactionDetailEntity
import com.hafiztaruligani.wings.domain.repository.ProductsRepository
import javax.inject.Inject

class UpdateQuantity @Inject constructor(
    private val productsRepository: ProductsRepository
) {
    suspend operator fun invoke(item: TransactionDetailEntity, quantity: Int) {
        productsRepository.updateQuantity(item, quantity)
    }
}
