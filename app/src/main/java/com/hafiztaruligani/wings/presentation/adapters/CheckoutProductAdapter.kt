package com.hafiztaruligani.wings.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.EditText
import androidx.core.content.ContextCompat
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.hafiztaruligani.cryptoday.util.CheckoutProductDiffUtil
import com.hafiztaruligani.wings.R
import com.hafiztaruligani.wings.data.local.room.entity.TransactionDetailEntity
import com.hafiztaruligani.wings.databinding.ItemCheckoutProductBinding
import com.hafiztaruligani.wings.util.setToCurrency

class CheckoutProductAdapter(
    private val checkoutProductDiffUtil: CheckoutProductDiffUtil,
    private val quantityChange: (Pair<TransactionDetailEntity, String>) -> Unit
) : RecyclerView.Adapter<CheckoutProductAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemCheckoutProductBinding) :
        RecyclerView.ViewHolder(binding.root)

    val data = AsyncListDiffer(this, checkoutProductDiffUtil)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemCheckoutProductBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data.currentList[position]
        setupImage(holder.binding)
        setupText(item, holder.binding)
        holder.binding.quantity.apply {
            fun setToOne() {
                setText("1")
            }
            addTextChangedListener {
                if (it?.isNotBlank() == true) quantityChange.invoke(Pair(item, it.toString()))
            }
            setOnFocusChangeListener { v, hasFocus ->
                if (!hasFocus && (v as EditText).text.isBlank()) setToOne()
            }
        }
    }

    private fun setupImage(binding: ItemCheckoutProductBinding) {
        val context = binding.root.context
        val res = ContextCompat.getDrawable(context, R.color.primary)
        Glide.with(context)
            .load(res)
            .circleCrop()
            .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
            .into(binding.image)
    }

    private fun setupText(item: TransactionDetailEntity, binding: ItemCheckoutProductBinding) = binding.apply {
        productName.text = item.produceName
        quantity.setText(item.quantity.toString())
        subTotal.text = item.subTotal.setToCurrency(item.currency)
        unit.text = item.unit
    }

    override fun getItemCount(): Int {
        return data.currentList.size
    }
}
