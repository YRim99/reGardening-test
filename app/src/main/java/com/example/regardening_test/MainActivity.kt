package com.example.regardening_test

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var main_click : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var background : ImageView = findViewById(R.id.imageView)

        ObjectAnimator.ofFloat(background, "translationX", 100f).apply {
            duration = 2000
            start()
        }

        main_click = findViewById(R.id.main_click)
        main_click.setOnClickListener {
            var intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

    }
}
