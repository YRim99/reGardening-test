package com.example.regardening_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class separate : AppCompatActivity() {
    lateinit var btn_vinil : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_separate)
        btn_vinil = findViewById<Button>(R.id.btn_vinil)

        btn_vinil.setOnClickListener{
            var intent = Intent(this, vinil::class.java)
            startActivity(intent)
        }
    }
}