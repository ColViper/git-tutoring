package org.example;

public class Pilots {

    String gorod;
    String name;
    String surname;
    int age;

    int staj;

    public Pilots(String gorod,String name, String surname, int age, int staj) {
        this.gorod = gorod;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.staj = staj;
    }

    String presentPilots(){
        return "Пилот " + name + " " + surname + " родился в городе " + gorod + ", на данный момент ему "  + age + ", летает уже " + staj;
    }
}
