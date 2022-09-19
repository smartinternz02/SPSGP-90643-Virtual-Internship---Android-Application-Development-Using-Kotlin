package com.example.grocerryapp

import com.example.grocerryapp.GroceryDatabase
import com.example.grocerryapp.GroceryItems

class GroceryRepository (private  val db: GroceryDatabase){
    suspend fun insert(items: GroceryItems)=db.getGroceryDao().insert(items)
    suspend fun  delete(items: GroceryItems)=db.getGroceryDao().delete(items)

    fun getAllItems()=db.getGroceryDao().getAllGroceryItems()


}