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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.susanafigueroa.states_viewmodelexercise.ui.StatesViewModelApp

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, getString(R.string.oncreate_called))

        enableEdgeToEdge()
        setContent {
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
                    StatesViewModelApp()
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, getString(R.string.onstart_called))
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, getString(R.string.onresume_called))
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, getString(R.string.onrestart_called))
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, getString(R.string.onpause_called))
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, getString(R.string.onstop_called))
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, getString(R.string.ondestroy_called))
    }
}

