package com.example.regardening_test


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class Home : AppCompatActivity() {
    private val frag_garden = frag_garden()
    private val frag_collection = frag_collection()
    private val frag_mission = frag_mission()
    private val frag_history = frag_history()
    private lateinit var bnv_home : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        bnv_home = findViewById(R.id.bnv_home)

        initNavigationBar()
    }

    @Suppress("DEPRECATION")
    private fun initNavigationBar(){
        bnv_home.run {
            setOnNavigationItemReselectedListener {
                when(it.itemId){
                    R.id.first -> {
                        changeFragment(frag_garden)
                    }
                    R.id.second -> {
                        changeFragment(frag_collection)
                    }
                    R.id.third -> {
                        changeFragment(frag_mission)
                    }
                    R.id.fourth -> {
                        changeFragment(frag_history)
                    }
                }
                true
            }
            selectedItemId = R.id.first
        }
    }

    private fun changeFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fl_container, fragment)
            .commit()
    }
}