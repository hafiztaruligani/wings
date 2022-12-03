// Generated by Dagger (https://dagger.dev).
package com.hafiztaruligani.wings.domain.usecase;

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
public final class Login_Factory implements Factory<Login> {
  private final Provider<UserRepository> userRepositoryProvider;

  public Login_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public Login get() {
    return newInstance(userRepositoryProvider.get());
  }

  public static Login_Factory create(Provider<UserRepository> userRepositoryProvider) {
    return new Login_Factory(userRepositoryProvider);
  }

  public static Login newInstance(UserRepository userRepository) {
    return new Login(userRepository);
  }
}