package com.hafiztaruligani.wings.presentation.adapters

import android.graphics.Paint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.hafiztaruligani.cryptoday.util.ProductDiffUtil
import com.hafiztaruligani.wings.R
import com.hafiztaruligani.wings.databinding.ItemProductBinding
import com.hafiztaruligani.wings.domain.model.Product
import com.hafiztaruligani.wings.util.setToCurrency

class ProductAdapter(
    private val productDiffUtil: ProductDiffUtil,
    private val navigateToDetail: (Product) -> Unit,
    private val buy: (Product) -> Unit
) : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    val data = AsyncListDiffer(this, productDiffUtil)

    inner class ViewHolder(val binding: ItemProductBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemProductBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data.currentList[position]
        holder.binding.apply {
            setupImage(this)
            setupText(this, item)
            setupButton(this, item)
        }
    }

    private fun setupImage(binding: ItemProductBinding) {
        val context = binding.root.context
        val res = ContextCompat.getDrawable(context, R.color.primary)
        Glide.with(context)
            .load(res)
            .circleCrop()
            .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
            .into(binding.image)
    }

    private fun setupText(binding: ItemProductBinding, item: Product) = binding.apply {
        productName.text = item.productName

        price.text = item.price.setToCurrency(item.currency)
        price.paintFlags = Paint.STRIKE_THRU_TEXT_FLAG
        price.isVisible = item.discount> 0

        actualPrice.text = item.actualPrice.setToCurrency(item.currency)
    }

    private fun setupButton(binding: ItemProductBinding, item: Product) = binding.apply {
        root.setOnClickListener {
            navigateToDetail.invoke(item)
        }
        btnBuy.setOnClickListener {
            buy.invoke(item)
        }
    }

    override fun getItemCount(): Int = data.currentList.size
}
