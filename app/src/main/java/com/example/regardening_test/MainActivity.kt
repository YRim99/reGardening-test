package com.example.regardening_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var main_click : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_click = findViewById(R.id.main_click)
        main_click.setOnClickListener {
            var intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
    }
}