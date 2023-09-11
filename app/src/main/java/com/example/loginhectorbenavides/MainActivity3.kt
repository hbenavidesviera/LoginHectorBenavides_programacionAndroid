package com.example.loginhectorbenavides

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val btn7: Button = findViewById(R.id.btnPag1Slide2)
        btn7.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        val btn8: Button = findViewById(R.id.btnPag3Slide2)
        btn8.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }

        val btn9: Button = findViewById(R.id.btnPag4Slide2)
        btn9.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)}


        //close session
        val btnClose: Button = findViewById(R.id.btnEnd)
        btnClose.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)}
    }
}