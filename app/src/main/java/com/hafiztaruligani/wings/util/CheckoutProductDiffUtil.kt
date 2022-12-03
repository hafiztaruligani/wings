package com.hafiztaruligani.cryptoday.util

import androidx.recyclerview.widget.DiffUtil
import com.hafiztaruligani.wings.data.local.room.entity.TransactionDetailEntity

class CheckoutProductDiffUtil : DiffUtil.ItemCallback<TransactionDetailEntity>() {
    override fun areItemsTheSame(
        oldItem: TransactionDetailEntity,
        newItem: TransactionDetailEntity
    ): Boolean = oldItem.subTotal == newItem.subTotal

    override fun areContentsTheSame(
        oldItem: TransactionDetailEntity,
        newItem: TransactionDetailEntity
    ): Boolean = oldItem.productCode == newItem.productCode
}
