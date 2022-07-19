package com.example.moogledex.shared

import com.example.moogledex.data.network.MoogleClient
import javax.inject.Inject

class MoogleRepository @Inject constructor(
    private val moogleClient : MoogleClient
){
}