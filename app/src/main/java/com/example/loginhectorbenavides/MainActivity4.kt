package com.example.loginhectorbenavides

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)


        val btn10: Button = findViewById(R.id.btnPag1Slide3)
        btn10.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        val btn11: Button = findViewById(R.id.btnPag2Slide3)
        btn11.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        val btn12: Button = findViewById(R.id.btnPag4Slide3)
        btn12.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)}

        //close session
        val btnClose: Button = findViewById(R.id.btnEnd)
        btnClose.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)}
    }
}