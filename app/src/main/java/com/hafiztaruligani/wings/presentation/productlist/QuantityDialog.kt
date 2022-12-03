package com.hafiztaruligani.wings.presentation.productlist

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import com.hafiztaruligani.wings.databinding.QuantityDialogBinding

class QuantityDialog(
    context: Context,
    private val callback: (newValue: Int) -> Unit
) : Dialog(context) {

    private lateinit var binding: QuantityDialogBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = QuantityDialogBinding.inflate(layoutInflater)

        requestWindowFeature(Window.FEATURE_NO_TITLE)
        binding.root.let { setContentView(it) } ?: throw Exception("binding not initialized")
        setCancelable(true)
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE)
        setupUi()
    }

    private fun setupUi() {
        binding.apply {
            quantity.requestFocus()
            btnChangeLimit.setOnClickListener {
                val value = quantity.text.toString()
                callback.invoke(value.toInt())
                dismiss()
            }
        }
    }
}
