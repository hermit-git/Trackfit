package com.example.trackfit.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.trackfit.database.entities.Run

@Database(
    entities = [Run::class],
    version = 1
)
@TypeConverters(Converter::class)
abstract class RunningDatabase:RoomDatabase() {
    abstract fun getRunDao(): runDao
}