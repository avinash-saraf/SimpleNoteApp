package com.example.feature_note.add_edit_todo

import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.toArgb
import androidx.lifecycle.ViewModel
import com.example.domain.model.Note
import com.example.domain.use_case.NoteUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AddEditNoteViewModel @Inject constructor(
    private val noteUseCases: NoteUseCases
): ViewModel() {

    // Wrapping noteTitle state within its own NoteTextFieldState, instead of wrapping it within a AddEditTodoUiState along with other state variables.
    // This is because everytime we enter a character in the noteTitle text field, it will update the AddEditTodoUiState
    // which will not only recompose the noteTitle text field, but the entire page, since the UiState has updated.
    // The noteTitle state will update the UiState very frequently, causing recomposition of the entire page very often,
    // which is not an optimal approach.
    private val _noteTitle = mutableStateOf(NoteTextFieldState())
    val noteTitle: State<NoteTextFieldState> = _noteTitle

    private val _noteContent = mutableStateOf(NoteTextFieldState())
    val noteContent: State<NoteTextFieldState> = _noteContent

    private val _noteColor = mutableStateOf<Int>(Note.noteColors.random().toArgb())
    val noteColor: State<Int> = _noteColor

    private val _isSnackbarVisible = mutableStateOf(false)
    val isSnackbarVisible: State<Boolean> = _isSnackbarVisible

    



}