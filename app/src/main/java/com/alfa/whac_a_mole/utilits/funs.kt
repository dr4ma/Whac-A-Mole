package com.alfa.whac_a_mole.utilits

import android.content.Context
import android.content.SharedPreferences
import android.widget.Toast
import com.alfa.whac_a_mole.R

fun showToast(message: String){
    Toast.makeText(APP_ACTIVITY, message, Toast.LENGTH_SHORT).show()
}

fun getRecord(): Int{
    val sharedPref: SharedPreferences = APP_ACTIVITY.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    return sharedPref.getInt(KEY_NAME, DEFAULT_VALUE)
}
fun putNewRecordValue(value : Int){
    val sharedPref: SharedPreferences = APP_ACTIVITY.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    val editor : SharedPreferences.Editor = sharedPref.edit()
    editor.putInt(KEY_NAME, value)
    editor.commit()
}