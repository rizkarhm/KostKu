package com.example.kostku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.kostku.util.SharedPreference

class SplashActivity : AppCompatActivity() {
    lateinit var pre: SharedPreference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        pre = SharedPreference(this)

        Handler().postDelayed({
            var i = Intent()
            if (!pre.firstInstall){
                i = Intent(this, OnBoardingActivity::class.java)
            } else{
                i = Intent(this, MainActivity::class.java)
            }

            startActivity(i)
            finish()
        }, 1500)
    }
}