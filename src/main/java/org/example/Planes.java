package org.example;

public class Planes {

    String nazvanie;
    int ff;
    int price;
    int space;

    public Planes(String nazvanie, int ff, int price, int space) {
        this.nazvanie = nazvanie;
        this.ff = ff;
        this.price = price;
        this.space = space;
    }

    String presentPlanes(){
        return "Самолет " + nazvanie + " " + "был впервые запущен в " + ff + ", стоимость данного экземляра составляет " + price + " и вмещает в себя " + space + " человек";
    }
}