package com.example.domain.use_case

import com.example.domain.model.Note
import com.example.domain.repository.NoteRepository

class GetSingleNoteUseCase
    (
    private val repository: NoteRepository
) {
        suspend operator fun invoke(id: Int): Note? {
            return repository.getNoteById(id)
        }
}