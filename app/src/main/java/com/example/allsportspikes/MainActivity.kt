package com.example.allsportspikes

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val welcome_text = TextView(this)
        welcome_text.textSize = 20f
        welcome_text.text = "Bienvenido a AllSports!"
        setContentView(R.layout.activity_main)
        main_layout.addView(welcome_text)
    }

    fun toastMe(view: View){
        val myToast = Toast.makeText(this,"Comprá papel!", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe(view: View){
        val showCountTextView = findViewById<TextView>(R.id.textView)
        val countString = showCountTextView.text.toString()
        var count: Int = 0
        var isStart: Boolean = countString.equals("Soy un número")
        if(!isStart){
            count = Integer.parseInt(countString)
            count++
        }
        showCountTextView.text = count.toString()
    }
}
