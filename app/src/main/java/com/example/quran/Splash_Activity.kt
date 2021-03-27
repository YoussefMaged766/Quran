package com.example.quran

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity


class Splash_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_)


        Handler().postDelayed({
            val intent = Intent(this@Splash_Activity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}