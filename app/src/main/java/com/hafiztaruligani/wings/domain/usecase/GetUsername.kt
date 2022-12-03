package com.hafiztaruligani.wings.domain.usecase

import com.hafiztaruligani.wings.domain.repository.UserRepository
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow

class GetUsername @Inject constructor(private val userRepository: UserRepository) {
    suspend operator fun invoke(): Flow<String?> = userRepository.getUserName()
}
