package com.ashique.signuppage


import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

class SignUpPage : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_page)
        val fName = findViewById<EditText>(R.id.etFname)
        val lName = findViewById<EditText>(R.id.etLname)
        val dob = findViewById<EditText>(R.id.etDOB)
        val email = findViewById<EditText>(R.id.etEmail)
        val password = findViewById<EditText>(R.id.etPass)
        val phone = findViewById<EditText>(R.id.etPhone)
        val confirmpass = findViewById<EditText>(R.id.etCpass)
        val btnsubmit : Button = findViewById(R.id.btnSubmit)

        var allFilled = false


        if(fName.text.toString().trim().isNullOrEmpty() &&
            lName.text.toString().trim().isNullOrEmpty() &&
            dob.text.toString().trim().isNullOrEmpty() &&
            email.text.toString().trim().isNullOrEmpty() &&
            password.text.toString().trim().isNullOrEmpty() &&
            phone.text.toString().trim().isNullOrEmpty() &&
            confirmpass.text.toString().trim().isNullOrEmpty() &&
            password.text.toString().trim().isNullOrEmpty()
        ){}
        else{
            Log.d("mydebug", "hello")
            allFilled = true
            btnsubmit.setBackgroundColor(Color.CYAN)
        }


        if(allFilled) {
            Log.d("mydebug", "hello")
        }
        btnsubmit.setOnClickListener(){ view->
            if(allFilled){
                Toast.makeText(this@SignUpPage,"Your Data is Accepted", Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this@SignUpPage,"Please Complete All The Information", Toast.LENGTH_SHORT).show()
            }
        }


    }
}