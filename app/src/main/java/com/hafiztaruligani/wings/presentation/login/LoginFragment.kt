package com.hafiztaruligani.wings.presentation.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.hafiztaruligani.wings.R
import com.hafiztaruligani.wings.databinding.FragmentLoginBinding
import com.hafiztaruligani.wings.util.toast
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class LoginFragment : Fragment() {

    private val viewModel by viewModels<LoginViewModel>()
    private lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(layoutInflater)
        setupUi()
        return binding.root
    }

    private fun setupUi() {
        binding.apply {
            btnLogin.setOnClickListener {

                when {
                    username.text.isBlank() -> username.error = getString(R.string.need_fill)
                    password.text.isBlank() -> password.error = getString(R.string.need_fill)
                    password.text.length <8 -> password.error = getString(
                        R.string.password_more_than_8
                    )
                    else -> {
                        viewModel.submitLogin(username.text.toString(), password.text.toString())
                    }
                }
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindData()
    }

    private fun bindData() = lifecycleScope.launch {
        viewModel.uiState.collect {
            if (it.isLogin) {
                toast("Selamat Datang ${it.username}")
                navigateToProductList()
            }
        }
    }

    private fun navigateToProductList() {
        findNavController().navigate(
            directions = LoginFragmentDirections.actionLoginFragmentToProductListFragment()
        )
    }
}
