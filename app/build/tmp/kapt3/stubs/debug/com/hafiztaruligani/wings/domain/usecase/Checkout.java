package com.hafiztaruligani.wings.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J)\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\nH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/hafiztaruligani/wings/domain/usecase/Checkout;", "", "productsRepository", "Lcom/hafiztaruligani/wings/domain/repository/ProductsRepository;", "userRepository", "Lcom/hafiztaruligani/wings/domain/repository/UserRepository;", "(Lcom/hafiztaruligani/wings/domain/repository/ProductsRepository;Lcom/hafiztaruligani/wings/domain/repository/UserRepository;)V", "addTransactionHeader", "", "total", "", "documentNumber", "documentCode", "", "(IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/hafiztaruligani/wings/data/local/room/entity/TransactionHeaderWithDetail;", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observerTransactionDetail", "Lkotlinx/coroutines/Job;", "app_debug"})
public final class Checkout {
    private final com.hafiztaruligani.wings.domain.repository.ProductsRepository productsRepository = null;
    private final com.hafiztaruligani.wings.domain.repository.UserRepository userRepository = null;
    
    @javax.inject.Inject()
    public Checkout(@org.jetbrains.annotations.NotNull()
    com.hafiztaruligani.wings.domain.repository.ProductsRepository productsRepository, @org.jetbrains.annotations.NotNull()
    com.hafiztaruligani.wings.domain.repository.UserRepository userRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(int documentNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.hafiztaruligani.wings.data.local.room.entity.TransactionHeaderWithDetail>> continuation) {
        return null;
    }
    
    private final java.lang.Object observerTransactionDetail(int documentNumber, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Job> continuation) {
        return null;
    }
    
    private final java.lang.Object addTransactionHeader(int total, int documentNumber, java.lang.String documentCode, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}