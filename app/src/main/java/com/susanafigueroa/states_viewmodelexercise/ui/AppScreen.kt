package com.susanafigueroa.states_viewmodelexercise.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.susanafigueroa.states_viewmodelexercise.R
import com.susanafigueroa.states_viewmodelexercise.ui.theme.StatesViewModelExerciseTheme

@Composable
fun StatesViewModelApp(
) {
    StatesViewModelLayout()
}

@Composable
fun StatesViewModelLayout() {
    Box(
        contentAlignment = Alignment.Center
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ShowListStates(states = listOf(
                "hola",
                "hola2",
                "hola3"
            ))

            ShowButtonReset()
        }
    }
}

@Composable
fun ShowListStates(
    states: List<String>
) {
    Text(
        text = "States",
        style = TextStyle(
            fontSize = 30.sp,
            textDecoration = TextDecoration.Underline
        ),
        modifier = Modifier
            .padding(10.dp)
    )

    LazyColumn(
        modifier = Modifier
            .clip(RoundedCornerShape(12.dp))
            .background(Color(0x68FFC107))
            .width(200.dp)
            .padding(20.dp)
            .height(300.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items(states) { state ->
            Text(
                text = state,
                modifier = Modifier
                    .padding(3.dp)
            )
        }
    }

}

@Composable
fun ShowButtonReset() {
    Button(
        modifier = Modifier
            .padding(10.dp)
            .width(200.dp),
        onClick = {

            }
        ) {
        Text(
            text = stringResource(R.string.reset),
            fontSize = 20.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    StatesViewModelExerciseTheme {
        StatesViewModelApp()
    }
}