package com.hafiztaruligani.wings.data.local.room.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "login")
data class LoginEntity(
    @PrimaryKey
    val user: String,
    val password: String
)
