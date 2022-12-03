// Generated by Dagger (https://dagger.dev).
package com.hafiztaruligani.cryptoday.di;

import com.hafiztaruligani.wings.data.local.room.AppDatabase;
import com.hafiztaruligani.wings.data.local.room.UserDao;
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
public final class HiltModule_ProvideUserDaoFactory implements Factory<UserDao> {
  private final Provider<AppDatabase> appDatabaseProvider;

  public HiltModule_ProvideUserDaoFactory(Provider<AppDatabase> appDatabaseProvider) {
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public UserDao get() {
    return provideUserDao(appDatabaseProvider.get());
  }

  public static HiltModule_ProvideUserDaoFactory create(Provider<AppDatabase> appDatabaseProvider) {
    return new HiltModule_ProvideUserDaoFactory(appDatabaseProvider);
  }

  public static UserDao provideUserDao(AppDatabase appDatabase) {
    return Preconditions.checkNotNullFromProvides(HiltModule.INSTANCE.provideUserDao(appDatabase));
  }
}