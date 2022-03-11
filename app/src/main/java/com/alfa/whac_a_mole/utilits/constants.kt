package com.alfa.whac_a_mole.utilits

import android.content.Context
import android.content.SharedPreferences
import com.alfa.whac_a_mole.ui.activity.MainActivity

lateinit var APP_ACTIVITY : MainActivity

const val PREFS_NAME = "preferences"
const val KEY_NAME = "record"
const val DEFAULT_VALUE = 0
val sharedPref: SharedPreferences = APP_ACTIVITY.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
val editor : SharedPreferences.Editor = sharedPref.edit()
