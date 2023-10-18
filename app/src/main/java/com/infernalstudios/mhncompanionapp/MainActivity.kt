package com.infernalstudios.mhncompanionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navigationButton_ = findViewById<Button>(R.id.navigationButton_)

        navigationButton_.setOnClickListener {
            val intent = Intent(this, TestButton::class.java)
            startActivity(intent)
        }
    }
}