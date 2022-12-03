package com.hafiztaruligani.wings.presentation.login

data class LoginUiState(
    val loading: Boolean = false,
    val isLogin: Boolean = false,
    val username: String = ""
)
