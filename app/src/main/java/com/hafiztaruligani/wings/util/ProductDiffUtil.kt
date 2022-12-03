package com.hafiztaruligani.cryptoday.util

import androidx.recyclerview.widget.DiffUtil
import com.hafiztaruligani.wings.domain.model.Product

class ProductDiffUtil : DiffUtil.ItemCallback<Product>() {
    override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean {
        return oldItem.productCode == newItem.productCode
    }

    override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean {
        return oldItem.price == newItem.price
    }
}
