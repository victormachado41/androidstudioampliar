package com.example.calc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val value1 = findViewById<EditText>(R.id.edtx1)
        val value2 = findViewById<EditText>(R.id.edtx2)
        val result = findViewById<TextView>(R.id.edtx3)

        val sum = findViewById<Button>(R.id.btn1)
        val subtract = findViewById<Button>(R.id.btn2)
        val multiply = findViewById<Button>(R.id.btn3)
        val divide = findViewById<Button>(R.id.btn4)

        sum.setOnClickListener {
            val s1 = value1.text.toString().toDouble()
            val s2 = value2.text.toString().toDouble()
            val newSum: Double = s1 + s2

            result.text = newSum.toString()
        }

        subtract.setOnClickListener {
            val m1 = value1.text.toString().toDouble()
            val m2 = value2.text.toString().toDouble()
            val newSub = m1 - m2

            result.text = newSub.toString()
        }

        multiply.setOnClickListener {
            val x1 = value1.text.toString().toDouble()
            val x2 = value2.text.toString().toDouble()
            val newMult = x1 * x2

            result.text = newMult.toString()
        }

        divide.setOnClickListener {
            val d1 = value1.text.toString().toDouble()
            val d2 = value2.text.toString().toDouble()
            val newDvd = d1 / d2

            if(d2 == 0.0){
                Toast.makeText(applicationContext,"Error. Division by 0.",Toast.LENGTH_SHORT).show()
            }
                else
            if(d1 == 0.0 && d2 == 0.0){
                Toast.makeText(applicationContext,"Error. You're dividing 0 by 0.",Toast.LENGTH_SHORT).show()
            }

            result.text = newDvd.toString()
        }
    }
}