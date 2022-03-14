package com.alfa.whac_a_mole.utilits

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import com.alfa.whac_a_mole.R
import com.alfa.whac_a_mole.ui.activity.MainActivity

fun showToast(message: String) {
    Toast.makeText(APP_ACTIVITY, message, Toast.LENGTH_SHORT).show()
}

fun getRecord(): Int {
    val sharedPref: SharedPreferences =
        APP_ACTIVITY.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    return sharedPref.getInt(KEY_NAME, DEFAULT_VALUE)
}

fun putNewRecordValue(value: Int) {
    val sharedPref: SharedPreferences =
        APP_ACTIVITY.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    val editor: SharedPreferences.Editor = sharedPref.edit()
    editor.putInt(KEY_NAME, value)
    editor.apply()
}

fun AppCompatActivity.startActivityMain(context: Context) {
    val intent = Intent(context, MainActivity::class.java)
    startActivity(intent)
}