package com.example.trackfit.database

import androidx.room.*
import com.example.trackfit.database.entities.Run
import kotlinx.coroutines.flow.Flow

@Dao
interface runDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRun(run: Run)

    @Delete
    suspend fun deleteRun(run: Run)

    @Query("SELECT * FROM running_table ORDER BY timeStamp DESC")
    fun getAllRunsSortedByTimeStamp():Flow<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY avgSpeedInKMH DESC")
    fun getAllRunsSortedBySpeed():Flow<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY distanceInMeters DESC")
    fun getAllRunsSortedByDistance():Flow<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY timeInMillis DESC")
    fun getAllRunsSortedByTimeMillis():Flow<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY caloriesBurnt DESC")
    fun getAllRunsSortedByCalories():Flow<List<Run>>

    @Query("SELECT SUM(caloriesBurnt) FROM running_table")
    fun getTotalTimeInMillis():Flow<Long>

    @Query("SELECT SUM(distanceInMeters) FROM running_table")
    fun getTotalDistance():Flow<Int>

    @Query("SELECT SUM(caloriesBurnt) FROM running_table")
    fun getTotalCaloriesBurnt():Flow<Int>

    @Query("SELECT AVG(avgSpeedInKMH) FROM running_table")
    fun getTotalAvgSpeed():Flow<Float>

}