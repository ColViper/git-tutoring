package org.example;

public class Main {

    public static void main(String[] args) {
        Employee vasya = new Employee("Vasya", "Pupkin", 10, 0);
        Employee petya = new Employee("Petya", "Poroshenko", 228, 1488);
        Employee bodya = new Employee("Bodya", "Zhmur", 31, 1);
        Employee[] employees = {vasya, petya, bodya};

        String[] itemsStoredInFridge = {"cheetos", "mtn dew", "pryluki"};
        Fridge fridge = new Fridge(itemsStoredInFridge);

        CoffeeMachine lavazza = new CoffeeMachine("Lavazza", 100);
        CoffeeMachine zaporozhets = new CoffeeMachine("Zaporozhets", 1);
        CoffeeMachine[] coffeeMachinesInAroma = {lavazza, zaporozhets};


        Coffeeshop aromaKava = new Coffeeshop("AromaKava", fridge, coffeeMachinesInAroma, employees);

        aromaKava.doShit();
    }
}
