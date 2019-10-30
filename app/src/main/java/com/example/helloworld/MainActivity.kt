package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //onCreate = main()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //create the UI
        //R = resources
        setContentView(R.layout.activity_main)
        //TODO continue your work here
        //val = value, var = variable
        //Java int x;
        //Kotlin val x : Int;

        val buttonPressMe : Button = findViewById(R.id.buttonPressMe)
        buttonPressMe.setOnClickListener { showMessage() }

        val buttonReset : Button = findViewById(R.id.buttonReset)
        buttonReset.setOnClickListener { showResetMessage() }

    }

    private fun showMessage(){
        val textViewMessage : TextView = findViewById(R.id.textViewMessage)
        textViewMessage.setText(getString(R.string.greeting))
    }

    private fun showResetMessage(){
        val textViewMessage2 : TextView = findViewById(R.id.textViewMessage)
        textViewMessage2.setText(getString(R.string.app_name))
    }
}
