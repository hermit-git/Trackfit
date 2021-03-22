package com.example.trackfit.database.entities

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "running_table")
data class Run(
    var image:Bitmap? = null,
    var timeStamp:Long = 0L,
    var avgSpeedInKMH:Float = 0f,
    var distanceInMeters:Int = 0,
    var timeInMillis:Long = 0L,
    var caloriesBurnt:Int = 0
) {
    @PrimaryKey(autoGenerate = true)
    val id:Int = 0
}