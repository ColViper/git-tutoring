package org.example;

public class CoffeeMachine {

    String brand;
    int maximumCoffeeAmountInKilograms;

    public CoffeeMachine(String brand, int maximumCoffeeAmountInKilograms) {
        this.brand = brand;
        this.maximumCoffeeAmountInKilograms = maximumCoffeeAmountInKilograms;
    }

    @Override
    public String toString() {
        return "CoffeeMachine{" +
                "brand='" + brand + '\'' +
                ", maximumCoffeeAmountInKilograms=" + maximumCoffeeAmountInKilograms +
                '}';
    }
}
