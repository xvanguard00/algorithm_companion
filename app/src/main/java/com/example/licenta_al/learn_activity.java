package com.example.licenta_al;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class learn_activity extends AppCompatActivity implements View.OnClickListener {

    Button bubblesortButton, quicksortButton, insertionsortButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        bubblesortButton = findViewById(R.id.bubblesort_button);
        quicksortButton = findViewById(R.id.quicksort_button);
        insertionsortButton = findViewById(R.id.insertionsort_button);
        bubblesortButton.setOnClickListener(this);
        quicksortButton.setOnClickListener(this);
        insertionsortButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        int id = view.getId();

        if (id == R.id.bubblesort_button) {
            setContentView(R.layout.activity_bubblesort);
        } else if (id == R.id.quicksort_button) {
            setContentView(R.layout.activity_quicksort);
        } else if (id == R.id.insertionsort_button) {
            setContentView(R.layout.activity_insertionsort);
        }

    }
}