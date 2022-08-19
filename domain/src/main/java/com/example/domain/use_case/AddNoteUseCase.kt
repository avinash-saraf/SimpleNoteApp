package com.example.domain.use_case

import com.example.domain.model.InvalidNoteException
import com.example.domain.model.Note
import com.example.domain.repository.NoteRepository
import kotlin.jvm.Throws

class AddNoteUseCase(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("The title of the note has not been entered.")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("The content of the note has not been entered.")
        }
        repository.insertNote(note)
    }
}