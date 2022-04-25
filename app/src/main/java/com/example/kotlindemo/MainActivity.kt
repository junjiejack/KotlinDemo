package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import com.example.kotlindemo.view.CameraImageView

class MainActivity : AppCompatActivity() {

    private lateinit var cameraImageView : CameraImageView

    private lateinit var tvProgress : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cameraImageView = findViewById(R.id.civ)
        tvProgress = findViewById(R.id.tv_progress)
        findViewById<SeekBar>(R.id.btn_progress).setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                cameraImageView.setProgress(p1)
                tvProgress.text = "$p1"
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }

        })
    }
}