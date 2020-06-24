package com.gmail.valoleg99.lab4


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gmail.valoleg99.lab4.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupListeners()
    }

    private fun setupListeners() {
        videoButton.setOnClickListener {
            val intent = Intent(this, VideoActivity::class.java)
            startActivity(intent)
        }
        audioButton.setOnClickListener {
            val intent = Intent(this, AudioActivity::class.java)
            startActivity(intent)
        }
    }

}