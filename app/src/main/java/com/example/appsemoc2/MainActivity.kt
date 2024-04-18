package com.example.appsemoc2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a = findViewById<Button>(R.id.ActivityMain_Button_button2)
        a.setOnClickListener{
            startActivity(Intent(this,calendar::class.java ))
        }
    }
}