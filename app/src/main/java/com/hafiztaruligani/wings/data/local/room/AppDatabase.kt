package com.hafiztaruligani.wings.data.local.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.hafiztaruligani.wings.data.local.room.entity.LoginEntity
import com.hafiztaruligani.wings.data.local.room.entity.ProductEntity
import com.hafiztaruligani.wings.data.local.room.entity.TransactionDetailEntity
import com.hafiztaruligani.wings.data.local.room.entity.TransactionHeaderEntity

@Database(
    entities = [
        ProductEntity::class,
        LoginEntity::class,
        TransactionDetailEntity::class,
        TransactionHeaderEntity::class
    ],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun productDao(): ProductDao
    abstract fun userDao(): UserDao
    companion object {
        fun getDatabaseInstance(context: Context): AppDatabase = Room.databaseBuilder(
            context,
            AppDatabase::class.java, "penjualan"
        ).build()
    }
}
