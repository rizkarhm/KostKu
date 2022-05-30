package com.example.kostku

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import com.example.kostku.adapter.OnBoardingAdapter
import com.example.kostku.util.SharedPreference
import kotlinx.android.synthetic.main.activity_on_boarding.*

class OnBoardingActivity : AppCompatActivity() {

    lateinit var obAdapter: OnBoardingAdapter
    val dots = arrayOfNulls<TextView>(3)
    var currentpage: Int = 0
    lateinit var pre: SharedPreference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding)

        pre = SharedPreference(this)
        obAdapter = OnBoardingAdapter(this)
        vp_ob.adapter = obAdapter
        dotIndicator(currentpage)

        Handler().postDelayed({

            initAction()
        }, 1500)
    }

    fun initAction(){
        vp_ob.addOnPageChangeListener(object: ViewPager.OnPageChangeListener{
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {}

            override fun onPageSelected(position: Int) {
                dotIndicator(position)
                currentpage = position
            }

            override fun onPageScrollStateChanged(state: Int) {}

        })

        txt_next.setOnClickListener{
            if (vp_ob.currentItem + 1 < dots.size){
                vp_ob.currentItem += 1
            } else {
                pre.firstInstall = true
                val intent = Intent(this@OnBoardingActivity, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

        txt_skip.setOnClickListener{
            pre.firstInstall = true
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun dotIndicator(p: Int){
        ll_dots.removeAllViews()

        for (i in 0..dots.size-1){
            dots[i] = TextView(this)
            dots[i]?.textSize = 50f
            dots[i]?.text = "_ "
            dots[p]?.setTextColor(resources.getColor(R.color.disable))

            ll_dots.addView(dots[i])
        }

        if (dots.size> 0){
            dots[p]?.setTextColor(resources.getColor(R.color.active))
        }
    }
}