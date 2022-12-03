// Generated by Dagger (https://dagger.dev).
package com.hafiztaruligani.wings.domain.usecase;

import com.hafiztaruligani.wings.domain.repository.ProductsRepository;
import com.hafiztaruligani.wings.domain.repository.UserRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Checkout_Factory implements Factory<Checkout> {
  private final Provider<ProductsRepository> productsRepositoryProvider;

  private final Provider<UserRepository> userRepositoryProvider;

  public Checkout_Factory(Provider<ProductsRepository> productsRepositoryProvider,
      Provider<UserRepository> userRepositoryProvider) {
    this.productsRepositoryProvider = productsRepositoryProvider;
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public Checkout get() {
    return newInstance(productsRepositoryProvider.get(), userRepositoryProvider.get());
  }

  public static Checkout_Factory create(Provider<ProductsRepository> productsRepositoryProvider,
      Provider<UserRepository> userRepositoryProvider) {
    return new Checkout_Factory(productsRepositoryProvider, userRepositoryProvider);
  }

  public static Checkout newInstance(ProductsRepository productsRepository,
      UserRepository userRepository) {
    return new Checkout(productsRepository, userRepository);
  }
}