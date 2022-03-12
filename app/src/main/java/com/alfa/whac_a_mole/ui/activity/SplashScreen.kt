package com.alfa.whac_a_mole.ui.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.alfa.whac_a_mole.R
import com.alfa.whac_a_mole.utilits.APP_ACTIVITY
import com.alfa.whac_a_mole.utilits.startActivityMain

@SuppressLint("CustomSplashScreen")
class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        startActivityMain(this)
        finish()
    }
}