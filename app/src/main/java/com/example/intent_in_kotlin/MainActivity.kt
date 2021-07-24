package com.example.intent_in_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText_email =findViewById<EditText>(R.id.edt_email)
        val editText_password =findViewById<EditText>(R.id.edt_password)
        val editText_number=findViewById<EditText>(R.id.edt_number)
        val btn_submit =findViewById<Button>(R.id.btn_submit)
        val btn_explivit = findViewById<Button>(R.id.btn_explicit_example)

        btn_submit.setOnClickListener(){
            val email = editText_email.text.toString()
            val password = editText_password.text.toString()
            val number = editText_number.text.toString()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("email",email)
            intent.putExtra("password",password)
            intent.putExtra("number",number)
            startActivity(intent) }

        btn_explivit.setOnClickListener(){
            intent = Intent(this,ThirdActivity::class.java)
            startActivity(intent)
        }

    }

}