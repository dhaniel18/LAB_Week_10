package com.example.week10_lab.database

import androidx.room.*

@Dao
interface TotalDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(total: Total)

    @Update
    fun update(total: Total)

    @Delete
    fun delete(total: Total)

    @Query("SELECT * FROM total WHERE id = :id")
    fun getTotal(id: Long): List<Total>
}
