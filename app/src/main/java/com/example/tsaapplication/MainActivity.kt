package com.example.tsaapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    private lateinit var tapHereButton: Button
    private lateinit var leftArrow: ImageButton
    private lateinit var rightArrow: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tapHereButton = findViewById(R.id.tap_here_button)
        leftArrow = findViewById(R.id.left_arrow)
        rightArrow = findViewById(R.id.right_arrow)

        tapHereButton.setOnClickListener {
            showRandomArrow()
        } // Call function when button is clicked

        leftArrow.setOnClickListener {
            reset() // Function clicks to hide left arrow.
        }

        rightArrow.setOnClickListener {
            reset() // Function listens to hide right arrow.
        }

    }

    private fun reset() {
        leftArrow.visibility = View.INVISIBLE
        rightArrow.visibility = View.INVISIBLE
        tapHereButton.visibility = View.VISIBLE // Shows button only when tab
    }

    // Function is to hide tap here button and shows left or right arrow.
    private fun showRandomArrow() {
        tapHereButton.visibility = View.INVISIBLE
        val direction = listOf("left", "right").random()
        if (direction == "left") {
            leftArrow.visibility = View.VISIBLE
        } else {
            rightArrow.visibility = View.VISIBLE
        }
    }

    override fun onPause() {
        super.onPause()
        Log.i("Main Activity", "The Activity is paused")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Main Activity", "The Activity is resumed")
    }

}



