package com.hafiztaruligani.wings.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0005"}, d2 = {"Lcom/hafiztaruligani/wings/data/remote/ApiService;", "", "getProductList", "Lcom/hafiztaruligani/wings/data/remote/dto/ProductsResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "3a77288a-edcb-4b8f-9f55-8a6aff7063d6")
    public abstract java.lang.Object getProductList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.hafiztaruligani.wings.data.remote.dto.ProductsResponse> continuation);
}