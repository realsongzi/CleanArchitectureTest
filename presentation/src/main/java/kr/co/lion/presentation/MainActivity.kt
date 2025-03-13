package kr.co.lion.presentation

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MainActivity: Application(){
    override fun onCreate() {
        super.onCreate()
    }
}