package com.hafiztaruligani.wings.presentation.productlist;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0004\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\rJ\u0006\u0010\u0017\u001a\u00020\u0014R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0018"}, d2 = {"Lcom/hafiztaruligani/wings/presentation/productlist/ProductListViewModel;", "Landroidx/lifecycle/ViewModel;", "getProducts", "Lcom/hafiztaruligani/wings/domain/usecase/GetProducts;", "addTransactionDetail", "Lcom/hafiztaruligani/wings/domain/usecase/AddTransactionDetail;", "(Lcom/hafiztaruligani/wings/domain/usecase/GetProducts;Lcom/hafiztaruligani/wings/domain/usecase/AddTransactionDetail;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/hafiztaruligani/wings/presentation/CommonUiState;", "", "Lcom/hafiztaruligani/wings/domain/model/Product;", "documentNumber", "", "getDocumentNumber", "()I", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/Job;", "product", "quantity", "initData", "app_debug"})
public final class ProductListViewModel extends androidx.lifecycle.ViewModel {
    private final com.hafiztaruligani.wings.domain.usecase.GetProducts getProducts = null;
    private final com.hafiztaruligani.wings.domain.usecase.AddTransactionDetail addTransactionDetail = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.hafiztaruligani.wings.presentation.CommonUiState<java.util.List<com.hafiztaruligani.wings.domain.model.Product>>> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.hafiztaruligani.wings.presentation.CommonUiState<java.util.List<com.hafiztaruligani.wings.domain.model.Product>>> uiState = null;
    private final int documentNumber = 0;
    
    @javax.inject.Inject()
    public ProductListViewModel(@org.jetbrains.annotations.NotNull()
    com.hafiztaruligani.wings.domain.usecase.GetProducts getProducts, @org.jetbrains.annotations.NotNull()
    com.hafiztaruligani.wings.domain.usecase.AddTransactionDetail addTransactionDetail) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.hafiztaruligani.wings.presentation.CommonUiState<java.util.List<com.hafiztaruligani.wings.domain.model.Product>>> getUiState() {
        return null;
    }
    
    public final int getDocumentNumber() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job initData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job addTransactionDetail(@org.jetbrains.annotations.NotNull()
    com.hafiztaruligani.wings.domain.model.Product product, int quantity) {
        return null;
    }
}