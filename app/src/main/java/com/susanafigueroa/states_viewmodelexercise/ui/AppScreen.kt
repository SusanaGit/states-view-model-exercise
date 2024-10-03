package com.susanafigueroa.states_viewmodelexercise.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.susanafigueroa.states_viewmodelexercise.ui.theme.StatesViewModelExerciseTheme

@Composable
fun StatesViewModelApp(

) {
    StatesViewModelLayout()
}

@Composable
fun StatesViewModelLayout() {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(15.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    StatesViewModelExerciseTheme {
        StatesViewModelApp()
    }
}