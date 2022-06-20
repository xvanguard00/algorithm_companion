package com.example.licenta_al

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Learn button to open learn_activity
        val learnButtonClick = findViewById<Button>(R.id.main_learn_button)
        learnButtonClick.setOnClickListener {
            val learnIntent = Intent(this, learn_activity::class.java)
            startActivity(learnIntent)
        }

        //Challenge button to open challenge_activity
        val challengeButtonClick = findViewById<Button>(R.id.main_challenge_button)
        challengeButtonClick.setOnClickListener {
            val challengeIntent = Intent(this, challenge_activity::class.java)
            startActivity(challengeIntent)
        }

        //Exit Button to close app
        val exitButtonClick = findViewById<Button>(R.id.main_exit_button)
        exitButtonClick.setOnClickListener { finishAffinity() }

    }
}




