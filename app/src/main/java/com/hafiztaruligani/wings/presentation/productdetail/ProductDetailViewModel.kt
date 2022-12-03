package com.hafiztaruligani.wings.presentation.productdetail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hafiztaruligani.wings.domain.model.Product
import com.hafiztaruligani.wings.domain.usecase.AddTransactionDetail
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@HiltViewModel
class ProductDetailViewModel @Inject constructor(
    private val addTransactionDetail: AddTransactionDetail
) : ViewModel() {
    fun addTransactionDetail(
        product: Product,
        quantity: Int,
        documentNumber: Int
    ) =
        viewModelScope.launch(Dispatchers.IO) {
            addTransactionDetail.invoke(
                product,
                quantity,
                documentNumber
            )
        }
}
