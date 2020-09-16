package com.example.loc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var greetingTextView: TextView
    var name = "David"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        greetingTextView.findViewById<TextView>(R.id.textView)

    }



    fun button_pressed(view: View){
        greetingTextView.text = getString(R.string.great, name) //Den skriver ut angivna strängen i strings.xml plus variablen namnet namn
    }

    //På engelska vill vi att det skall stå - Great David!
    //På svenska vill vi att det skall stå - Bra jobbat David!!!

}



//Anpassa appen till svenska och engelska.
//1. anpassa xml - layout        x
//2. anpassa vår kotlin fil      x
//3. anpassa bilder