package com.example.regardening_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class separate : AppCompatActivity() {
    lateinit var btn_vinil : Button
    lateinit var btn_can : Button
    lateinit var btn_paper : Button
    lateinit var btn_plastic : Button
    lateinit var btn_styrofoam : Button
    lateinit var btn_glass : Button
    lateinit var btn_private : Button
    lateinit var btn_nonfire : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_separate)
        btn_vinil = findViewById<Button>(R.id.btn_vinil)
        btn_can = findViewById(R.id.btn_can)
        btn_paper = findViewById(R.id.btn_paper)
        btn_plastic = findViewById(R.id.btn_plastic)
        btn_styrofoam = findViewById(R.id.btn_styrofoam)
        btn_glass = findViewById(R.id.btn_glass)
        btn_private = findViewById(R.id.btn_private)
        btn_nonfire = findViewById(R.id.btn_nonfire)

        btn_vinil.setOnClickListener{
            var intent = Intent(this, vinil::class.java)
            startActivity(intent)
        }
        btn_can.setOnClickListener{
            var intent = Intent(this, iron::class.java)
            startActivity(intent)
        }
        btn_paper.setOnClickListener{
            var intent = Intent(this, paper::class.java)
            startActivity(intent)
        }
        btn_plastic.setOnClickListener{
            var intent = Intent(this, plastic::class.java)
            startActivity(intent)
        }
        btn_styrofoam.setOnClickListener{
            var intent = Intent(this, styrofoam::class.java)
            startActivity(intent)
        }
        btn_glass.setOnClickListener{
            var intent = Intent(this, glass::class.java)
            startActivity(intent)
        }
        btn_private.setOnClickListener{
            var intent = Intent(this, private1::class.java)
            startActivity(intent)
        }
        btn_nonfire.setOnClickListener{
            var intent = Intent(this, nonfire::class.java)
            startActivity(intent)
        }
    }
}