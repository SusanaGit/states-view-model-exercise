package com.susanafigueroa.states_viewmodelexercise.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class AppViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(AppUiState())
    val uiState: StateFlow<AppUiState> = _uiState.asStateFlow()

    init {
        ResetListStatus()
    }

    fun AddCurrentStatus(status: String) {
        _uiState.value.currentStatus = status
        _uiState.value.listStatus.add(status)
    }

    fun ResetListStatus() {
        _uiState.value.listStatus.clear()
    }
}