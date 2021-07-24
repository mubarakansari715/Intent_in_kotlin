package com.example.intent_in_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val tv_email=findViewById<TextView>(R.id.tv_email)
        val tv_pass=findViewById<TextView>(R.id.tv_password)
        val tv_number=findViewById<TextView>(R.id.tv_number)

        val bundle: Bundle? = intent.extras
        val email = bundle?.get("email")
        val pass = bundle?.get("password")
        val number = bundle?.get("number")

        tv_email.setText(email.toString())
        tv_number.setText(pass.toString())
        tv_pass.setText(number.toString())
        Toast.makeText(applicationContext,""+email,Toast.LENGTH_LONG).show()
    }
}