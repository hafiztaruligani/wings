package com.hafiztaruligani.wings.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ1\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00130\u00122\u0006\u0010\b\u001a\u00020\u0007H&J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00122\u0006\u0010\b\u001a\u00020\u0007H&J!\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/hafiztaruligani/wings/domain/repository/ProductsRepository;", "", "addTransactionDetail", "", "product", "Lcom/hafiztaruligani/wings/domain/model/Product;", "quantity", "", "documentNumber", "(Lcom/hafiztaruligani/wings/domain/model/Product;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addTransactionHeader", "Lcom/hafiztaruligani/wings/data/local/room/entity/TransactionHeaderEntity;", "userName", "", "total", "documentCode", "(Ljava/lang/String;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProducts", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/hafiztaruligani/wings/data/local/room/entity/ProductEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTransactionDetail", "Lcom/hafiztaruligani/wings/data/local/room/entity/TransactionDetailEntity;", "getTransactionHeaderWithDetail", "Lcom/hafiztaruligani/wings/data/local/room/entity/TransactionHeaderWithDetail;", "updateQuantity", "item", "(Lcom/hafiztaruligani/wings/data/local/room/entity/TransactionDetailEntity;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ProductsRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getProducts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.hafiztaruligani.wings.data.local.room.entity.ProductEntity>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addTransactionHeader(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, int total, int documentNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String documentCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.hafiztaruligani.wings.data.local.room.entity.TransactionHeaderEntity> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addTransactionDetail(@org.jetbrains.annotations.NotNull()
    com.hafiztaruligani.wings.domain.model.Product product, int quantity, int documentNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.hafiztaruligani.wings.data.local.room.entity.TransactionDetailEntity>> getTransactionDetail(int documentNumber);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.hafiztaruligani.wings.data.local.room.entity.TransactionHeaderWithDetail> getTransactionHeaderWithDetail(int documentNumber);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateQuantity(@org.jetbrains.annotations.NotNull()
    com.hafiztaruligani.wings.data.local.room.entity.TransactionDetailEntity item, int quantity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}