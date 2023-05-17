package com.example.aula01

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt1 = findViewById<EditText>(R.id.txt1)
        val btn1 = findViewById<Button>(R.id.btn1)

        btn1.setOnClickListener{
            Toast.makeText(applicationContext,txt1.text,Toast.LENGTH_SHORT).show()
        }
    }
}




















