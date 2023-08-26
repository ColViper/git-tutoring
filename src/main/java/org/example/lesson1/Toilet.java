package org.example.lesson1;

public class Toilet {
    int stage;
    int holes;
    int quantityToilets;

    public Toilet(int stage, int holes, int quantityToilets) {
        this.stage = stage;
        this.holes = holes;
        this.quantityToilets = quantityToilets;
    }
    String presentToilet(){
        return "etazh - " + stage + "\n" +"koli4estvo dyrok - "+ holes + "\n"+"skoka unitaz - "+ quantityToilets + "\n";
    }
}