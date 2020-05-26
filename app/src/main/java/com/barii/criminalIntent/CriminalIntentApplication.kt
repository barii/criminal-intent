package com.barii.criminalIntent

import android.app.Application
import com.barii.criminalIntent.database.CrimeRepository

class CriminalIntentApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}
