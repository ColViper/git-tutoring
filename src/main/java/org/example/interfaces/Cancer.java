package org.example.interfaces;

import java.util.Random;

public class Cancer extends Object implements Barker {
    String name;

    public Cancer(String name) {
        this.name = name;
    }


    @Override
    public void bark() {
        int barkNumber = new Random().nextInt();
        System.out.println(name + "-- barks " + barkNumber + " times");
    }

    @Override
    public String toString() {
        return "Cancer{" +
                "name='" + name + '\'' +
                '}';
    }
}
