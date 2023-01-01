package com.example.myapplication.Model
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class UserModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int?,
    val email: String? = "",
    val password:String? = ""
)
