package com.example.comlibrary.components.snackbar


import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SnackbarHost(
    hostState: SnackbarHostState
) {

    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.TopCenter
    ) {

        AnimatedVisibility(
            visible = hostState.currentSnackbar != null
        ) {

            hostState.currentSnackbar?.let {

                Box(
                    modifier = Modifier.padding(16.dp)
                ) {
                    LibrarySnackbar(
                        message = it.message,
                        type = it.type
                    )
                }
            }
        }
    }
}