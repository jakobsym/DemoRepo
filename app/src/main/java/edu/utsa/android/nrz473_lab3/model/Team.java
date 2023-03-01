package edu.utsa.android.nrz473_lab3.model;

import android.content.res.AssetManager;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

/* A Team will have:
    - An ArrayList of Avenger objects
    - A loadAvengers(..) method which reads in the Avengers info from the data.csv file
    - A getAvenger(..) method which takes in a String alias of an Avenger and returns the Avenger object.
*  */
//
public class Team {
    private ArrayList<Avenger> avengers;

    public Team(){

    }
    // TODO: Implement loadAvengers() and getAvengers()
    public void loadAvengers(AssetManager manager){

        Scanner scan = null;
        InputStream file;


        if( avengers == null ){
            avengers = new ArrayList<Avenger>();
        }

        try{
            file = manager.open("data.csv");

            String line = "";
            String[] tokens;
            Boolean answer; // Probably do not need
            while(scan.hasNextLine()){
                line = scan.nextLine();
                tokens = line.split(",");

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    // Loop through checking if alias in avengers, if it is we return the string of that avenger alias
    public String getAvenger(String alias){
        for(int i = 0; i < avengers.size(); ++i){
            if(avengers.get(i).getAlias().equals(alias)){
                return avengers.get(i).toString();
            }
        }
        return alias;   // Seems wrong
    }
}
