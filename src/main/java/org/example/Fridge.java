package org.example;

import java.util.Arrays;

public class Fridge {

    String[] storedItems;

    public Fridge(String[] storedItems) {
        this.storedItems = storedItems;
    }

    public void printStoredItems() {
        for (int i = 0; i < storedItems.length; i++) {
            System.out.println(storedItems[i]);
        }
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "storedItems=" + Arrays.toString(storedItems) +
                '}';
    }
}
