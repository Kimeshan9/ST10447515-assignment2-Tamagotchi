package com.kim.my_tamagotchi_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonlogin = findViewById<Button>(R.id.buttonlogin)
       buttonlogin.setOnClickListener { val intent = Intent(this,Tamagotchi2::class.java)
            startActivity(intent)
        }
    }
}