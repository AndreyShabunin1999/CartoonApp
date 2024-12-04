package com.anshabunin.cartoonapp

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.background
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun SplashScreen(
    splashViewModel: SplashViewModel = viewModel(),
    onTimeout: () -> Unit
) {
    // Симулируем подгрузку данных
    androidx.compose.runtime.LaunchedEffect(Unit) {
        splashViewModel.loadData() // Метод загрузки данных
        kotlinx.coroutines.delay(2000) // Задержка
        onTimeout()
    }

    // UI для SplashScreen
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF6200EE)),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "My App",
            color = Color.White,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )
    }
}