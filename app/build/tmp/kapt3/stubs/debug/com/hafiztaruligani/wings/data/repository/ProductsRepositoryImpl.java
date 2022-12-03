package com.hafiztaruligani.wings.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J)\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ1\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0012H\u0002J\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u001c\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00190\u00182\u0006\u0010\r\u001a\u00020\fH\u0016J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00182\u0006\u0010\r\u001a\u00020\fH\u0016J!\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006#"}, d2 = {"Lcom/hafiztaruligani/wings/data/repository/ProductsRepositoryImpl;", "Lcom/hafiztaruligani/wings/domain/repository/ProductsRepository;", "apiService", "Lcom/hafiztaruligani/wings/data/remote/ApiService;", "productDao", "Lcom/hafiztaruligani/wings/data/local/room/ProductDao;", "(Lcom/hafiztaruligani/wings/data/remote/ApiService;Lcom/hafiztaruligani/wings/data/local/room/ProductDao;)V", "addTransactionDetail", "", "product", "Lcom/hafiztaruligani/wings/domain/model/Product;", "quantity", "", "documentNumber", "(Lcom/hafiztaruligani/wings/domain/model/Product;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addTransactionHeader", "Lcom/hafiztaruligani/wings/data/local/room/entity/TransactionHeaderEntity;", "userName", "", "total", "documentCode", "(Ljava/lang/String;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDate", "getProducts", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/hafiztaruligani/wings/data/local/room/entity/ProductEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTransactionDetail", "Lcom/hafiztaruligani/wings/data/local/room/entity/TransactionDetailEntity;", "getTransactionHeaderWithDetail", "Lcom/hafiztaruligani/wings/data/local/room/entity/TransactionHeaderWithDetail;", "updateQuantity", "item", "(Lcom/hafiztaruligani/wings/data/local/room/entity/TransactionDetailEntity;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ProductsRepositoryImpl implements com.hafiztaruligani.wings.domain.repository.ProductsRepository {
    private final com.hafiztaruligani.wings.data.remote.ApiService apiService = null;
    private final com.hafiztaruligani.wings.data.local.room.ProductDao productDao = null;
    
    public ProductsRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.hafiztaruligani.wings.data.remote.ApiService apiService, @org.jetbrains.annotations.NotNull()
    com.hafiztaruligani.wings.data.local.room.ProductDao productDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getProducts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.hafiztaruligani.wings.data.local.room.entity.ProductEntity>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object addTransactionHeader(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, int total, int documentNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String documentCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.hafiztaruligani.wings.data.local.room.entity.TransactionHeaderEntity> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object addTransactionDetail(@org.jetbrains.annotations.NotNull()
    com.hafiztaruligani.wings.domain.model.Product product, int quantity, int documentNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.hafiztaruligani.wings.data.local.room.entity.TransactionDetailEntity>> getTransactionDetail(int documentNumber) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.hafiztaruligani.wings.data.local.room.entity.TransactionHeaderWithDetail> getTransactionHeaderWithDetail(int documentNumber) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateQuantity(@org.jetbrains.annotations.NotNull()
    com.hafiztaruligani.wings.data.local.room.entity.TransactionDetailEntity item, int quantity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.String getDate() {
        return null;
    }
}