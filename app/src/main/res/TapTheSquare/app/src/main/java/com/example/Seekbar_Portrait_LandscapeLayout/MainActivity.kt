package com.example.Seekbar_Portrait_LandscapeLayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import com.example.landscapelayout2.R

class MainActivity : AppCompatActivity() {


    private lateinit var seekBar: SeekBar
    private lateinit var seekBarLabel: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekBar = findViewById(R.id.seek_Bar)
        seekBarLabel = findViewById(R.id.seek_bar_label)

        val initialProgress = seekBar.progress
        updateLabel(initialProgress)

        // TODO add listener up update label as seekbar changes.

        seekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekbarComponent: SeekBar?, progress: Int, fromUser: Boolean) {
              updateLabel(progress)
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {}
            override fun onStopTrackingTouch(p0: SeekBar?) {}
        })

    }

    private fun updateLabel(progress: Int) {
        seekBarLabel.text = getString(R.string.seekbar_value_message, progress)

    }
}