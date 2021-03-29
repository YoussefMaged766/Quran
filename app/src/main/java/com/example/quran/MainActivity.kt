package com.example.quran

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        click()

    }

    private fun click() {
        img_radio.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.Frame_fragment, Radio_Fragment()).commit()

        }
        img_read.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.Frame_fragment, Read_Freagment()).commit()

        }
    }

}