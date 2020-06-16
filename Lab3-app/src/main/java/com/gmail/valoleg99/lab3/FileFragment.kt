package com.gmail.valoleg99.lab3

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_file.*
import java.io.File


class FileFragment : Fragment() {

    var currentTextResult = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_file, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        writeToFileSetup()
        openFileSetup()
    }

    fun setCurrentResult(result: String){
        currentTextResult = result
    }

    fun writeToFileSetup(){
        saveButton.setOnClickListener{
            if(!fileName.text.toString().trim().equals(""))
            {
                if(!currentTextResult.equals("") && !currentTextResult.equals(getString(R.string.nothing_selected)))
                {
                    context!!.openFileOutput(fileName.text.toString(), Context.MODE_PRIVATE).use {
                        it.write(currentTextResult.toByteArray())
                    }

                    resultFileFragmentText.text = "Результат записан в файл ${fileName.text.toString()}.txt"
                }
                else{
                    resultFileFragmentText.text = "Нечего сохранять"
                }
            }
            else
            {
                resultFileFragmentText.text = "Сначала введи имя файла"
            }
        }
    }

    fun openFileSetup(){
        openButton.setOnClickListener{
            if(!fileName.text.toString().trim().equals(""))
            {
                // data/user/0/com.example.lab3_kotlin/files/321.txt
                val file = File(context!!.filesDir, fileName.text.toString())
                var fileExists = file.exists()
                if(fileExists){
                    val contents = file.readText() // Read file

                    val intent = Intent(this.context, FileOutputActivity::class.java)
                    intent.putExtra("text",contents)
                    intent.putExtra("filename",fileName.text.toString())
                    startActivity(intent)
                }
                else{
                    resultFileFragmentText.text = "Файл не найден"
                }
            }
            else{
                resultFileFragmentText.text = "Введи имя файла, чтобы открыть"
            }
        }

    }

}