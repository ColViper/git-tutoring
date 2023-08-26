package org.example;

public class Airport {
    String name;
    int built;
    int workers;
    AirStripe[] airStripes;
    Cafe[] cafees;

    public Airport(String name, int built, int workers, AirStripe[] airStripes, Cafe[] cafes) {
        this.name = name;
        this.built = built;
        this.workers = workers;
        this.airStripes = airStripes;
        this.cafees = cafes;
    }

    String presentAirport() {
        return name + " " + "был построен в " + built + " " + "и там работают " + workers + " человек";
    }

    String[] presentAirStripes() {
        String[] result = new String[airStripes.length];

        for (int i = 0; i < airStripes.length; i++) {
            result[i] = presentAirStripe(airStripes[i]);
        }

        return result;
    }

    String[] presentCafes() {
        String[] result = new String[cafees.length];

        for (int i = 0; i < cafees.length; i++) {
            result[i] = presentCafe(cafees[i]);
        }

        return result;
    }

    String presentAirStripe(AirStripe airStripe) {
         return "В аэропорту " + this.name + " есть взлётная полоса и она длиной в " + airStripe.dlina + " метра";
    }

    String presentCafe(Cafe cafe){
        return "В аэропорту " + this.name + " есть кафе " + cafe.name;
    }
}