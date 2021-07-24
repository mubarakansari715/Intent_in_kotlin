package com.example.intent_in_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val myWebView: WebView = findViewById(R.id.webview)
        myWebView.loadUrl("https://www.google.com/")
    }
}