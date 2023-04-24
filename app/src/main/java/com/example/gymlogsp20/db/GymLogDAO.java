package com.example.gymlogsp20.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.gymlogsp20.GymLog;

import java.util.List;

@Dao
public interface GymLogDAO {

    @Insert
    void insert(GymLog...gymLogs);

    @Update
    void update(GymLog...gymLogs);

    @Delete
    void delete(GymLog gymLog);

    @Query("SELECT * FROM " + AppDatabase.GYMLOG_TABLE)
    List<GymLog> getGymLogs();

    @Query("SELECT * FROM " + AppDatabase.GYMLOG_TABLE + " WHERE mLogId = :logId")
    GymLog getGymLogsById(int logId);

}
