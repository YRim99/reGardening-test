package com.example.regardening_test
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var main_click : TextView
    lateinit var imageView : ImageView
    var handler : Handler = Handler()
    var runnable : Runnable = Runnable {  }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)

        main_click = findViewById(R.id.main_click)
        main_click.setOnClickListener {
            var intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
    }


}