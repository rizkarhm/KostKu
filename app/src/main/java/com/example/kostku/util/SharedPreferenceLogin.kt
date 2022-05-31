package com.example.kostku.util

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences

class SharedPreferenceLogin(activity: Activity) {
    private var sp: SharedPreferences? = null
    private val login = "login"

    init {
        sp = activity.getSharedPreferences("spLogin", Context.MODE_PRIVATE)
    }

    fun setIsLogin(value: Boolean){
        sp!!.edit().putBoolean(login, false)
    }

    fun getIsLogin(): Boolean{
        return sp!!.getBoolean(login, false)
    }

}