package org.example;

public class Airports{
     String name;
     int built;
     int workers;

    public Airports(String name, int built, int workers) {
        this.name = name;
        this.built = built;
        this.workers = workers;
    }

    String presentAeroport(){
        return name + " " + "был построен в " + built + " " + "и там работают " + workers + " человек";
    }
}