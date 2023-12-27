package com.example.convertingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private  val inchValue = 2.54
    private lateinit var enterInches: EditText
    private  lateinit var convertButton: Button
    private lateinit var textViewCentimeter: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        enterInches = findViewById(R.id.editTextInches)
        convertButton = findViewById(R.id.buttonConvert)
        textViewCentimeter = findViewById(R.id.textViewCovert)

        convertButton.setOnClickListener {
            if(!enterInches.text.toString().isEmpty()){
                val result = enterInches.text.toString().toDouble() * inchValue
                textViewCentimeter.text = result.toString()
            }else{
                textViewCentimeter.text = getString(R.string.text)
            }
        }
    }
}