package com.hafiztaruligani.wings.domain.usecase

import com.hafiztaruligani.cryptoday.util.Resource
import com.hafiztaruligani.wings.domain.model.Product
import com.hafiztaruligani.wings.domain.repository.ProductsRepository
import java.io.IOException
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import retrofit2.HttpException

class GetProducts @Inject constructor(
    private val productsRepository: ProductsRepository
) {
    suspend operator fun invoke(): Flow<Resource<List<Product>>> = flow {
        emit(Resource.Loading())
        try {
            val data = productsRepository.getProducts().map { it.map { item -> item.toProduct() } }
            data.collect {
                if (it.isNotEmpty()) emit(
                    Resource.Success(it)
                )
            }
        } catch (e: HttpException) {
            emit(Resource.Error())
        } catch (e: IOException) {
            emit(Resource.Error(Resource.NETWORK_UNAVAILABLE))
        }
    }
}
