package com.gmail.valoleg99.lab4

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import com.gmail.valoleg99.lab4.R
import kotlinx.android.synthetic.main.activity_video.*

var url =
    "https://ia803002.us.archive.org/5/items/linkinparkintheend_201907/Linkin_Park_-_In_The_End_Official_Music_Video-1yw1Tgj9-VU.mp4"

class VideoActivity : AppCompatActivity() {

    lateinit var videoController: MediaController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        videoController = MediaController(this)
        setupMedia()
    }

    private fun setupMedia() {
        videoView.setMediaController(videoController)
        videoView.setVideoPath(url)
        videoView.start()
    }
}