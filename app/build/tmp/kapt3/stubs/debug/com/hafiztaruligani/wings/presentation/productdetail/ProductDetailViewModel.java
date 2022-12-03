package com.hafiztaruligani.wings.presentation.productdetail;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/hafiztaruligani/wings/presentation/productdetail/ProductDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "addTransactionDetail", "Lcom/hafiztaruligani/wings/domain/usecase/AddTransactionDetail;", "(Lcom/hafiztaruligani/wings/domain/usecase/AddTransactionDetail;)V", "Lkotlinx/coroutines/Job;", "product", "Lcom/hafiztaruligani/wings/domain/model/Product;", "quantity", "", "documentNumber", "app_debug"})
public final class ProductDetailViewModel extends androidx.lifecycle.ViewModel {
    private final com.hafiztaruligani.wings.domain.usecase.AddTransactionDetail addTransactionDetail = null;
    
    @javax.inject.Inject()
    public ProductDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.hafiztaruligani.wings.domain.usecase.AddTransactionDetail addTransactionDetail) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job addTransactionDetail(@org.jetbrains.annotations.NotNull()
    com.hafiztaruligani.wings.domain.model.Product product, int quantity, int documentNumber) {
        return null;
    }
}