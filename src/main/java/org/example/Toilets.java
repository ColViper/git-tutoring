package org.example;

public class Toilets {
    String gender;
    int space;
    int sinks;

    public Toilets(String gender, int space, int sinks) {
        this.gender = gender;
        this.space = space;
        this.sinks = sinks;
    }

    String presentToilets(){
        return "В " + gender + " туалете могут одновременно писять и срать примерно " + space + " человек" + ", а для помыть руки там есть " + sinks + " раковины";
    }
}
