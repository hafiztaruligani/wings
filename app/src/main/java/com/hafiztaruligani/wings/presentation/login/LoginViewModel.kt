package com.hafiztaruligani.wings.presentation.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hafiztaruligani.wings.domain.usecase.GetUsername
import com.hafiztaruligani.wings.domain.usecase.Login
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val login: Login,
    private val getUserName: GetUsername
) : ViewModel() {

    private val _uiState = MutableStateFlow(LoginUiState())
    val uiState: StateFlow<LoginUiState> = _uiState

    init {
        viewModelScope.launch {
            getUserName.invoke().collectLatest {
                it?.let {
                    _uiState.value = LoginUiState(
                        isLogin = it.isNotBlank(),
                        username = it
                    )
                }
            }
        }
    }

    fun submitLogin(username: String, password: String) = viewModelScope.launch(Dispatchers.IO) {
        login.invoke(username, password)
    }
}
