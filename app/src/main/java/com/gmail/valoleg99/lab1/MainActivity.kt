package com.gmail.valoleg99.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var okBtn: Button
    private lateinit var cancelBtn: Button
    private lateinit var spnr: Spinner
    private lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setup()
        setTextOnClick()
        cleanTextOnClick()
    }

    private fun setup(){
        okBtn = findViewById(R.id.okButton)
        cancelBtn = findViewById(R.id.cancelButton)
        spnr = findViewById(R.id.spinner)
        result = findViewById(R.id.resultLabel)
    }


    private fun setTextOnClick() {
        okBtn.setOnClickListener { result.text = spnr.selectedItem.toString() }
    }

    private fun cleanTextOnClick() {
        cancelBtn.setOnClickListener { result.text = null }
    }
}
