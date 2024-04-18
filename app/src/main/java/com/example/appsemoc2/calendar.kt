package com.example.appsemoc2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class calendar : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)
        var a = findViewById<Button>(R.id.CalendarMain_Button_CardViewMesaRedonda_Button)
        a.setOnClickListener{
            startActivity(Intent(this,Inscription::class.java ))
        }
    }
}