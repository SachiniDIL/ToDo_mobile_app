package com.example.todo_mobile_app.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Time
import java.sql.Date


@Entity
data class TodoItem(
    @PrimaryKey(autoGenerate = true) val todoID: Long = 0,
    @ColumnInfo(name = "todoName") val todoName: String?,
    @ColumnInfo(name = "description") val description: String? = null,
    @ColumnInfo(name = "time") val time: Time? = null,
    @ColumnInfo(name = "date") val date: Date?,
    @ColumnInfo(name = "priority") val priority: Int = 0
)