package org.example;

public class Polosi {

    String gde;
    int quantity;
    int dlina;

    public Polosi(String gde, int quantity, int dlina) {
        this.gde = gde;
        this.quantity = quantity;
        this.dlina = dlina;
    }

    String presentPolosu() {
        return "В аэропорту " + gde + " находится " + quantity + " взлётная полоса и она длиной в " + dlina + " метра";
    }



    String presentPolosi() {
        return "В аеропорту " + gde + " находится " + quantity + " взлётных полосы и каждая из них длиной в " + dlina + " метра";
    }
}

