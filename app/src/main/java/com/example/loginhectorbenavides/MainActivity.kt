package com.example.loginhectorbenavides

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var txtUser: EditText
    private lateinit var txtPassword: EditText
    private lateinit var loginButton: Button

    @SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtUser = findViewById(R.id.txtUser)
        txtPassword = findViewById(R.id.txtPassword)
        loginButton = findViewById(R.id.btnIngresar)

        loginButton.setOnClickListener {
            validarUsuario()
        }
    }

    private fun validarUsuario(){
        val username = txtUser.text.toString()
        val password = txtPassword.text.toString()

        if (username == "hector" && password =="1234"){
            Toast.makeText(this, "usuario correcto", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

        }
        else {
            Toast.makeText(this, "credenciales incorrectas", Toast.LENGTH_SHORT).show()
        }
    }
}