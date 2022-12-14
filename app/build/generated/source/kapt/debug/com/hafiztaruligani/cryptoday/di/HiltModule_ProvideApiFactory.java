// Generated by Dagger (https://dagger.dev).
package com.hafiztaruligani.cryptoday.di;

import com.hafiztaruligani.wings.data.remote.ApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HiltModule_ProvideApiFactory implements Factory<ApiService> {
  @Override
  public ApiService get() {
    return provideApi();
  }

  public static HiltModule_ProvideApiFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ApiService provideApi() {
    return Preconditions.checkNotNullFromProvides(HiltModule.INSTANCE.provideApi());
  }

  private static final class InstanceHolder {
    private static final HiltModule_ProvideApiFactory INSTANCE = new HiltModule_ProvideApiFactory();
  }
}
