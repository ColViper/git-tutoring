package org.example;

public class Reysi{

    String otkuda;
    String kuda;
    int price;

    public Reysi(String otkuda, String kuda, int price) {
        this.otkuda = otkuda;
        this.kuda = kuda;
        this.price = price;
    }

    String presentReysi(){
        return "Горящая путевка из " + otkuda + " в " + kuda + " всего за " + price + " еврейских шекелей";
    }
}
