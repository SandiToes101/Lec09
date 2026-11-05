package com.example.lec09.persistence

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "students")

data class Student (
    @PrimaryKey @ColumnInfo(name = "student_id") val studentId: Int = 0,
    @ColumnInfo(name = "student_name") val studentName: String = "",
    @ColumnInfo(name = "student_course") val studentCourse: String= ""
)
