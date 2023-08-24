package org.example;

public class Coffeeshop {

    String name;
    Fridge fridge;
    CoffeeMachine[] coffeeMachines;
    Employee[] employees;

    public Coffeeshop(String name, Fridge fridge, CoffeeMachine[] coffeeMachines, Employee[] employees) {
        this.name = name;
        this.fridge = fridge;
        this.coffeeMachines = coffeeMachines;
        this.employees = employees;
    }

    public void doShit() {
        System.out.println("Hi! I am a coffee shop " + name);
        System.out.println();
        System.out.println("Here's what's inside the fridge: " + fridge.toString());
        System.out.println("Here are my employees:");

        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            System.out.println("===============================");
            System.out.println("[" + i + "] worker is called: " + employee.name + " " + employee.surname);
            System.out.println("They are " + employee.age + " years old");
            System.out.println("They have worked for " + employee.workExperienceInYears + " years here");
        }
        System.out.println("===============================");
        System.out.println("I also have these coffee machines:");
        for (int i = 0; i < coffeeMachines.length; i++) {
            CoffeeMachine coffeeMachine = coffeeMachines[i];
            System.out.println("[" + i + "] coffee machine is: " + coffeeMachine.brand + ", it can hold " + coffeeMachine.maximumCoffeeAmountInKilograms + " kg of coffee");
        }
    }
}
