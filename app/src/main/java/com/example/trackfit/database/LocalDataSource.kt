package com.example.trackfit.database

import com.example.trackfit.database.entities.Run
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LocalDataSource @Inject constructor(
    private val runningDao: runDao
) {

    suspend fun insertRun(run:Run) = runningDao.insertRun(run)

    suspend fun deleteRun(run:Run) = runningDao.deleteRun(run)

    fun getAllRunsSortedByTimeStamp():Flow<List<Run>> = runningDao.getAllRunsSortedByTimeStamp()

    fun getAllRunsSortedBySpeed():Flow<List<Run>> = runningDao.getAllRunsSortedBySpeed()

    fun getAllRunsSortedByDistance():Flow<List<Run>> = runningDao.getAllRunsSortedByDistance()

    fun getAllRunsSortedByTimeMillis():Flow<List<Run>> = runningDao.getAllRunsSortedByTimeMillis()

    fun getAllRunsSortedByCalories():Flow<List<Run>> = runningDao.getAllRunsSortedByCalories()

    fun getTotalTimeInMillis():Flow<Long> = runningDao.getTotalTimeInMillis()

    fun getTotalDistance():Flow<Int> = runningDao.getTotalDistance()

    fun getTotalCaloriesBurnt():Flow<Int> = runningDao.getTotalCaloriesBurnt()

    fun getTotalAvgSpeed():Flow<Float> = runningDao.getTotalAvgSpeed()

}