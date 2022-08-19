package com.example.feature_note.notes

import com.example.domain.model.Note
import com.example.domain.util.NoteOrder
import com.example.domain.util.OrderType

data class NotesUiState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
