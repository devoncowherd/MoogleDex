package com.example.moogledex.shared

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MoogleViewModel @Inject constructor (
    private val repo : MoogleRepository
        ) : ViewModel() {
}