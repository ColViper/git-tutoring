package org.example;

import java.util.Arrays;

public class Fridge {

    String[] storedItems;

    public Fridge(String[] storedItems) {
        this.storedItems = storedItems;
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "storedItems=" + Arrays.toString(storedItems) +
                '}';
    }
}
