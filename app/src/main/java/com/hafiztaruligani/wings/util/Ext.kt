package com.hafiztaruligani.wings.util

import android.widget.Toast
import androidx.fragment.app.Fragment
import java.text.DecimalFormat

fun Fragment.toast(msg: String, isShowLong: Boolean = true) {
    Toast.makeText(
        requireContext(),
        msg,
        if (isShowLong) Toast.LENGTH_LONG
        else Toast.LENGTH_SHORT
    ).show()
}
fun String.isValidInt(): Boolean {
    val a = listOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9')
    var result = true
    forEach {
        if (!a.contains(it)) result = false
    }
    return result
}
fun Int.setToCurrency(currency: String): String {
    val formatter = DecimalFormat("#,###,###")
    val s = formatter.format(this).replace(',', '.')
    return if (currency == "IDR") "Rp. $s,-"
    else s
}
