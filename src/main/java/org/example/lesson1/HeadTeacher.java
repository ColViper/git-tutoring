package org.example.lesson1;

public class HeadTeacher {
    String name;
    String secondName;
    int age;
    String lesson;

    public HeadTeacher(String name, String secondName, int age, String lesson) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.lesson = lesson;
    }

    String presentHeadTeacher(){
        return "Imya - " + name + "\n" +"Familiya - "+ secondName + "\n"+"Vozrast - "+ age + "\n" + "zanyatie" + lesson + "\n";
    }
}