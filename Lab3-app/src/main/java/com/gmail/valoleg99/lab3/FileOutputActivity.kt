package com.gmail.valoleg99.lab3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_file_output.*


class FileOutputActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_file_output)
        val text = intent.getStringExtra("text")
        val filename = intent.getStringExtra("filename")
        GoBackSetup()
        SetOutputTextSetup(text, filename)
    }

    fun SetOutputTextSetup(text: String, filename: String){
        outputTextView.text = "В файле ${filename}.txt хранится запись: ${text}"
    }

    fun GoBackSetup(){
        backButton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}