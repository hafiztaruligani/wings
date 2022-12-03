package com.hafiztaruligani.wings.presentation.productdetail

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.hafiztaruligani.wings.domain.model.Product
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class ProductDetailFragmentArgs(
  public val product: Product,
  public val documentNumber: Int
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Product::class.java)) {
      result.putParcelable("product", this.product as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Product::class.java)) {
      result.putSerializable("product", this.product as Serializable)
    } else {
      throw UnsupportedOperationException(Product::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    result.putInt("documentNumber", this.documentNumber)
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(Product::class.java)) {
      result.set("product", this.product as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Product::class.java)) {
      result.set("product", this.product as Serializable)
    } else {
      throw UnsupportedOperationException(Product::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    result.set("documentNumber", this.documentNumber)
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): ProductDetailFragmentArgs {
      bundle.setClassLoader(ProductDetailFragmentArgs::class.java.classLoader)
      val __product : Product?
      if (bundle.containsKey("product")) {
        if (Parcelable::class.java.isAssignableFrom(Product::class.java) ||
            Serializable::class.java.isAssignableFrom(Product::class.java)) {
          __product = bundle.get("product") as Product?
        } else {
          throw UnsupportedOperationException(Product::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__product == null) {
          throw IllegalArgumentException("Argument \"product\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"product\" is missing and does not have an android:defaultValue")
      }
      val __documentNumber : Int
      if (bundle.containsKey("documentNumber")) {
        __documentNumber = bundle.getInt("documentNumber")
      } else {
        throw IllegalArgumentException("Required argument \"documentNumber\" is missing and does not have an android:defaultValue")
      }
      return ProductDetailFragmentArgs(__product, __documentNumber)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): ProductDetailFragmentArgs {
      val __product : Product?
      if (savedStateHandle.contains("product")) {
        if (Parcelable::class.java.isAssignableFrom(Product::class.java) ||
            Serializable::class.java.isAssignableFrom(Product::class.java)) {
          __product = savedStateHandle.get<Product?>("product")
        } else {
          throw UnsupportedOperationException(Product::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__product == null) {
          throw IllegalArgumentException("Argument \"product\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"product\" is missing and does not have an android:defaultValue")
      }
      val __documentNumber : Int?
      if (savedStateHandle.contains("documentNumber")) {
        __documentNumber = savedStateHandle["documentNumber"]
        if (__documentNumber == null) {
          throw IllegalArgumentException("Argument \"documentNumber\" of type integer does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"documentNumber\" is missing and does not have an android:defaultValue")
      }
      return ProductDetailFragmentArgs(__product, __documentNumber)
    }
  }
}
