package com.example.lokesh_raj.counterapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt = findViewById<TextView>(R.id.countDisplay) as TextView
        val btn1 = findViewById<Button>(R.id.addButton) as Button
        val btn2 = findViewById<Button>(R.id.minusButton) as Button
        val btn3 = findViewById<Button>(R.id.resetButton) as Button
        btn1.setOnClickListener{
            counter++
            txt.text=counter.toString()
        }

        btn2.setOnClickListener{
            if (counter>0)
                counter--
            txt.text=counter.toString()
        }

        btn3.setOnClickListener{
            counter=0
            txt.text=counter.toString()
        }
    }
}
