package com.hafiztaruligani.wings.data.local.room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t0\bH\'J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\t0\b2\u0006\u0010\f\u001a\u00020\rH\'J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\bH\'J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\f\u001a\u00020\rH\'J\u001f\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bH\'J\u0019\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u000fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J!\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ!\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/hafiztaruligani/wings/data/local/room/ProductDao;", "", "getProduct", "Lcom/hafiztaruligani/wings/data/local/room/entity/ProductEntity;", "productCode", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProducts", "Lkotlinx/coroutines/flow/Flow;", "", "getTransactionDetail", "Lcom/hafiztaruligani/wings/data/local/room/entity/TransactionDetailEntity;", "documentNumber", "", "getTransactionHeader", "Lcom/hafiztaruligani/wings/data/local/room/entity/TransactionHeaderEntity;", "getTransactionHeaderWithDetail", "Lcom/hafiztaruligani/wings/data/local/room/entity/TransactionHeaderWithDetail;", "insertProducts", "", "data", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTransactionDetail", "insertTransactionHeader", "transactionHeader", "(Lcom/hafiztaruligani/wings/data/local/room/entity/TransactionHeaderEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateQuantity", "quantity", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSubTotal", "subTotal", "app_debug"})
public abstract interface ProductDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM product")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.hafiztaruligani.wings.data.local.room.entity.ProductEntity>> getProducts();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertProducts(@org.jetbrains.annotations.NotNull()
    java.util.List<com.hafiztaruligani.wings.data.local.room.entity.ProductEntity> data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM transaction_header")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.hafiztaruligani.wings.data.local.room.entity.TransactionHeaderEntity>> getTransactionHeader();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertTransactionHeader(@org.jetbrains.annotations.NotNull()
    com.hafiztaruligani.wings.data.local.room.entity.TransactionHeaderEntity transactionHeader, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertTransactionDetail(@org.jetbrains.annotations.NotNull()
    com.hafiztaruligani.wings.data.local.room.entity.TransactionDetailEntity data);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM transaction_detail WHERE document_number=:documentNumber")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.hafiztaruligani.wings.data.local.room.entity.TransactionDetailEntity>> getTransactionDetail(int documentNumber);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM transaction_header WHERE document_number=:documentNumber")
    @androidx.room.Transaction()
    public abstract kotlinx.coroutines.flow.Flow<com.hafiztaruligani.wings.data.local.room.entity.TransactionHeaderWithDetail> getTransactionHeaderWithDetail(int documentNumber);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "UPDATE transaction_detail SET quantity=:quantity WHERE product_code=:productCode")
    public abstract java.lang.Object updateQuantity(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, int quantity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "UPDATE transaction_detail SET subTotal=:subTotal WHERE product_code=:productCode")
    public abstract java.lang.Object updateSubTotal(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, int subTotal, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM product WHERE product_code=:productCode")
    public abstract java.lang.Object getProduct(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.hafiztaruligani.wings.data.local.room.entity.ProductEntity> continuation);
}