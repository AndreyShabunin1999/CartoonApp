package com.anshabunin.cartoonapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class SplashViewModel : ViewModel() {
    private val _isLoading = MutableStateFlow(true)
    val isLoading: StateFlow<Boolean> = _isLoading

    fun loadData() {
        viewModelScope.launch {
            // Симуляция загрузки данных
            delay(3000) // 3 секунды
            _isLoading.value = false
        }
    }
}
