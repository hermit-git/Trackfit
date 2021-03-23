package com.example.trackfit.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\'J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\'J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\'J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\bH\'J\u0019\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/example/trackfit/database/runDao;", "", "deleteRun", "", "run", "Lcom/example/trackfit/database/entities/Run;", "(Lcom/example/trackfit/database/entities/Run;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllRunsSortedByCalories", "Lkotlinx/coroutines/flow/Flow;", "", "getAllRunsSortedByDistance", "getAllRunsSortedBySpeed", "getAllRunsSortedByTimeMillis", "getAllRunsSortedByTimeStamp", "getTotalAvgSpeed", "", "getTotalCaloriesBurnt", "", "getTotalDistance", "getTotalTimeInMillis", "", "insertRun", "app_debug"})
public abstract interface runDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertRun(@org.jetbrains.annotations.NotNull()
    com.example.trackfit.database.entities.Run run, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deleteRun(@org.jetbrains.annotations.NotNull()
    com.example.trackfit.database.entities.Run run, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM running_table ORDER BY timeStamp DESC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.trackfit.database.entities.Run>> getAllRunsSortedByTimeStamp();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM running_table ORDER BY avgSpeedInKMH DESC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.trackfit.database.entities.Run>> getAllRunsSortedBySpeed();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM running_table ORDER BY distanceInMeters DESC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.trackfit.database.entities.Run>> getAllRunsSortedByDistance();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM running_table ORDER BY timeInMillis DESC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.trackfit.database.entities.Run>> getAllRunsSortedByTimeMillis();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM running_table ORDER BY caloriesBurnt DESC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.trackfit.database.entities.Run>> getAllRunsSortedByCalories();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT SUM(caloriesBurnt) FROM running_table")
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Long> getTotalTimeInMillis();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT SUM(distanceInMeters) FROM running_table")
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Integer> getTotalDistance();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT SUM(caloriesBurnt) FROM running_table")
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Integer> getTotalCaloriesBurnt();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT AVG(avgSpeedInKMH) FROM running_table")
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Float> getTotalAvgSpeed();
}