package com.hafiztaruligani.wings.presentation.productlist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hafiztaruligani.cryptoday.util.Resource
import com.hafiztaruligani.wings.domain.model.Product
import com.hafiztaruligani.wings.domain.usecase.AddTransactionDetail
import com.hafiztaruligani.wings.domain.usecase.GetProducts
import com.hafiztaruligani.wings.presentation.CommonUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import java.util.Random
import javax.inject.Inject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@HiltViewModel
class ProductListViewModel @Inject constructor(
    private val getProducts: GetProducts,
    private val addTransactionDetail: AddTransactionDetail
) : ViewModel() {

    private val _uiState = MutableStateFlow(CommonUiState<List<Product>>(loading = true))
    val uiState: StateFlow<CommonUiState<List<Product>>> = _uiState
    val documentNumber = Random().nextInt()

    fun initData() = viewModelScope.launch(Dispatchers.IO) {
        getProducts.invoke().collect {
            withContext(Dispatchers.Main) {
                _uiState.value = when (it) {
                    is Resource.Error -> CommonUiState(error = it.message)
                    is Resource.Loading -> CommonUiState(loading = true)
                    is Resource.Success -> CommonUiState(data = it.data)
                }
            }
        }
    }

    fun addTransactionDetail(product: Product, quantity: Int) =
        viewModelScope.launch(Dispatchers.IO) {
            addTransactionDetail.invoke(
                product,
                quantity,
                documentNumber
            )
        }
}
