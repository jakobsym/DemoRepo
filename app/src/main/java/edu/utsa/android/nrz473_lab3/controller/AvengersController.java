package edu.utsa.android.nrz473_lab3.controller;

import android.app.Activity;
import android.content.res.AssetManager;
import android.view.View;

import edu.utsa.android.nrz473_lab3.model.Avenger;

public class AvengersController implements View.OnClickListener {

    private Activity activity;
    private Avenger avengers;
    private AssetManager manager;
    private int index;  // Probably do not need


    public AvengersController(Activity activity, AssetManager manager){
        this.activity = activity;
        this.manager = manager;
    }



    @Override
    public void onClick(View view) {
        avengers = new Avenger();

    }
}
