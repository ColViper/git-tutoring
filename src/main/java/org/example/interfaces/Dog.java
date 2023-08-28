package org.example.interfaces;

import java.util.Random;

public class Dog implements Barker{
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void bark() {
        int barkNumber = new Random().nextInt();
        System.out.println(name + "-- barks " + barkNumber + " times");
    }
}
