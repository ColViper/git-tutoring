package org.example.lesson1;

public class CleaningWoman {
    String name;
    String secondName;
    int age;

    public CleaningWoman(String name, String secondName, int age) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
    }
    String presentCleaningWoman(){
        return "Imya - " + name + "\n" +"Familiya - "+ secondName + "\n"+"etazh - "+ age + "\n" ;
    }
}