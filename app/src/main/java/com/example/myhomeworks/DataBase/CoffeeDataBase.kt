package com.example.myhomeworks.DataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.myhomeworks.DataBase.Dao.CoffeeDao
import com.example.myhomeworks.DataBase.Entity.Coffee

@Database(entities = [Coffee::class], version = 1)

abstract class CoffeeDataBase : RoomDatabase() {

    abstract fun coffeeDao(): CoffeeDao

}

object Db {
    fun getDB(ctx: Context) =
        Room.databaseBuilder(ctx,CoffeeDataBase::class.java,"CoffeeDataBase").build()

}