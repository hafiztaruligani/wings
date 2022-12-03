package com.hafiztaruligani.wings.presentation.checkout;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0004\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/hafiztaruligani/wings/presentation/checkout/CheckoutViewModel;", "Landroidx/lifecycle/ViewModel;", "checkout", "Lcom/hafiztaruligani/wings/domain/usecase/Checkout;", "updateQuantity", "Lcom/hafiztaruligani/wings/domain/usecase/UpdateQuantity;", "(Lcom/hafiztaruligani/wings/domain/usecase/Checkout;Lcom/hafiztaruligani/wings/domain/usecase/UpdateQuantity;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/hafiztaruligani/wings/presentation/CommonUiState;", "Lcom/hafiztaruligani/wings/data/local/room/entity/TransactionHeaderWithDetail;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "initData", "Lkotlinx/coroutines/Job;", "documentNumber", "", "item", "Lcom/hafiztaruligani/wings/data/local/room/entity/TransactionDetailEntity;", "quantity", "app_debug"})
public final class CheckoutViewModel extends androidx.lifecycle.ViewModel {
    private final com.hafiztaruligani.wings.domain.usecase.Checkout checkout = null;
    private final com.hafiztaruligani.wings.domain.usecase.UpdateQuantity updateQuantity = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.hafiztaruligani.wings.presentation.CommonUiState<com.hafiztaruligani.wings.data.local.room.entity.TransactionHeaderWithDetail>> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.hafiztaruligani.wings.presentation.CommonUiState<com.hafiztaruligani.wings.data.local.room.entity.TransactionHeaderWithDetail>> uiState = null;
    
    @javax.inject.Inject()
    public CheckoutViewModel(@org.jetbrains.annotations.NotNull()
    com.hafiztaruligani.wings.domain.usecase.Checkout checkout, @org.jetbrains.annotations.NotNull()
    com.hafiztaruligani.wings.domain.usecase.UpdateQuantity updateQuantity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.hafiztaruligani.wings.presentation.CommonUiState<com.hafiztaruligani.wings.data.local.room.entity.TransactionHeaderWithDetail>> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job initData(int documentNumber) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateQuantity(@org.jetbrains.annotations.NotNull()
    com.hafiztaruligani.wings.data.local.room.entity.TransactionDetailEntity item, int quantity) {
        return null;
    }
}