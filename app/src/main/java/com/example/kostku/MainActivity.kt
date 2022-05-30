package com.example.kostku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.kostku.menu.HomeFragment
import com.example.kostku.menu.OtherFragment
import com.example.kostku.menu.SearchFragment
import com.example.kostku.menu.TransactionFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_nav.setOnNavigationItemSelectedListener(onBottomNav)
        bottom_nav.getOrCreateBadge(R.id.trasaction_active).apply {
            number = 2
            isVisible = true
            backgroundColor = resources.getColor(R.color.menu_active)
        }

        var fragment = supportFragmentManager.beginTransaction()
        fragment.add(R.id.fl_fragment, HomeFragment())
        fragment.commit()
    }

    private val onBottomNav = BottomNavigationView.OnNavigationItemSelectedListener { i ->
        var selectedFragment: Fragment = HomeFragment()

        when(i.itemId){
            R.id.home_active -> {
                selectedFragment = HomeFragment()
            }
            R.id.search_active -> {
                selectedFragment = SearchFragment()
            }
            R.id.trasaction_active -> {
                selectedFragment = TransactionFragment()
                bottom_nav.getOrCreateBadge(R.id.trasaction_active).apply {
                    number = 0
                    isVisible = false
                }
            }
            R.id.other_active -> {
                selectedFragment = OtherFragment()
            }
        }

        var fragment = supportFragmentManager.beginTransaction()
        fragment.replace(R.id.fl_fragment, selectedFragment)
        fragment.commit()

        true



    }
}