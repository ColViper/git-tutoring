package org.example.interfaces;

import java.util.Random;

public class Teacher implements Barker {

    String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void bark() {
        int barkNumber = new Random().nextInt();
        System.out.println(name + "-- barks " + barkNumber + " times");
    }
}
