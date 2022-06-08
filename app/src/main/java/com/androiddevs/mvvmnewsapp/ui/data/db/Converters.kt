package com.androiddevs.mvvmnewsapp.ui.data.db

import androidx.room.TypeConverter
import com.androiddevs.mvvmnewsapp.ui.model.Source

class Converters {

    @TypeConverter
    fun fromSourceToString(data:Source):String{
        return data.name
    }

    @TypeConverter
    fun toSource(data:String):Source{
        return Source(data,data)
    }

}