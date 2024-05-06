package com.kim.my_tamagotchi_app

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.ProgressBar
import kotlin.concurrent.timer

class Tamagotchi2 : AppCompatActivity() {
    lateinit var imageView : ImageView
    lateinit var button: Button
    lateinit var button2 : Button
    lateinit var button3 : Button
    lateinit var progressbar1 :ProgressBar
    lateinit var progressbar2 :ProgressBar
    lateinit var progressbar3 :ProgressBar
    lateinit var edttext1 : EditText
    lateinit var edttext2 : EditText
    lateinit var edttext3 : EditText
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_tamagotchi2)

        imageView = findViewById(R.id.imageView2)
        button = findViewById(R.id.button)
        button2 = findViewById(R.id.button2)
        button3 =findViewById(R.id.button3)
        progressbar1 =findViewById(R.id.progressBar1)
        progressbar2 =findViewById(R.id.progressBar2)
        progressbar3 =findViewById(R.id.progressBar3)
        edttext1 =findViewById(R.id.editTextNumber1)
        edttext2 =findViewById(R.id.editTextNumber2)
        edttext3 =findViewById(R.id.editTextNumber3)

        button.setOnClickListener {
            //change the image when the button is clicked
            imageView.setImageResource(R.drawable.eating)
            //Increases the progress by 5 when the button is clicked
            progressbar1.progress +=5
            //Get current value
            val currentValue =edttext1.text.toString().toIntOrNull() ?:0
            //Increase the value by 5
            val newValue = currentValue + 5
            //set the new value to EditText
            edttext1.setText(newValue.toString())
        }
        button2.setOnClickListener {
            //change the image when the button is clicked
            imageView.setImageResource(R.drawable.play)
            //Increases the progress bar by 5 when the button is clicked
            progressbar2.progress +=5
            //Get current value
            val currentValue =edttext2.text.toString().toIntOrNull() ?:0
            //Increase the value by 5
            val newValue = currentValue + 5
            //set the new value to EditText
            edttext2.setText(newValue.toString())
        }
        button3.setOnClickListener {
            //change the image when the button is clicked
            imageView.setImageResource(R.drawable.bath)
            //Increases the progress bar by 5 when the button is clicked
            progressbar3.progress +=5
            //Get current value
            val currentValue =edttext3.text.toString().toIntOrNull() ?:0
            //Increase the value by 5
            val newValue = currentValue + 5
            //set the new value to EditText
            edttext3.setText(newValue.toString())
        }
        val timer1 = object : CountDownTimer(60000, 1000) { // 60 seconds countdown, decrementing every 1 second
            override fun onTick(millisUntilFinished: Long) {
                val progress = (millisUntilFinished / 600).toInt() // Adjust progress bar decrement rate
                progressbar1.progress = progress
            }

            override fun onFinish() {
                progressbar1.progress = 0 // Reset progress bar when countdown finishes
            }
        }
        val timer2 = object : CountDownTimer(60000, 1000) { // 60 seconds countdown, decrementing every 1 second
            override fun onTick(millisUntilFinished: Long) {
                val progress = (millisUntilFinished / 600).toInt() // Adjust progress bar decrement rate
                progressbar2.progress = progress
            }

            override fun onFinish() {
                progressbar2.progress = 0 // Reset progress bar when countdown finishes
            }
        }
        val timer3 = object : CountDownTimer(60000, 1000) { // 60 seconds countdown, decrementing every 1 second
            override fun onTick(millisUntilFinished: Long) {
                val progress = (millisUntilFinished / 600).toInt() // Adjust progress bar decrement rate
                progressbar3.progress = progress
            }

            override fun onFinish() {
                progressbar3.progress = 0 // Reset progress bar when countdown finishes
            }
        }

    }
}