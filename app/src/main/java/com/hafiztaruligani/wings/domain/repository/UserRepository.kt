package com.hafiztaruligani.wings.domain.repository

import kotlinx.coroutines.flow.Flow

interface UserRepository {
    suspend fun login(userName: String, password: String)
    suspend fun getUserName(): Flow<String?>
}
