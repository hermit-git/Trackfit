package com.example.trackfit.repository

import com.example.trackfit.database.LocalDataSource
import javax.inject.Inject

class Repository @Inject constructor(
    private val localDataSource: LocalDataSource
) {
    val local = localDataSource
}