package com.paisalo.sanskritsewaappandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler(Looper.getMainLooper()).postDelayed({
            // Start the next activity here
            startActivity(Intent(this, LoginActivity::class.java))
            finish() // finish the current activity
        }, 3000)
    }
}