package com.example.lec09.persistence

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface StudentDao {

    @Insert
    fun insert(student: Student)

    @Query("SELECT * FROM students WHERE student_id = :id")
    fun selectStudent(id: Int): Student
}