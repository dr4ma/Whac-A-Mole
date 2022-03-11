package com.alfa.whac_a_mole.utilits

import android.widget.Toast
import com.alfa.whac_a_mole.R

fun showToast(message: String){
    Toast.makeText(APP_ACTIVITY, message, Toast.LENGTH_SHORT).show()
}

fun getRecord(): Int{
    return sharedPref.getInt(KEY_NAME, DEFAULT_VALUE)
}
fun putNewRecordValue(value : Int){
    editor.putInt(KEY_NAME, value)
    editor.commit()
}