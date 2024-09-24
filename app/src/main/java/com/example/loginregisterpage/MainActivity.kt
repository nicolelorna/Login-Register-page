package com.example.loginregisterpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

//    lateinit var firstnameInput: EditText
//    lateinit var lastnameInput: EditText
//    lateinit var PasswordInput: EditText
//    lateinit var emailInput: EditText
//    lateinit var registerbtn: Button



    lateinit var firstnameInput: EditText
    lateinit var lastnameInput: EditText
    lateinit var passwordInput: EditText
    lateinit var emailInput: EditText
    lateinit var registerBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstnameInput = findViewById(R.id.firstname_input)
        lastnameInput = findViewById(R.id.lastname_input)
        passwordInput = findViewById(R.id.password_input)
        emailInput = findViewById(R.id.email_input)
        registerBtn = findViewById(R.id.register_btn)

        registerBtn.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

        }


    }
}