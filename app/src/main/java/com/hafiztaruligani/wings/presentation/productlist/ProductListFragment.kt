package com.hafiztaruligani.wings.presentation.productlist

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.hafiztaruligani.cryptoday.util.ProductDiffUtil
import com.hafiztaruligani.wings.databinding.FragmentProductListBinding
import com.hafiztaruligani.wings.domain.model.Product
import com.hafiztaruligani.wings.presentation.CommonUiState
import com.hafiztaruligani.wings.presentation.adapters.ProductAdapter
import com.hafiztaruligani.wings.util.toast
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class ProductListFragment : Fragment() {

    private val viewModel by viewModels<ProductListViewModel>()
    private lateinit var binding: FragmentProductListBinding
    private lateinit var adapter: ProductAdapter
    private lateinit var quantityDialog: QuantityDialog

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel.initData()
        binding = FragmentProductListBinding.inflate(layoutInflater)
        quantityDialog = QuantityDialog(requireContext(), ::addTransactionDetail)
        setupButton()
        setupRc()
        return binding.root
    }

    private fun setupButton() = binding.apply {
        btnCheckout.setOnClickListener { navigateToCheckout() }
        btnTryAgain.setOnClickListener { viewModel.initData() }
    }

    private fun navigateToCheckout() {
        findNavController().navigate(
            directions = ProductListFragmentDirections
                .actionProductListFragmentToCheckoutFragment(viewModel.documentNumber)
        )
    }

    private fun setupRc() {
        adapter = ProductAdapter(ProductDiffUtil(), ::navigateToDetail, ::buyAction)
        binding.apply {
            productsRc.adapter = adapter
            productsRc.layoutManager = LinearLayoutManager(
                requireContext(),
                LinearLayoutManager.VERTICAL,
                false
            )
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindData()
    }

    private fun bindData() {
        lifecycleScope.launch {
            viewModel.uiState.collectLatest {
                errorHandler(it)
                binding.loading.isVisible = it.loading
                adapter.data.submitList(it.data)
            }
        }
    }

    private fun errorHandler(uiState: CommonUiState<List<Product>>) {
        val error: Boolean = uiState.error.isNotBlank()
        if (error) toast(uiState.error)
        binding.apply {
            btnCheckout.isVisible = !error
            productsRc.isVisible = !error
            btnTryAgain.isVisible = error
        }
    }

    private var product: Product? = null
    private fun buyAction(product: Product) {
        this.product = product
        quantityDialog.show()
    }

    private fun addTransactionDetail(quantity: Int) {
        product?.let {
            viewModel.addTransactionDetail(it, quantity)
            toast("add $quantity ${it.productName}")
        } ?: toast("error")
    }

    private fun navigateToDetail(product: Product) {
        findNavController().navigate(
            directions = ProductListFragmentDirections.actionProductListFragmentToProductDetailFragment(
                product,
                viewModel.documentNumber
            )
        )
    }
}
