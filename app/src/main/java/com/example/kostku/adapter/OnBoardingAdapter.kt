package com.example.kostku.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.PagerAdapter

import com.example.kostku.R
import com.example.kostku.databinding.SlideOnboardingBinding

class OnBoardingAdapter(val context: Context): PagerAdapter()  {

    val imgArray: IntArray = intArrayOf(R.drawable.page1, R.drawable.page2, R.drawable.page3)
    val titleArray: Array<String> = arrayOf("Sewa Kost Dengan Mudah", "Atur Lokasi yang Kamu Inginkan", "Bersantai dan Nikmati Kost-mu!")
    val subTitleArray: Array<String> = arrayOf("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s")
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun getCount(): Int {
        return imgArray.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val binding = SlideOnboardingBinding.inflate(LayoutInflater.from(context), container, false)
        binding.txtTitle.text = titleArray[position]
        binding.txtSubTitle.text = subTitleArray[position]
        binding.imgOnBoarding.setImageDrawable(ContextCompat.getDrawable(context, imgArray[position]))

        container?.addView(binding.root)
        return binding.root
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val view: View = `object` as View
        container.removeView(view)
    }
}