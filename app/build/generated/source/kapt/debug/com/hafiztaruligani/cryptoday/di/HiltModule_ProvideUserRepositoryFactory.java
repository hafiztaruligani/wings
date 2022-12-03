// Generated by Dagger (https://dagger.dev).
package com.hafiztaruligani.cryptoday.di;

import com.hafiztaruligani.wings.data.local.room.UserDao;
import com.hafiztaruligani.wings.domain.repository.UserRepository;
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
public final class HiltModule_ProvideUserRepositoryFactory implements Factory<UserRepository> {
  private final Provider<UserDao> userDaoProvider;

  public HiltModule_ProvideUserRepositoryFactory(Provider<UserDao> userDaoProvider) {
    this.userDaoProvider = userDaoProvider;
  }

  @Override
  public UserRepository get() {
    return provideUserRepository(userDaoProvider.get());
  }

  public static HiltModule_ProvideUserRepositoryFactory create(Provider<UserDao> userDaoProvider) {
    return new HiltModule_ProvideUserRepositoryFactory(userDaoProvider);
  }

  public static UserRepository provideUserRepository(UserDao userDao) {
    return Preconditions.checkNotNullFromProvides(HiltModule.INSTANCE.provideUserRepository(userDao));
  }
}