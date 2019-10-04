package com.example.if26newversion;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

@Dao
public interface UserDao {
    //S'il y a un conflit on ecrase l'ancien.
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void createUser(UserModel user);

    @Query("SELECT * FROM UserModel WHERE username = :userId")
    LiveData<UserModel> getUser(long userId);
}
