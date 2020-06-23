package com.trainingApp.appA

import android.app.Application
import android.util.Log

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        Log.e("start" ,"the app class has been created")
    }
}