package com.example.tiptime

import android.app.Application
import com.google.android.material.color.DynamicColors
//for adding dynamic color
class TipTimeApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        //Apply Dynamic colors
        DynamicColors.applyToActivitiesIfAvailable(this, R.style.AppTheme_Overlay)
    }
}