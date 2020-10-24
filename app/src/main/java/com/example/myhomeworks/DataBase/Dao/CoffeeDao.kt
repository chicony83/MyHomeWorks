package com.example.myhomeworks.DataBase.Dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.myhomeworks.DataBase.Entity.Coffee

interface CoffeeDao {

    @Insert
    suspend fun addCoffee(coffee: Coffee)

    @Delete
    fun deleteCoffee(coffee: Coffee)

    @Query("SELECT * FROM coffee_table")
    suspend fun getAllCoffee(): List<Coffee>

    @Query("DELETE FROM coffee_table WHERE id = :id")
    suspend fun deleteCoffeeById(id: Int)

    @Query("SELECT * FROM coffee_table WHERE price_per_kilogram > :price")
    suspend fun findCoffeeMoreExpensive(price: Double)

    @Query("SELECT * FROM coffee_table WHERE price_per_kilogram < :price")
    suspend fun findCoffeeCheaper(price: Double)

    @Query("DELETE FROM coffee_table")
    suspend fun clearDataBase()

}