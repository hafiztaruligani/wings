package com.hafiztaruligani.wings.data.local.room.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "product")
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\b\u0010 \u001a\u00020\u0006H\u0002J\t\u0010!\u001a\u00020\u0006H\u00d6\u0001J\u0006\u0010\"\u001a\u00020#J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r\u00a8\u0006%"}, d2 = {"Lcom/hafiztaruligani/wings/data/local/room/entity/ProductEntity;", "", "productCode", "", "productName", "price", "", "currency", "discount", "dimension", "unit", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getDimension", "getDiscount", "()I", "getPrice", "getProductCode", "getProductName", "getUnit", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "getActualPrice", "hashCode", "toProduct", "Lcom/hafiztaruligani/wings/domain/model/Product;", "toString", "app_debug"})
public final class ProductEntity {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "product_code")
    @androidx.room.PrimaryKey(autoGenerate = false)
    private final java.lang.String productCode = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "product_name")
    private final java.lang.String productName = null;
    private final int price = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String currency = null;
    private final int discount = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String dimension = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String unit = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.hafiztaruligani.wings.data.local.room.entity.ProductEntity copy(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    java.lang.String productName, int price, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, int discount, @org.jetbrains.annotations.NotNull()
    java.lang.String dimension, @org.jetbrains.annotations.NotNull()
    java.lang.String unit) {
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
    
    public ProductEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    java.lang.String productName, int price, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, int discount, @org.jetbrains.annotations.NotNull()
    java.lang.String dimension, @org.jetbrains.annotations.NotNull()
    java.lang.String unit) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProductCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProductName() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getPrice() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrency() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getDiscount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDimension() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUnit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.hafiztaruligani.wings.domain.model.Product toProduct() {
        return null;
    }
    
    private final int getActualPrice() {
        return 0;
    }
}