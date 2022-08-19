package com.example.feature_note.notes

import com.example.domain.model.Note
import com.example.domain.util.NoteOrder

sealed class NotesUserEvent {
    data class Order(val noteOrder: NoteOrder): NotesUserEvent()
    data class DeleteNote(val note: Note): NotesUserEvent()
    object RestoreNote: NotesUserEvent()
    object ToggleOrderSection: NotesUserEvent()
}
