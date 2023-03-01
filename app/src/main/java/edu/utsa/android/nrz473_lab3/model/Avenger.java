package edu.utsa.android.nrz473_lab3.model;

import androidx.annotation.NonNull;

public class Avenger extends Person {

    private String alias;
    private String curLocation;
    private boolean specialPowers;  // True if yes, False otherwise

    //TODO: Make sure constructor implementation is correct
    public Avenger(String n, String w, String h) {
        super(n, w, h); // Gives Avenger name, weight, and height

    }

    public Avenger(String a, String cLocation, boolean sp){
        this.alias = a;
        this.curLocation = cLocation;
        this.specialPowers = sp;
    }

    public Avenger() {

    }

    // Getters
    public String getAlias(){
        return this.alias;
    }

    public String getCurLocation(){
        return this.curLocation;
    }

    public boolean getSpecialPowers(){
        return this.specialPowers;
    }


    // Setters
    public void setAlias(String name){
        this.alias = name;

    }

    public void setCurLocation(String location){
        this.curLocation = location;
    }

    public void setSpecialPowers(boolean sPowers){
        this.specialPowers = sPowers;
    }

    @NonNull
    public String toString(){
        return this.getCurLocation();
    }
}
