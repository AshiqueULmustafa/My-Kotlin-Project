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
        val Dob = findViewById<EditText>(R.id.etDOB)
        val Email = findViewById<EditText>(R.id.etEmail)
        val Password = findViewById<EditText>(R.id.etPass)
        val Phone = findViewById<EditText>(R.id.etPhone)
        val Confirmpass = findViewById<EditText>(R.id.etCpass)
        val btnsubmit : Button = findViewById(R.id.btnSubmit)



        /*if(isAnyFieldEmpty){

        }
        else{
            Log.d("mydebug", "no null")
            btnsubmit.setBackgroundColor(Color.CYAN)
        }*/

        btnsubmit.setOnClickListener(){ view->
            val fname = fName.text.toString().trim()
            val lname = lName.text.toString().trim()
            val dob =  Dob.text.toString().trim()
            val email = Email.text.toString().trim()
            val password = Password.text.toString().trim()
            val phone = Phone.text.toString().trim()
            val confirmpass = Confirmpass.text.toString().trim()

            val field = listOf(fname,lname,dob,email,password,confirmpass)
            val isAnyFieldEmpty : Boolean = field.any{it.isNullOrEmpty()}

            if(isAnyFieldEmpty
                ){
                Toast.makeText(this@SignUpPage,"Please Complete All The Information", Toast.LENGTH_SHORT).show()
            }
            else{
                btnsubmit.setBackgroundColor(Color.CYAN)
                Toast.makeText(this@SignUpPage,"Your Data is Accepted", Toast.LENGTH_LONG).show()

            }
        }


    }
}