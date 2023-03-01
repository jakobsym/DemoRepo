package edu.utsa.android.nrz473_lab3.model;

public abstract class Person {
    private String name;
    private String weight;
    private String height;

    public Person(String n, String w, String h){
        this.name = n;
        this.weight = w;
        this.height = h;
    }

    public Person(){

    }

    // Getters
    public String getName(){
        return this.name;
    }

    public String getWeight(){
        return this.weight;
    }

    public String getHeight(){
        return this.height;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }
    public void setHeight(String height){
        this.height = height;
    }
    public void setWeight(String weight){
        this.weight = weight;
    }


}
