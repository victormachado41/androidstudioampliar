package com.example.grocerylist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val c1 = findViewById<CheckBox>(R.id.chkb1)
        val c2 = findViewById<CheckBox>(R.id.chkb2)
        val c3 = findViewById<CheckBox>(R.id.chkb3)
        val b1 = findViewById<Button>(R.id.btn1)
        var total = 0.00

        b1.setOnClickListener {
            if(c1.isChecked){total+=8.00}
            if(c2.isChecked){total+=7.00}
            if(c3.isChecked){total+=10.00}
                Toast.makeText(applicationContext,"Sua compra custará R$ $total.",Toast.LENGTH_SHORT).show()
                total = 0.00
            }
        }
    }

