// Generated by view binder compiler. Do not edit!
package com.hafiztaruligani.wings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.hafiztaruligani.wings.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemCheckoutProductBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView image;

  @NonNull
  public final TextView productName;

  @NonNull
  public final EditText quantity;

  @NonNull
  public final TextView subTotal;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView unit;

  private ItemCheckoutProductBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView image,
      @NonNull TextView productName, @NonNull EditText quantity, @NonNull TextView subTotal,
      @NonNull TextView textView4, @NonNull TextView unit) {
    this.rootView = rootView;
    this.image = image;
    this.productName = productName;
    this.quantity = quantity;
    this.subTotal = subTotal;
    this.textView4 = textView4;
    this.unit = unit;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemCheckoutProductBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemCheckoutProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_checkout_product, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemCheckoutProductBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.image;
      ImageView image = ViewBindings.findChildViewById(rootView, id);
      if (image == null) {
        break missingId;
      }

      id = R.id.product_name;
      TextView productName = ViewBindings.findChildViewById(rootView, id);
      if (productName == null) {
        break missingId;
      }

      id = R.id.quantity;
      EditText quantity = ViewBindings.findChildViewById(rootView, id);
      if (quantity == null) {
        break missingId;
      }

      id = R.id.sub_total;
      TextView subTotal = ViewBindings.findChildViewById(rootView, id);
      if (subTotal == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.unit;
      TextView unit = ViewBindings.findChildViewById(rootView, id);
      if (unit == null) {
        break missingId;
      }

      return new ItemCheckoutProductBinding((ConstraintLayout) rootView, image, productName,
          quantity, subTotal, textView4, unit);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
