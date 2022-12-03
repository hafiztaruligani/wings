package com.hafiztaruligani.wings.data.local.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.hafiztaruligani.wings.data.local.room.entity.LoginEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {

    @Insert(onConflict = REPLACE)
    suspend fun insertUser(user: LoginEntity)

    @Query("SELECT user FROM login")
    fun getUsername(): Flow<String?>
}
