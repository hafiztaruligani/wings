package com.hafiztaruligani.wings.data.local.room;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.hafiztaruligani.wings.data.local.room.Converters.class})
@androidx.room.Database(entities = {com.hafiztaruligani.wings.data.local.room.entity.ProductEntity.class, com.hafiztaruligani.wings.data.local.room.entity.LoginEntity.class, com.hafiztaruligani.wings.data.local.room.entity.TransactionDetailEntity.class, com.hafiztaruligani.wings.data.local.room.entity.TransactionHeaderEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/hafiztaruligani/wings/data/local/room/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "productDao", "Lcom/hafiztaruligani/wings/data/local/room/ProductDao;", "userDao", "Lcom/hafiztaruligani/wings/data/local/room/UserDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.hafiztaruligani.wings.data.local.room.AppDatabase.Companion Companion = null;
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.hafiztaruligani.wings.data.local.room.ProductDao productDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.hafiztaruligani.wings.data.local.room.UserDao userDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/hafiztaruligani/wings/data/local/room/AppDatabase$Companion;", "", "()V", "getDatabaseInstance", "Lcom/hafiztaruligani/wings/data/local/room/AppDatabase;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.hafiztaruligani.wings.data.local.room.AppDatabase getDatabaseInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}