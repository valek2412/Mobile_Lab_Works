package com.gmail.valoleg99.lab2


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), MainFragment.OnFragmentInteractionListener {

    override fun onFragmentInteraction(result: String) {
        val fragment = supportFragmentManager.findFragmentById(R.id.resultFragment) as ResultFragment
        if(fragment.isInLayout){
            fragment.setText(result)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}
