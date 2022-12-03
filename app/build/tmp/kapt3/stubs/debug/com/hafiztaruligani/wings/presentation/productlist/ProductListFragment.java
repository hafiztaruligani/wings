package com.hafiztaruligani.wings.presentation.productlist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u001c\u0010\u0017\u001a\u00020\u00122\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u001a0\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u0012H\u0002J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bH\u0002J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010\'\u001a\u00020\u0006H\u0002J\b\u0010(\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006)"}, d2 = {"Lcom/hafiztaruligani/wings/presentation/productlist/ProductListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/hafiztaruligani/wings/presentation/adapters/ProductAdapter;", "binding", "Lcom/hafiztaruligani/wings/databinding/FragmentProductListBinding;", "product", "Lcom/hafiztaruligani/wings/domain/model/Product;", "quantityDialog", "Lcom/hafiztaruligani/wings/presentation/productlist/QuantityDialog;", "viewModel", "Lcom/hafiztaruligani/wings/presentation/productlist/ProductListViewModel;", "getViewModel", "()Lcom/hafiztaruligani/wings/presentation/productlist/ProductListViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "addTransactionDetail", "", "quantity", "", "bindData", "buyAction", "errorHandler", "uiState", "Lcom/hafiztaruligani/wings/presentation/CommonUiState;", "", "navigateToCheckout", "navigateToDetail", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setupButton", "setupRc", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ProductListFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.hafiztaruligani.wings.databinding.FragmentProductListBinding binding;
    private com.hafiztaruligani.wings.presentation.adapters.ProductAdapter adapter;
    private com.hafiztaruligani.wings.presentation.productlist.QuantityDialog quantityDialog;
    private com.hafiztaruligani.wings.domain.model.Product product;
    
    public ProductListFragment() {
        super();
    }
    
    private final com.hafiztaruligani.wings.presentation.productlist.ProductListViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final com.hafiztaruligani.wings.databinding.FragmentProductListBinding setupButton() {
        return null;
    }
    
    private final void navigateToCheckout() {
    }
    
    private final void setupRc() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void bindData() {
    }
    
    private final void errorHandler(com.hafiztaruligani.wings.presentation.CommonUiState<java.util.List<com.hafiztaruligani.wings.domain.model.Product>> uiState) {
    }
    
    private final void buyAction(com.hafiztaruligani.wings.domain.model.Product product) {
    }
    
    private final void addTransactionDetail(int quantity) {
    }
    
    private final void navigateToDetail(com.hafiztaruligani.wings.domain.model.Product product) {
    }
}