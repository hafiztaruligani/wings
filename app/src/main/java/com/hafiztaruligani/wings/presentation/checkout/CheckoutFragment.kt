package com.hafiztaruligani.wings.presentation.checkout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.hafiztaruligani.cryptoday.util.CheckoutProductDiffUtil
import com.hafiztaruligani.wings.data.local.room.entity.TransactionDetailEntity
import com.hafiztaruligani.wings.databinding.FragmentCheckoutBinding
import com.hafiztaruligani.wings.presentation.adapters.CheckoutProductAdapter
import com.hafiztaruligani.wings.util.isValidInt
import com.hafiztaruligani.wings.util.setToCurrency
import com.hafiztaruligani.wings.util.toast
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class CheckoutFragment : Fragment() {

    private val viewModel by viewModels<CheckoutViewModel>()
    private val args: CheckoutFragmentArgs by navArgs()
    private lateinit var binding: FragmentCheckoutBinding
    private lateinit var adapter: CheckoutProductAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel.initData(args.documentNumber)
        binding = FragmentCheckoutBinding.inflate(layoutInflater)
        setupUi()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindData()
    }

    private fun bindData() = lifecycleScope.launch {
        viewModel.uiState.collect {
            val currency = it.data?.detailEntity?.firstOrNull()?.currency ?: "IDR"
            it.data?.detailEntity?.let { data ->
                adapter.data.submitList(data)
            }
            it.data?.transactionHeaderEntity?.total?.setToCurrency(currency).let { total ->
                binding.totalPrice.text = total
            }
        }
    }

    private fun setupUi() {
        setupRc()
        binding.btnConfirm.setOnClickListener {
            val itemCountMoreThanOne = adapter.itemCount > 0
            if (itemCountMoreThanOne) {
                toast("Silahkan Lakukan pembayaran sejumlah ${binding.totalPrice.text}")
                findNavController().popBackStack()
            } else {
                toast("Item anda kosong")
            }
        }
    }

    private fun setupRc() {
        adapter = CheckoutProductAdapter(
            CheckoutProductDiffUtil(),
            ::quantityChange
        )
        binding.apply {
            productRc.adapter = adapter
            productRc.layoutManager = LinearLayoutManager(
                requireContext(),
                LinearLayoutManager.VERTICAL,
                false
            )
        }
    }

    private fun quantityChange(data: Pair<TransactionDetailEntity, String>) {
        if (data.second.isValidInt())
            viewModel.updateQuantity(data.first, data.second.toInt())
        else toast("input valid number")
    }
}
