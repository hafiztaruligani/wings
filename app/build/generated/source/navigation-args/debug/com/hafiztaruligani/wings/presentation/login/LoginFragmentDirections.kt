package com.hafiztaruligani.wings.presentation.login

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.hafiztaruligani.wings.R

public class LoginFragmentDirections private constructor() {
  public companion object {
    public fun actionLoginFragmentToProductListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_loginFragment_to_productListFragment)
  }
}
