package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)
        val pesan = intent.getStringExtra(PESAN)
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = pesan
        }
    }
}