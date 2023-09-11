package com.example.loginhectorbenavides

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)


        val btn13: Button = findViewById(R.id.btnPag1Slide4)
        btn13.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        val btn14: Button = findViewById(R.id.btnPag2Slide4)
        btn14.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        val btn15: Button = findViewById(R.id.btnPag3Slide4)
        btn15.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)}

        //close session
        val btnClose: Button = findViewById(R.id.btnEnd)
        btnClose.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)}
    }
}