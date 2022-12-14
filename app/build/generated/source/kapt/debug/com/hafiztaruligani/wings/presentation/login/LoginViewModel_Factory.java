// Generated by Dagger (https://dagger.dev).
package com.hafiztaruligani.wings.presentation.login;

import com.hafiztaruligani.wings.domain.usecase.GetUsername;
import com.hafiztaruligani.wings.domain.usecase.Login;
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
public final class LoginViewModel_Factory implements Factory<LoginViewModel> {
  private final Provider<Login> loginProvider;

  private final Provider<GetUsername> getUserNameProvider;

  public LoginViewModel_Factory(Provider<Login> loginProvider,
      Provider<GetUsername> getUserNameProvider) {
    this.loginProvider = loginProvider;
    this.getUserNameProvider = getUserNameProvider;
  }

  @Override
  public LoginViewModel get() {
    return newInstance(loginProvider.get(), getUserNameProvider.get());
  }

  public static LoginViewModel_Factory create(Provider<Login> loginProvider,
      Provider<GetUsername> getUserNameProvider) {
    return new LoginViewModel_Factory(loginProvider, getUserNameProvider);
  }

  public static LoginViewModel newInstance(Login login, GetUsername getUserName) {
    return new LoginViewModel(login, getUserName);
  }
}
