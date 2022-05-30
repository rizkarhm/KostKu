package com.example.kostku.util

import android.content.Context
import android.preference.PreferenceManager

class SharedPreference(val  context: Context){
    companion object{
        private const val FIRST_INSTALL = "FIST_INSTALL"
    }

    private val p = PreferenceManager.getDefaultSharedPreferences(context)

    var firstInstall = p.getBoolean(FIRST_INSTALL, false)
    set(value) = p.edit().putBoolean(FIRST_INSTALL, value).apply()
}