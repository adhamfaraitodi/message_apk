package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun kirimPesan (view: View) {
        val editText = findViewById<EditText>(R.id.editText)
        val pesan = editText.text.toString()
        val toast = Toast.makeText(applicationContext, pesan, Toast.LENGTH_SHORT)
        toast.show()
    }
}