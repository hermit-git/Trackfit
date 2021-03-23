package com.example.trackfit.database;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.example.trackfit.database.Converter.class})
@androidx.room.Database(entities = {com.example.trackfit.database.entities.Run.class}, version = 1)
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/example/trackfit/database/RunningDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getRunDao", "Lcom/example/trackfit/database/runDao;", "app_debug"})
public abstract class RunningDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.trackfit.database.runDao getRunDao();
    
    public RunningDatabase() {
        super();
    }
}