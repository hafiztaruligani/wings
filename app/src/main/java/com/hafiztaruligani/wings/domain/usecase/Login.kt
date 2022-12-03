package com.hafiztaruligani.wings.domain.usecase

import com.hafiztaruligani.wings.domain.repository.UserRepository
import javax.inject.Inject

class Login @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke(
        username: String,
        password: String
    ) {
        userRepository.login(username, password)
    }
}
