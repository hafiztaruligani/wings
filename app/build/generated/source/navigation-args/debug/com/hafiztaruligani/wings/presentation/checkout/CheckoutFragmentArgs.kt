package com.hafiztaruligani.wings.presentation.checkout

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.jvm.JvmStatic

public data class CheckoutFragmentArgs(
  public val documentNumber: Int
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("documentNumber", this.documentNumber)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("documentNumber", this.documentNumber)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): CheckoutFragmentArgs {
      bundle.setClassLoader(CheckoutFragmentArgs::class.java.classLoader)
      val __documentNumber : Int
      if (bundle.containsKey("documentNumber")) {
        __documentNumber = bundle.getInt("documentNumber")
      } else {
        throw IllegalArgumentException("Required argument \"documentNumber\" is missing and does not have an android:defaultValue")
      }
      return CheckoutFragmentArgs(__documentNumber)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): CheckoutFragmentArgs {
      val __documentNumber : Int?
      if (savedStateHandle.contains("documentNumber")) {
        __documentNumber = savedStateHandle["documentNumber"]
        if (__documentNumber == null) {
          throw IllegalArgumentException("Argument \"documentNumber\" of type integer does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"documentNumber\" is missing and does not have an android:defaultValue")
      }
      return CheckoutFragmentArgs(__documentNumber)
    }
  }
}
