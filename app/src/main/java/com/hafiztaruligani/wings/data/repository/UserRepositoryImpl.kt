package com.hafiztaruligani.wings.data.repository

import com.hafiztaruligani.wings.data.local.room.UserDao
import com.hafiztaruligani.wings.data.local.room.entity.LoginEntity
import com.hafiztaruligani.wings.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow

class UserRepositoryImpl(private val userDao: UserDao) : UserRepository {
    override suspend fun login(userName: String, password: String) {
        userDao.insertUser(LoginEntity(userName, password))
    }

    override suspend fun getUserName(): Flow<String?> {
        return userDao.getUsername()
    }
}
