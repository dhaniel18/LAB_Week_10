package com.example.week10_lab.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Total::class], version = 2)
abstract class TotalDatabase : RoomDatabase() {
    abstract fun totalDao(): TotalDao
}

