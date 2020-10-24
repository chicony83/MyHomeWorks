package com.example.myhomeworks.DataBase.Entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "coffee_table")
data class Coffee(
    @ColumnInfo(name = "sort_of_coffee")
    val sort_name:String,
    @ColumnInfo(name = "price_per_kilogram")
    val price:Double,
    @ColumnInfo(name = "link_to_image")
    val link:String
){
    @PrimaryKey(autoGenerate = true)
    var id:Int? = null
}