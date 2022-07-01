package com.example.imagerepository.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.imagerepository.Image

@Database(entities = [Image::class], version = 1, exportSchema = false)
abstract class AppDatabase:RoomDatabase() {
    abstract fun imageDao():ImageDao
}