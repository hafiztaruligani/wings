package com.hafiztaruligani.wings.presentation.checkout

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hafiztaruligani.wings.data.local.room.entity.TransactionDetailEntity
import com.hafiztaruligani.wings.data.local.room.entity.TransactionHeaderWithDetail
import com.hafiztaruligani.wings.domain.usecase.Checkout
import com.hafiztaruligani.wings.domain.usecase.UpdateQuantity
import com.hafiztaruligani.wings.presentation.CommonUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@HiltViewModel
class CheckoutViewModel @Inject constructor(
    private val checkout: Checkout,
    private val updateQuantity: UpdateQuantity
) : ViewModel() {

    private val _uiState = MutableStateFlow(CommonUiState<TransactionHeaderWithDetail>())
    val uiState: StateFlow<CommonUiState<TransactionHeaderWithDetail>> = _uiState

    fun initData(documentNumber: Int) = viewModelScope.launch(Dispatchers.IO) {
        checkout.invoke(documentNumber).collectLatest {
            _uiState.value = CommonUiState(data = it)
        }
    }

    fun updateQuantity(item: TransactionDetailEntity, quantity: Int) =
        viewModelScope.launch(Dispatchers.IO) {
            updateQuantity.invoke(item, quantity)
        }
}
