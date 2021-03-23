package com.example.trackfit.database;

import android.database.Cursor;
import android.graphics.Bitmap;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.trackfit.database.entities.Run;
import java.lang.Exception;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class runDao_Impl implements runDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Run> __insertionAdapterOfRun;

  private final Converter __converter = new Converter();

  private final EntityDeletionOrUpdateAdapter<Run> __deletionAdapterOfRun;

  public runDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRun = new EntityInsertionAdapter<Run>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `running_table` (`id`,`image`,`timeStamp`,`avgSpeedInKMH`,`distanceInMeters`,`timeInMillis`,`caloriesBurnt`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Run value) {
        stmt.bindLong(1, value.getId());
        final byte[] _tmp;
        _tmp = __converter.fromBitmap(value.getImage());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindBlob(2, _tmp);
        }
        stmt.bindLong(3, value.getTimeStamp());
        stmt.bindDouble(4, value.getAvgSpeedInKMH());
        stmt.bindLong(5, value.getDistanceInMeters());
        stmt.bindLong(6, value.getTimeInMillis());
        stmt.bindLong(7, value.getCaloriesBurnt());
      }
    };
    this.__deletionAdapterOfRun = new EntityDeletionOrUpdateAdapter<Run>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `running_table` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Run value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public Object insertRun(final Run run, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfRun.insert(run);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteRun(final Run run, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfRun.handle(run);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Flow<List<Run>> getAllRunsSortedByTimeStamp() {
    final String _sql = "SELECT * FROM running_table ORDER BY timeStamp DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"running_table"}, new Callable<List<Run>>() {
      @Override
      public List<Run> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfTimeStamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timeStamp");
          final int _cursorIndexOfAvgSpeedInKMH = CursorUtil.getColumnIndexOrThrow(_cursor, "avgSpeedInKMH");
          final int _cursorIndexOfDistanceInMeters = CursorUtil.getColumnIndexOrThrow(_cursor, "distanceInMeters");
          final int _cursorIndexOfTimeInMillis = CursorUtil.getColumnIndexOrThrow(_cursor, "timeInMillis");
          final int _cursorIndexOfCaloriesBurnt = CursorUtil.getColumnIndexOrThrow(_cursor, "caloriesBurnt");
          final List<Run> _result = new ArrayList<Run>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Run _item;
            final Bitmap _tmpImage;
            final byte[] _tmp;
            _tmp = _cursor.getBlob(_cursorIndexOfImage);
            _tmpImage = __converter.toBitmap(_tmp);
            final long _tmpTimeStamp;
            _tmpTimeStamp = _cursor.getLong(_cursorIndexOfTimeStamp);
            final float _tmpAvgSpeedInKMH;
            _tmpAvgSpeedInKMH = _cursor.getFloat(_cursorIndexOfAvgSpeedInKMH);
            final int _tmpDistanceInMeters;
            _tmpDistanceInMeters = _cursor.getInt(_cursorIndexOfDistanceInMeters);
            final long _tmpTimeInMillis;
            _tmpTimeInMillis = _cursor.getLong(_cursorIndexOfTimeInMillis);
            final int _tmpCaloriesBurnt;
            _tmpCaloriesBurnt = _cursor.getInt(_cursorIndexOfCaloriesBurnt);
            _item = new Run(_tmpImage,_tmpTimeStamp,_tmpAvgSpeedInKMH,_tmpDistanceInMeters,_tmpTimeInMillis,_tmpCaloriesBurnt);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Run>> getAllRunsSortedBySpeed() {
    final String _sql = "SELECT * FROM running_table ORDER BY avgSpeedInKMH DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"running_table"}, new Callable<List<Run>>() {
      @Override
      public List<Run> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfTimeStamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timeStamp");
          final int _cursorIndexOfAvgSpeedInKMH = CursorUtil.getColumnIndexOrThrow(_cursor, "avgSpeedInKMH");
          final int _cursorIndexOfDistanceInMeters = CursorUtil.getColumnIndexOrThrow(_cursor, "distanceInMeters");
          final int _cursorIndexOfTimeInMillis = CursorUtil.getColumnIndexOrThrow(_cursor, "timeInMillis");
          final int _cursorIndexOfCaloriesBurnt = CursorUtil.getColumnIndexOrThrow(_cursor, "caloriesBurnt");
          final List<Run> _result = new ArrayList<Run>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Run _item;
            final Bitmap _tmpImage;
            final byte[] _tmp;
            _tmp = _cursor.getBlob(_cursorIndexOfImage);
            _tmpImage = __converter.toBitmap(_tmp);
            final long _tmpTimeStamp;
            _tmpTimeStamp = _cursor.getLong(_cursorIndexOfTimeStamp);
            final float _tmpAvgSpeedInKMH;
            _tmpAvgSpeedInKMH = _cursor.getFloat(_cursorIndexOfAvgSpeedInKMH);
            final int _tmpDistanceInMeters;
            _tmpDistanceInMeters = _cursor.getInt(_cursorIndexOfDistanceInMeters);
            final long _tmpTimeInMillis;
            _tmpTimeInMillis = _cursor.getLong(_cursorIndexOfTimeInMillis);
            final int _tmpCaloriesBurnt;
            _tmpCaloriesBurnt = _cursor.getInt(_cursorIndexOfCaloriesBurnt);
            _item = new Run(_tmpImage,_tmpTimeStamp,_tmpAvgSpeedInKMH,_tmpDistanceInMeters,_tmpTimeInMillis,_tmpCaloriesBurnt);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Run>> getAllRunsSortedByDistance() {
    final String _sql = "SELECT * FROM running_table ORDER BY distanceInMeters DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"running_table"}, new Callable<List<Run>>() {
      @Override
      public List<Run> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfTimeStamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timeStamp");
          final int _cursorIndexOfAvgSpeedInKMH = CursorUtil.getColumnIndexOrThrow(_cursor, "avgSpeedInKMH");
          final int _cursorIndexOfDistanceInMeters = CursorUtil.getColumnIndexOrThrow(_cursor, "distanceInMeters");
          final int _cursorIndexOfTimeInMillis = CursorUtil.getColumnIndexOrThrow(_cursor, "timeInMillis");
          final int _cursorIndexOfCaloriesBurnt = CursorUtil.getColumnIndexOrThrow(_cursor, "caloriesBurnt");
          final List<Run> _result = new ArrayList<Run>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Run _item;
            final Bitmap _tmpImage;
            final byte[] _tmp;
            _tmp = _cursor.getBlob(_cursorIndexOfImage);
            _tmpImage = __converter.toBitmap(_tmp);
            final long _tmpTimeStamp;
            _tmpTimeStamp = _cursor.getLong(_cursorIndexOfTimeStamp);
            final float _tmpAvgSpeedInKMH;
            _tmpAvgSpeedInKMH = _cursor.getFloat(_cursorIndexOfAvgSpeedInKMH);
            final int _tmpDistanceInMeters;
            _tmpDistanceInMeters = _cursor.getInt(_cursorIndexOfDistanceInMeters);
            final long _tmpTimeInMillis;
            _tmpTimeInMillis = _cursor.getLong(_cursorIndexOfTimeInMillis);
            final int _tmpCaloriesBurnt;
            _tmpCaloriesBurnt = _cursor.getInt(_cursorIndexOfCaloriesBurnt);
            _item = new Run(_tmpImage,_tmpTimeStamp,_tmpAvgSpeedInKMH,_tmpDistanceInMeters,_tmpTimeInMillis,_tmpCaloriesBurnt);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Run>> getAllRunsSortedByTimeMillis() {
    final String _sql = "SELECT * FROM running_table ORDER BY timeInMillis DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"running_table"}, new Callable<List<Run>>() {
      @Override
      public List<Run> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfTimeStamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timeStamp");
          final int _cursorIndexOfAvgSpeedInKMH = CursorUtil.getColumnIndexOrThrow(_cursor, "avgSpeedInKMH");
          final int _cursorIndexOfDistanceInMeters = CursorUtil.getColumnIndexOrThrow(_cursor, "distanceInMeters");
          final int _cursorIndexOfTimeInMillis = CursorUtil.getColumnIndexOrThrow(_cursor, "timeInMillis");
          final int _cursorIndexOfCaloriesBurnt = CursorUtil.getColumnIndexOrThrow(_cursor, "caloriesBurnt");
          final List<Run> _result = new ArrayList<Run>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Run _item;
            final Bitmap _tmpImage;
            final byte[] _tmp;
            _tmp = _cursor.getBlob(_cursorIndexOfImage);
            _tmpImage = __converter.toBitmap(_tmp);
            final long _tmpTimeStamp;
            _tmpTimeStamp = _cursor.getLong(_cursorIndexOfTimeStamp);
            final float _tmpAvgSpeedInKMH;
            _tmpAvgSpeedInKMH = _cursor.getFloat(_cursorIndexOfAvgSpeedInKMH);
            final int _tmpDistanceInMeters;
            _tmpDistanceInMeters = _cursor.getInt(_cursorIndexOfDistanceInMeters);
            final long _tmpTimeInMillis;
            _tmpTimeInMillis = _cursor.getLong(_cursorIndexOfTimeInMillis);
            final int _tmpCaloriesBurnt;
            _tmpCaloriesBurnt = _cursor.getInt(_cursorIndexOfCaloriesBurnt);
            _item = new Run(_tmpImage,_tmpTimeStamp,_tmpAvgSpeedInKMH,_tmpDistanceInMeters,_tmpTimeInMillis,_tmpCaloriesBurnt);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Run>> getAllRunsSortedByCalories() {
    final String _sql = "SELECT * FROM running_table ORDER BY caloriesBurnt DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"running_table"}, new Callable<List<Run>>() {
      @Override
      public List<Run> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfTimeStamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timeStamp");
          final int _cursorIndexOfAvgSpeedInKMH = CursorUtil.getColumnIndexOrThrow(_cursor, "avgSpeedInKMH");
          final int _cursorIndexOfDistanceInMeters = CursorUtil.getColumnIndexOrThrow(_cursor, "distanceInMeters");
          final int _cursorIndexOfTimeInMillis = CursorUtil.getColumnIndexOrThrow(_cursor, "timeInMillis");
          final int _cursorIndexOfCaloriesBurnt = CursorUtil.getColumnIndexOrThrow(_cursor, "caloriesBurnt");
          final List<Run> _result = new ArrayList<Run>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Run _item;
            final Bitmap _tmpImage;
            final byte[] _tmp;
            _tmp = _cursor.getBlob(_cursorIndexOfImage);
            _tmpImage = __converter.toBitmap(_tmp);
            final long _tmpTimeStamp;
            _tmpTimeStamp = _cursor.getLong(_cursorIndexOfTimeStamp);
            final float _tmpAvgSpeedInKMH;
            _tmpAvgSpeedInKMH = _cursor.getFloat(_cursorIndexOfAvgSpeedInKMH);
            final int _tmpDistanceInMeters;
            _tmpDistanceInMeters = _cursor.getInt(_cursorIndexOfDistanceInMeters);
            final long _tmpTimeInMillis;
            _tmpTimeInMillis = _cursor.getLong(_cursorIndexOfTimeInMillis);
            final int _tmpCaloriesBurnt;
            _tmpCaloriesBurnt = _cursor.getInt(_cursorIndexOfCaloriesBurnt);
            _item = new Run(_tmpImage,_tmpTimeStamp,_tmpAvgSpeedInKMH,_tmpDistanceInMeters,_tmpTimeInMillis,_tmpCaloriesBurnt);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<Long> getTotalTimeInMillis() {
    final String _sql = "SELECT SUM(caloriesBurnt) FROM running_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"running_table"}, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Long _result;
          if(_cursor.moveToFirst()) {
            final Long _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<Integer> getTotalDistance() {
    final String _sql = "SELECT SUM(distanceInMeters) FROM running_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"running_table"}, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<Integer> getTotalCaloriesBurnt() {
    final String _sql = "SELECT SUM(caloriesBurnt) FROM running_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"running_table"}, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<Float> getTotalAvgSpeed() {
    final String _sql = "SELECT AVG(avgSpeedInKMH) FROM running_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"running_table"}, new Callable<Float>() {
      @Override
      public Float call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Float _result;
          if(_cursor.moveToFirst()) {
            final Float _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getFloat(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
