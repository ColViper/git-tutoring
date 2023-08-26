package org.example.lesson1;

public class Pupil {
    String name;
    String secondName;
    int age;
    String features;

    public Pupil(String name, String secondName, int age, String features) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.features = features;
    }

    String presentPupil(){
        return "имя - " + name + "\n" + "familiya - " + secondName + "\n" + "vozrast - " + age + "\n" + "osobenosti - " + features;
    }
}