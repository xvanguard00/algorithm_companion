package com.example.licenta_al

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class learn_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn)


        val bubbleSortButtonClick = findViewById<Button>(R.id.bubblesort_button)
        bubbleSortButtonClick.setOnClickListener {
            val bubblesortIntent = Intent(this, bubblesort_activity::class.java)
            startActivity(bubblesortIntent)
        }

    }
}