package org.example.lesson1;

public class Porter {
    String name;
    String secondName;
    String stage;

    public Porter(String name, String secondName, String stage) {
        this.name = name;
        this.secondName = secondName;
        this.stage = stage;
    }

    String presentPorter(){
        return "Imya - " + name + "\n" +"Familiya - "+ secondName + "\n"+"etazh - "+ stage + "\n";
    }
}