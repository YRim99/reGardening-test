package com.example.regardening_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class iron : AppCompatActivity() {
    lateinit var back: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iron)
        back = findViewById<Button>(R.id.back)

        back.setOnClickListener {
            var intent = Intent(this, separate::class.java)
            startActivity(intent)
        }
    }
}