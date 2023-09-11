package com.example.loginhectorbenavides

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val btn4: Button = findViewById(R.id.btnPag2Slide1)
        btn4.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        val btn5: Button = findViewById(R.id.btnPag3Slide1)
        btn5.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }

        val btn6: Button = findViewById(R.id.btnPag4Slide1)
        btn6.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)}
//close session
        val btnClose: Button = findViewById(R.id.btnEnd)
        btnClose.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)}


    }
}