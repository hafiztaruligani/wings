package com.hafiztaruligani.wings.presentation.productdetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.hafiztaruligani.wings.R
import com.hafiztaruligani.wings.databinding.FragmentProductDetailBinding
import com.hafiztaruligani.wings.presentation.productlist.QuantityDialog
import com.hafiztaruligani.wings.util.setToCurrency
import com.hafiztaruligani.wings.util.toast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProductDetailFragment : Fragment() {

    private val viewModel by viewModels<ProductDetailViewModel> ()
    private lateinit var binding: FragmentProductDetailBinding
    private val arg: ProductDetailFragmentArgs by navArgs()
    private lateinit var quantityDialog: QuantityDialog

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProductDetailBinding.inflate(layoutInflater)
        quantityDialog = QuantityDialog(requireContext(), ::addTransactionDetail)
        setupUi()
        return binding.root
    }

    private fun setupUi() {
        setupImage(binding.image)
        val data = arg.product
        binding.apply {
            name.text = data.productName
            price.text = data.price.setToCurrency(data.currency)
            dimension.text = data.dimension
            unit.text = data.unit

            btnBuy.setOnClickListener {
                quantityDialog.show()
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindData()
    }

    private fun bindData() {
    }

    private fun addTransactionDetail(quantity: Int) {
        viewModel.addTransactionDetail(arg.product, quantity, arg.documentNumber)
        toast("add $quantity ${arg.product.productName}")
    }

    private fun setupImage(image: ImageView) {
        val context = binding.root.context
        val res = ContextCompat.getDrawable(context, R.color.primary)
        Glide.with(context)
            .load(res)
            .circleCrop()
            .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
            .into(image)
    }
}
