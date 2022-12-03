package com.hafiztaruligani.wings.presentation

data class CommonUiState<T>(
    val data: T? = null,
    val error: String = "",
    val loading: Boolean = false
)
