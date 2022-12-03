package com.hafiztaruligani.cryptoday.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/hafiztaruligani/cryptoday/util/Resource;", "T", "", "()V", "Companion", "Error", "Loading", "Success", "Lcom/hafiztaruligani/cryptoday/util/Resource$Error;", "Lcom/hafiztaruligani/cryptoday/util/Resource$Loading;", "Lcom/hafiztaruligani/cryptoday/util/Resource$Success;", "app_debug"})
public abstract class Resource<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    public static final com.hafiztaruligani.cryptoday.util.Resource.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NETWORK_UNAVAILABLE = "Somethings wrong, couldn\'t reach server";
    
    private Resource() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/hafiztaruligani/cryptoday/util/Resource$Success;", "T", "Lcom/hafiztaruligani/cryptoday/util/Resource;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "app_debug"})
    public static final class Success<T extends java.lang.Object> extends com.hafiztaruligani.cryptoday.util.Resource<T> {
        private final T data = null;
        
        public Success(T data) {
            super();
        }
        
        public final T getData() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/hafiztaruligani/cryptoday/util/Resource$Error;", "T", "Lcom/hafiztaruligani/cryptoday/util/Resource;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "app_debug"})
    public static final class Error<T extends java.lang.Object> extends com.hafiztaruligani.cryptoday.util.Resource<T> {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String message = null;
        
        public Error() {
            super();
        }
        
        public Error(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMessage() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/hafiztaruligani/cryptoday/util/Resource$Loading;", "T", "Lcom/hafiztaruligani/cryptoday/util/Resource;", "()V", "app_debug"})
    public static final class Loading<T extends java.lang.Object> extends com.hafiztaruligani.cryptoday.util.Resource<T> {
        
        public Loading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/hafiztaruligani/cryptoday/util/Resource$Companion;", "", "()V", "NETWORK_UNAVAILABLE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}