package org.example.lesson1;

public class Teacher {
    String name;
    String secondName;
    int age;
    String history;

    public Teacher(String name, String secondName, int age, String history) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.history = history;
    }

    String presentTeacher(){
        return "imya - " + name + "\n" + "familiya - " + secondName + "\n"+ "vozr" + age + "\n" + "Dos'e" + history + "\n";
    }
}