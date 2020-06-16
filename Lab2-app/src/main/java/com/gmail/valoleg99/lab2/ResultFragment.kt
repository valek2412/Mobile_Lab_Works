package com.gmail.valoleg99.lab2


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_result.*

class ResultFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    fun setText(result: String){
        if(result.equals(R.string.nothing_selected.toString()))
        {
            resultTextView.setText(R.string.nothing_selected)
        }
        else
        {
            resultTextView.setText(result)
        }
    }


}

