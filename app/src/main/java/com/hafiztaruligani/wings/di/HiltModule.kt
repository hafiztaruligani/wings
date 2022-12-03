package com.hafiztaruligani.cryptoday.di

import android.content.Context
import com.hafiztaruligani.wings.BuildConfig
import com.hafiztaruligani.wings.data.local.room.AppDatabase
import com.hafiztaruligani.wings.data.local.room.ProductDao
import com.hafiztaruligani.wings.data.local.room.UserDao
import com.hafiztaruligani.wings.data.remote.ApiService
import com.hafiztaruligani.wings.data.repository.ProductsRepositoryImpl
import com.hafiztaruligani.wings.data.repository.UserRepositoryImpl
import com.hafiztaruligani.wings.domain.repository.ProductsRepository
import com.hafiztaruligani.wings.domain.repository.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object HiltModule {
    @Provides
    @Singleton
    fun provideApi(): ApiService {
        val logger = HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY }
        val client = OkHttpClient().newBuilder()
            .addNetworkInterceptor(logger)
            .build()

        return Retrofit
            .Builder()
            .baseUrl(BuildConfig.SERVER_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }

    // app database
    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase =
        AppDatabase.getDatabaseInstance(context)

    @Provides
    @Singleton
    fun provideProductRepository(
        apiService: ApiService,
        productDao: ProductDao
    ): ProductsRepository =
        ProductsRepositoryImpl(apiService, productDao)

    @Provides
    @Singleton
    fun provideUserRepository(
        userDao: UserDao
    ): UserRepository =
        UserRepositoryImpl(userDao)

    // product dao
    @Provides
    @Singleton
    fun provideProductDao(appDatabase: AppDatabase): ProductDao = appDatabase.productDao()

    @Provides
    @Singleton
    fun provideUserDao(appDatabase: AppDatabase): UserDao = appDatabase.userDao()
}
