package org.example;

public class Tudasuda {

    String aeroportik;
    int god;
    int quantity;

    public Tudasuda(String aeroportik, int god, int quantity) {
        this.aeroportik = aeroportik;
        this.god = god;
        this.quantity = quantity;
    }

    String presentTudasuda(){
        return "Через " + aeroportik + " аэропорт пролетело примерно " + quantity + " террориста в " + god + " году";
    }
}
