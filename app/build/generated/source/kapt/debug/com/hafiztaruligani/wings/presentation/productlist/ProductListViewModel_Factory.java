// Generated by Dagger (https://dagger.dev).
package com.hafiztaruligani.wings.presentation.productlist;

import com.hafiztaruligani.wings.domain.usecase.AddTransactionDetail;
import com.hafiztaruligani.wings.domain.usecase.GetProducts;
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
public final class ProductListViewModel_Factory implements Factory<ProductListViewModel> {
  private final Provider<GetProducts> getProductsProvider;

  private final Provider<AddTransactionDetail> addTransactionDetailProvider;

  public ProductListViewModel_Factory(Provider<GetProducts> getProductsProvider,
      Provider<AddTransactionDetail> addTransactionDetailProvider) {
    this.getProductsProvider = getProductsProvider;
    this.addTransactionDetailProvider = addTransactionDetailProvider;
  }

  @Override
  public ProductListViewModel get() {
    return newInstance(getProductsProvider.get(), addTransactionDetailProvider.get());
  }

  public static ProductListViewModel_Factory create(Provider<GetProducts> getProductsProvider,
      Provider<AddTransactionDetail> addTransactionDetailProvider) {
    return new ProductListViewModel_Factory(getProductsProvider, addTransactionDetailProvider);
  }

  public static ProductListViewModel newInstance(GetProducts getProducts,
      AddTransactionDetail addTransactionDetail) {
    return new ProductListViewModel(getProducts, addTransactionDetail);
  }
}