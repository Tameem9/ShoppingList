package com.example.shoppinglist.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ShoppingDao {
    @Insert(onConflict=OnConflictStrategy.REPLACE)
     suspend fun upSert(item: ShoppingItem)
    @Delete
     suspend fun delete(item: ShoppingItem)
     @Query("SELECT * FROM shopping_Item")
     fun getAllShoppingItems():LiveData<List<ShoppingItem>>
}