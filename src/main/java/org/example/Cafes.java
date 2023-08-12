package org.example;

public class Cafes {
    String gde;
    int quantity;
    String name;

    public Cafes(String gde,int quantity, String name) {
        this.gde = gde;
        this.quantity = quantity;
        this.name = name;
    }

    String presentCafes(){
        return "В " + gde + " аэропорту находится " + quantity + " кафейни" + ", там есть такие амбассадоры как " + name;
    }
}
