package com.hafiztaruligani.wings.domain.usecase

import com.hafiztaruligani.wings.domain.model.Product
import com.hafiztaruligani.wings.domain.repository.ProductsRepository
import javax.inject.Inject

class AddTransactionDetail@Inject constructor(
    private val productRepository: ProductsRepository
) {
    suspend operator fun invoke(product: Product, quantity: Int, documentNumber: Int) {
        productRepository.addTransactionDetail(product, quantity, documentNumber)
    }
}
