package org.example.lesson1;

public class Club {
    String clubb;
    int quantityPeople;
    String day;

    public Club(String clubb, int quantityPeople, String day) {
        this.clubb = clubb;
        this.quantityPeople = quantityPeople;
        this.day = day;
    }
    String presentClub(){
        return "chto delaut - " + clubb + "\n" +"koli4estvo ludey - "+ quantityPeople + "\n"+"kogda sobirautsa - "+ day + "\n";
    }
}