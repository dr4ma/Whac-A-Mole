package com.alfa.whac_a_mole.utilits

import android.widget.Toast
import com.alfa.whac_a_mole.R

fun showToast(message: String){
    Toast.makeText(APP_ACTIVITY, message, Toast.LENGTH_SHORT).show()
}