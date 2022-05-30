package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)

        var counter = 0
        textView.setText("Der button wurde $counter mal gedrückt")
        button.setOnClickListener{
            counter++
            textView.setText("Der button wurde $counter mal gedrückt")

        }
    }
}