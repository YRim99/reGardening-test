package com.example.regardening_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class private1 : AppCompatActivity() {
    lateinit var back: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_private1)
        back = findViewById<Button>(R.id.back)

        back.setOnClickListener {
            var intent = Intent(this, separate::class.java)
            startActivity(intent)
        }
    }
}