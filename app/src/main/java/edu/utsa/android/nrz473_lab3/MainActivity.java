package edu.utsa.android.nrz473_lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import edu.utsa.android.nrz473_lab3.controller.AvengersController;

public class MainActivity extends AppCompatActivity {

    private AvengersController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controller = new AvengersController(this, getAssets());
        setupButton(R.id.button3);
        setupButton(R.id.button4);
        setupButton(R.id.button5);
        setupButton(R.id.button6);
        setupButton(R.id.button7);
        setupButton(R.id.button8);

    }

    private void setupButton(int buttonID){
        Button button = findViewById(buttonID);
        button.setOnClickListener(controller);
    }
}