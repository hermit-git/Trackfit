package com.example.trackfit.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bJ\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bJ\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bJ\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000bJ\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000bJ\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000bJ\u0019\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/example/trackfit/database/LocalDataSource;", "", "runningDao", "Lcom/example/trackfit/database/runDao;", "(Lcom/example/trackfit/database/runDao;)V", "deleteRun", "", "run", "Lcom/example/trackfit/database/entities/Run;", "(Lcom/example/trackfit/database/entities/Run;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllRunsSortedByCalories", "Lkotlinx/coroutines/flow/Flow;", "", "getAllRunsSortedByDistance", "getAllRunsSortedBySpeed", "getAllRunsSortedByTimeMillis", "getAllRunsSortedByTimeStamp", "getTotalAvgSpeed", "", "getTotalCaloriesBurnt", "", "getTotalDistance", "getTotalTimeInMillis", "", "insertRun", "app_debug"})
public final class LocalDataSource {
    private final com.example.trackfit.database.runDao runningDao = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertRun(@org.jetbrains.annotations.NotNull()
    com.example.trackfit.database.entities.Run run, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteRun(@org.jetbrains.annotations.NotNull()
    com.example.trackfit.database.entities.Run run, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.trackfit.database.entities.Run>> getAllRunsSortedByTimeStamp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.trackfit.database.entities.Run>> getAllRunsSortedBySpeed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.trackfit.database.entities.Run>> getAllRunsSortedByDistance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.trackfit.database.entities.Run>> getAllRunsSortedByTimeMillis() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.trackfit.database.entities.Run>> getAllRunsSortedByCalories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Long> getTotalTimeInMillis() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Integer> getTotalDistance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Integer> getTotalCaloriesBurnt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Float> getTotalAvgSpeed() {
        return null;
    }
    
    @javax.inject.Inject()
    public LocalDataSource(@org.jetbrains.annotations.NotNull()
    com.example.trackfit.database.runDao runningDao) {
        super();
    }
}