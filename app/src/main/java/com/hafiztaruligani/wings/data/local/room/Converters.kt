package com.hafiztaruligani.wings.data.local.room

import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.google.gson.Gson

@TypeConverters
class Converters {
    @TypeConverter
    fun a(value: List<Any>?) = Gson().toJson(value)

    @TypeConverter
    fun b(value: String) =
        Gson().fromJson(value, Array<Any>::class.java).toList()
}
