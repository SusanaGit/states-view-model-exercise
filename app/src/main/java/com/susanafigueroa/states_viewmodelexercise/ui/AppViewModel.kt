package com.susanafigueroa.states_viewmodelexercise.ui

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel

class AppViewModel : ViewModel() {

    var listStatus = mutableStateListOf<String>()

    fun addCurrentStatus(status: String) {
        listStatus.add(status)
    }

    fun resetListStatus() {
        listStatus.clear()
    }
}