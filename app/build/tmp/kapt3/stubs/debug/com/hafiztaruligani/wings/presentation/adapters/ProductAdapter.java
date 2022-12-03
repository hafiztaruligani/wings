package com.hafiztaruligani.wings.presentation.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001fB5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\b2\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0007H\u0002J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0018\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0007H\u0002R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u000b\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00070\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/hafiztaruligani/wings/presentation/adapters/ProductAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/hafiztaruligani/wings/presentation/adapters/ProductAdapter$ViewHolder;", "productDiffUtil", "Lcom/hafiztaruligani/cryptoday/util/ProductDiffUtil;", "navigateToDetail", "Lkotlin/Function1;", "Lcom/hafiztaruligani/wings/domain/model/Product;", "", "buy", "(Lcom/hafiztaruligani/cryptoday/util/ProductDiffUtil;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "data", "Landroidx/recyclerview/widget/AsyncListDiffer;", "kotlin.jvm.PlatformType", "getData", "()Landroidx/recyclerview/widget/AsyncListDiffer;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setupButton", "Lcom/hafiztaruligani/wings/databinding/ItemProductBinding;", "binding", "item", "setupImage", "setupText", "ViewHolder", "app_debug"})
public final class ProductAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.hafiztaruligani.wings.presentation.adapters.ProductAdapter.ViewHolder> {
    private final com.hafiztaruligani.cryptoday.util.ProductDiffUtil productDiffUtil = null;
    private final kotlin.jvm.functions.Function1<com.hafiztaruligani.wings.domain.model.Product, kotlin.Unit> navigateToDetail = null;
    private final kotlin.jvm.functions.Function1<com.hafiztaruligani.wings.domain.model.Product, kotlin.Unit> buy = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.AsyncListDiffer<com.hafiztaruligani.wings.domain.model.Product> data = null;
    
    public ProductAdapter(@org.jetbrains.annotations.NotNull()
    com.hafiztaruligani.cryptoday.util.ProductDiffUtil productDiffUtil, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.hafiztaruligani.wings.domain.model.Product, kotlin.Unit> navigateToDetail, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.hafiztaruligani.wings.domain.model.Product, kotlin.Unit> buy) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.AsyncListDiffer<com.hafiztaruligani.wings.domain.model.Product> getData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.hafiztaruligani.wings.presentation.adapters.ProductAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.hafiztaruligani.wings.presentation.adapters.ProductAdapter.ViewHolder holder, int position) {
    }
    
    private final void setupImage(com.hafiztaruligani.wings.databinding.ItemProductBinding binding) {
    }
    
    private final com.hafiztaruligani.wings.databinding.ItemProductBinding setupText(com.hafiztaruligani.wings.databinding.ItemProductBinding binding, com.hafiztaruligani.wings.domain.model.Product item) {
        return null;
    }
    
    private final com.hafiztaruligani.wings.databinding.ItemProductBinding setupButton(com.hafiztaruligani.wings.databinding.ItemProductBinding binding, com.hafiztaruligani.wings.domain.model.Product item) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/hafiztaruligani/wings/presentation/adapters/ProductAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/hafiztaruligani/wings/databinding/ItemProductBinding;", "(Lcom/hafiztaruligani/wings/presentation/adapters/ProductAdapter;Lcom/hafiztaruligani/wings/databinding/ItemProductBinding;)V", "getBinding", "()Lcom/hafiztaruligani/wings/databinding/ItemProductBinding;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.hafiztaruligani.wings.databinding.ItemProductBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.hafiztaruligani.wings.databinding.ItemProductBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.hafiztaruligani.wings.databinding.ItemProductBinding getBinding() {
            return null;
        }
    }
}