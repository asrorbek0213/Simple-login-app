package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


fun ViewCompat.Companion.setOnApplyWindowInsetsListener(
    view: android.view.View,
    function: (android.view.View, androidx.core.view.WindowInsetsCompat) -> kotlin.Unit
) {
}

class MainActivity : AppCompatActivity() {

    lateinit var usernameInput: EditText
    lateinit var passwordInput: EditText

    lateinit var loginBtn: Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

            usernameInput = findViewById(R.id.username_input>)
            passwordInput = findViewById(R.id.password_input>)
            loginBtn = findViewById(R.id.login_button>)

            loginBtn.setOnClickListener {
                val username = usernameInput.text.toString()
                val password = passwordInput.text.toString()
                Log.i("Test Creditianals", "Username: $username, Password: $password")
            }


        }
    }
}