package com.hafiztaruligani.wings.presentation.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001fB-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u001e\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0004\u0012\u00020\n0\u0006\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0013\u001a\u00020\n2\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0016J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\f\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\b0\b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R&\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/hafiztaruligani/wings/presentation/adapters/CheckoutProductAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/hafiztaruligani/wings/presentation/adapters/CheckoutProductAdapter$ViewHolder;", "checkoutProductDiffUtil", "Lcom/hafiztaruligani/cryptoday/util/CheckoutProductDiffUtil;", "quantityChange", "Lkotlin/Function1;", "Lkotlin/Pair;", "Lcom/hafiztaruligani/wings/data/local/room/entity/TransactionDetailEntity;", "", "", "(Lcom/hafiztaruligani/cryptoday/util/CheckoutProductDiffUtil;Lkotlin/jvm/functions/Function1;)V", "data", "Landroidx/recyclerview/widget/AsyncListDiffer;", "kotlin.jvm.PlatformType", "getData", "()Landroidx/recyclerview/widget/AsyncListDiffer;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setupImage", "binding", "Lcom/hafiztaruligani/wings/databinding/ItemCheckoutProductBinding;", "setupText", "item", "ViewHolder", "app_debug"})
public final class CheckoutProductAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.hafiztaruligani.wings.presentation.adapters.CheckoutProductAdapter.ViewHolder> {
    private final com.hafiztaruligani.cryptoday.util.CheckoutProductDiffUtil checkoutProductDiffUtil = null;
    private final kotlin.jvm.functions.Function1<kotlin.Pair<com.hafiztaruligani.wings.data.local.room.entity.TransactionDetailEntity, java.lang.String>, kotlin.Unit> quantityChange = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.AsyncListDiffer<com.hafiztaruligani.wings.data.local.room.entity.TransactionDetailEntity> data = null;
    
    public CheckoutProductAdapter(@org.jetbrains.annotations.NotNull()
    com.hafiztaruligani.cryptoday.util.CheckoutProductDiffUtil checkoutProductDiffUtil, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.Pair<com.hafiztaruligani.wings.data.local.room.entity.TransactionDetailEntity, java.lang.String>, kotlin.Unit> quantityChange) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.AsyncListDiffer<com.hafiztaruligani.wings.data.local.room.entity.TransactionDetailEntity> getData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.hafiztaruligani.wings.presentation.adapters.CheckoutProductAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.hafiztaruligani.wings.presentation.adapters.CheckoutProductAdapter.ViewHolder holder, int position) {
    }
    
    private final void setupImage(com.hafiztaruligani.wings.databinding.ItemCheckoutProductBinding binding) {
    }
    
    private final com.hafiztaruligani.wings.databinding.ItemCheckoutProductBinding setupText(com.hafiztaruligani.wings.data.local.room.entity.TransactionDetailEntity item, com.hafiztaruligani.wings.databinding.ItemCheckoutProductBinding binding) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/hafiztaruligani/wings/presentation/adapters/CheckoutProductAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/hafiztaruligani/wings/databinding/ItemCheckoutProductBinding;", "(Lcom/hafiztaruligani/wings/presentation/adapters/CheckoutProductAdapter;Lcom/hafiztaruligani/wings/databinding/ItemCheckoutProductBinding;)V", "getBinding", "()Lcom/hafiztaruligani/wings/databinding/ItemCheckoutProductBinding;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.hafiztaruligani.wings.databinding.ItemCheckoutProductBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.hafiztaruligani.wings.databinding.ItemCheckoutProductBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.hafiztaruligani.wings.databinding.ItemCheckoutProductBinding getBinding() {
            return null;
        }
    }
}