package com.example.comlibrary.components.snackbar


import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class SnackbarHostState {

    var currentSnackbar by mutableStateOf<SnackbarData?>(null)
        private set

    suspend fun showSnackbar(
        message: String,
        type: SnackbarType
    ) {
        currentSnackbar = SnackbarData(message, type)

        kotlinx.coroutines.delay(3000)

        currentSnackbar = null
    }
}