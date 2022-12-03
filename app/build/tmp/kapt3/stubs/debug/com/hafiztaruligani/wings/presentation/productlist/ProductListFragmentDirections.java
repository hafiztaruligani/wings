package com.hafiztaruligani.wings.presentation.productlist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00052\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lcom/hafiztaruligani/wings/presentation/productlist/ProductListFragmentDirections;", "", "()V", "ActionProductListFragmentToCheckoutFragment", "ActionProductListFragmentToProductDetailFragment", "Companion", "app_debug"})
public final class ProductListFragmentDirections {
    @org.jetbrains.annotations.NotNull()
    public static final com.hafiztaruligani.wings.presentation.productlist.ProductListFragmentDirections.Companion Companion = null;
    
    private ProductListFragmentDirections() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001b"}, d2 = {"Lcom/hafiztaruligani/wings/presentation/productlist/ProductListFragmentDirections$ActionProductListFragmentToProductDetailFragment;", "Landroidx/navigation/NavDirections;", "product", "Lcom/hafiztaruligani/wings/domain/model/Product;", "documentNumber", "", "(Lcom/hafiztaruligani/wings/domain/model/Product;I)V", "actionId", "getActionId", "()I", "arguments", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "getDocumentNumber", "getProduct", "()Lcom/hafiztaruligani/wings/domain/model/Product;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    static final class ActionProductListFragmentToProductDetailFragment implements androidx.navigation.NavDirections {
        @org.jetbrains.annotations.NotNull()
        private final com.hafiztaruligani.wings.domain.model.Product product = null;
        private final int documentNumber = 0;
        private final int actionId = com.hafiztaruligani.wings.R.id.action_productListFragment_to_productDetailFragment;
        
        @org.jetbrains.annotations.NotNull()
        public final com.hafiztaruligani.wings.presentation.productlist.ProductListFragmentDirections.ActionProductListFragmentToProductDetailFragment copy(@org.jetbrains.annotations.NotNull()
        com.hafiztaruligani.wings.domain.model.Product product, int documentNumber) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ActionProductListFragmentToProductDetailFragment(@org.jetbrains.annotations.NotNull()
        com.hafiztaruligani.wings.domain.model.Product product, int documentNumber) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.hafiztaruligani.wings.domain.model.Product component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.hafiztaruligani.wings.domain.model.Product getProduct() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getDocumentNumber() {
            return 0;
        }
        
        @java.lang.Override()
        public int getActionId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"CAST_NEVER_SUCCEEDS"})
        @java.lang.Override()
        public android.os.Bundle getArguments() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007\u00a8\u0006\u0016"}, d2 = {"Lcom/hafiztaruligani/wings/presentation/productlist/ProductListFragmentDirections$ActionProductListFragmentToCheckoutFragment;", "Landroidx/navigation/NavDirections;", "documentNumber", "", "(I)V", "actionId", "getActionId", "()I", "arguments", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "getDocumentNumber", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    static final class ActionProductListFragmentToCheckoutFragment implements androidx.navigation.NavDirections {
        private final int documentNumber = 0;
        private final int actionId = com.hafiztaruligani.wings.R.id.action_productListFragment_to_checkoutFragment;
        
        @org.jetbrains.annotations.NotNull()
        public final com.hafiztaruligani.wings.presentation.productlist.ProductListFragmentDirections.ActionProductListFragmentToCheckoutFragment copy(int documentNumber) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ActionProductListFragmentToCheckoutFragment(int documentNumber) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getDocumentNumber() {
            return 0;
        }
        
        @java.lang.Override()
        public int getActionId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.os.Bundle getArguments() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\n"}, d2 = {"Lcom/hafiztaruligani/wings/presentation/productlist/ProductListFragmentDirections$Companion;", "", "()V", "actionProductListFragmentToCheckoutFragment", "Landroidx/navigation/NavDirections;", "documentNumber", "", "actionProductListFragmentToProductDetailFragment", "product", "Lcom/hafiztaruligani/wings/domain/model/Product;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.navigation.NavDirections actionProductListFragmentToProductDetailFragment(@org.jetbrains.annotations.NotNull()
        com.hafiztaruligani.wings.domain.model.Product product, int documentNumber) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.navigation.NavDirections actionProductListFragmentToCheckoutFragment(int documentNumber) {
            return null;
        }
    }
}