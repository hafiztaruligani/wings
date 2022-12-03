package com.hafiztaruligani.wings.presentation.productlist

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.hafiztaruligani.wings.R
import com.hafiztaruligani.wings.domain.model.Product
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class ProductListFragmentDirections private constructor() {
  private data class ActionProductListFragmentToProductDetailFragment(
    public val product: Product,
    public val documentNumber: Int
  ) : NavDirections {
    public override val actionId: Int = R.id.action_productListFragment_to_productDetailFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
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
  }

  private data class ActionProductListFragmentToCheckoutFragment(
    public val documentNumber: Int
  ) : NavDirections {
    public override val actionId: Int = R.id.action_productListFragment_to_checkoutFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("documentNumber", this.documentNumber)
        return result
      }
  }

  public companion object {
    public fun actionProductListFragmentToProductDetailFragment(product: Product,
        documentNumber: Int): NavDirections =
        ActionProductListFragmentToProductDetailFragment(product, documentNumber)

    public fun actionProductListFragmentToCheckoutFragment(documentNumber: Int): NavDirections =
        ActionProductListFragmentToCheckoutFragment(documentNumber)
  }
}
