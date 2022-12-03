package com.hafiztaruligani.cryptoday.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\nH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0007\u00a8\u0006\u0015"}, d2 = {"Lcom/hafiztaruligani/cryptoday/di/HiltModule;", "", "()V", "provideApi", "Lcom/hafiztaruligani/wings/data/remote/ApiService;", "provideAppDatabase", "Lcom/hafiztaruligani/wings/data/local/room/AppDatabase;", "context", "Landroid/content/Context;", "provideProductDao", "Lcom/hafiztaruligani/wings/data/local/room/ProductDao;", "appDatabase", "provideProductRepository", "Lcom/hafiztaruligani/wings/domain/repository/ProductsRepository;", "apiService", "productDao", "provideUserDao", "Lcom/hafiztaruligani/wings/data/local/room/UserDao;", "provideUserRepository", "Lcom/hafiztaruligani/wings/domain/repository/UserRepository;", "userDao", "app_debug"})
@dagger.Module()
public final class HiltModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.hafiztaruligani.cryptoday.di.HiltModule INSTANCE = null;
    
    private HiltModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.hafiztaruligani.wings.data.remote.ApiService provideApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.hafiztaruligani.wings.data.local.room.AppDatabase provideAppDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.hafiztaruligani.wings.domain.repository.ProductsRepository provideProductRepository(@org.jetbrains.annotations.NotNull()
    com.hafiztaruligani.wings.data.remote.ApiService apiService, @org.jetbrains.annotations.NotNull()
    com.hafiztaruligani.wings.data.local.room.ProductDao productDao) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.hafiztaruligani.wings.domain.repository.UserRepository provideUserRepository(@org.jetbrains.annotations.NotNull()
    com.hafiztaruligani.wings.data.local.room.UserDao userDao) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.hafiztaruligani.wings.data.local.room.ProductDao provideProductDao(@org.jetbrains.annotations.NotNull()
    com.hafiztaruligani.wings.data.local.room.AppDatabase appDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.hafiztaruligani.wings.data.local.room.UserDao provideUserDao(@org.jetbrains.annotations.NotNull()
    com.hafiztaruligani.wings.data.local.room.AppDatabase appDatabase) {
        return null;
    }
}