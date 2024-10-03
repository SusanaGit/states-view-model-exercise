package com.susanafigueroa.states_viewmodelexercise

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.susanafigueroa.states_viewmodelexercise.ui.AppViewModel
import com.susanafigueroa.states_viewmodelexercise.ui.StatesViewModelApp

class MainActivity : ComponentActivity() {

    var statestartON: Boolean = false
    var stateresumeON: Boolean = false
    var staterestartON: Boolean = false
    var statepauseON: Boolean = false
    var statestopON: Boolean = false
    var statedestroyON: Boolean = false

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, getString(R.string.oncreate_called))
        enableEdgeToEdge()
        setContent {
            val appViewModel: AppViewModel = viewModel()
            appViewModel.addCurrentStatus(getString(R.string.oncreate_called))

            SaveCurrentStates(appViewModel)
            
            Scaffold(
                topBar = {
                    CenterAlignedTopAppBar(
                        title = {
                            Text(
                                text = stringResource(R.string.states_view_model_exercise)
                            )
                        },
                        colors = TopAppBarDefaults.largeTopAppBarColors(
                            containerColor = Color(0xFFFFC107)
                        )
                    )
                }
            ) { innerPadding ->
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    StatesViewModelApp(appViewModel)
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, getString(R.string.onstart_called))
        statestartON = true
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, getString(R.string.onresume_called))
        stateresumeON = true
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, getString(R.string.onrestart_called))
        staterestartON = true
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, getString(R.string.onpause_called))
        statepauseON = true
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, getString(R.string.onstop_called))
        statestopON = true
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, getString(R.string.ondestroy_called))
        statedestroyON = true
    }

    @Composable
    fun SaveCurrentStates(
        appViewModel: AppViewModel
    ) {
        if (statestartON) {
            appViewModel.addCurrentStatus(getString(R.string.oncreate_called))
            statestartON = false
        }
        if (stateresumeON) {
            appViewModel.addCurrentStatus(getString(R.string.onresume_called))
            stateresumeON = false
        }
        if (staterestartON) {
            appViewModel.addCurrentStatus(getString(R.string.onrestart_called))
            staterestartON = false
        }
        if (statepauseON) {
            appViewModel.addCurrentStatus(getString(R.string.onpause_called))
            statepauseON = false
        }
        if (statestopON) {
            appViewModel.addCurrentStatus(getString(R.string.onstop_called))
            statestopON = false
        }
        if (statedestroyON) {
            appViewModel.addCurrentStatus(getString(R.string.onresume_called))
            statedestroyON = false
        }
    }
}

