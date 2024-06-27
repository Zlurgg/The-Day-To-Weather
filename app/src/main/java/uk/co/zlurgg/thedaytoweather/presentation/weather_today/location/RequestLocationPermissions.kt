package uk.co.zlurgg.thedaytoweather.presentation.weather_today.location

import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import uk.co.zlurgg.thedaytoweather.presentation.weather_today.WeatherTodayViewModel

@Composable
fun RequestLocationPermissions(viewModel: WeatherTodayViewModel) {
    val launcher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestMultiplePermissions()
    ) { permissions->
        // Check if all permissions are granted
        val allGranted = permissions.values.all { it }
        if (allGranted) {
            viewModel.loadWeatherInfo()
        } else {
            // Handle permission denial (e.g., show a message)
        }
    }

    // Trigger the permission request
    LaunchedEffect(Unit) {
        viewModel.requestLocationPermissions(launcher)
    }
}