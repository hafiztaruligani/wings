// Generated by Dagger (https://dagger.dev).
package com.hafiztaruligani.cryptoday.di;

import com.hafiztaruligani.wings.data.local.room.ProductDao;
import com.hafiztaruligani.wings.data.remote.ApiService;
import com.hafiztaruligani.wings.domain.repository.ProductsRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HiltModule_ProvideProductRepositoryFactory implements Factory<ProductsRepository> {
  private final Provider<ApiService> apiServiceProvider;

  private final Provider<ProductDao> productDaoProvider;

  public HiltModule_ProvideProductRepositoryFactory(Provider<ApiService> apiServiceProvider,
      Provider<ProductDao> productDaoProvider) {
    this.apiServiceProvider = apiServiceProvider;
    this.productDaoProvider = productDaoProvider;
  }

  @Override
  public ProductsRepository get() {
    return provideProductRepository(apiServiceProvider.get(), productDaoProvider.get());
  }

  public static HiltModule_ProvideProductRepositoryFactory create(
      Provider<ApiService> apiServiceProvider, Provider<ProductDao> productDaoProvider) {
    return new HiltModule_ProvideProductRepositoryFactory(apiServiceProvider, productDaoProvider);
  }

  public static ProductsRepository provideProductRepository(ApiService apiService,
      ProductDao productDao) {
    return Preconditions.checkNotNullFromProvides(HiltModule.INSTANCE.provideProductRepository(apiService, productDao));
  }
}
