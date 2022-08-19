package com.example.data.data_source.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.data.data_source.dao.NoteDao
import com.example.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase: RoomDatabase() {
    abstract fun noteDao(): NoteDao
    companion object {
        const val DATABASE_NAME = "note_database"
    }
}