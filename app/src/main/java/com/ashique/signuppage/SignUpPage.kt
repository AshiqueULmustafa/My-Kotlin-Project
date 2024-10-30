package com.ashique.signuppage

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignUpPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_page)
        val fName: EditText = findViewById(R.id.etFname)
        val lName: EditText = findViewById(R.id.etLname)
        val dob: EditText = findViewById(R.id.etDOB)
        val email: EditText = findViewById(R.id.etEmail)
        val password: EditText = findViewById(R.id.etPass)
        val phone: EditText = findViewById(R.id.etPhone)
        val confirmpass: EditText = findViewById(R.id.etCpass)
        val btnsignup : Button = findViewById(R.id.btnSubmit)

    }
}