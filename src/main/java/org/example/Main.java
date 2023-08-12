package org.example;

public class Main {
    public static void main(String[] args) {
// Аэропорт
        Airports airportOd;
        airportOd = new Airports("Odessa International Airport", 1961, 1000);
        Airports newyork;
        newyork = new Airports("John F. Kennedy International Airport",1948,35000);
// Самолёты
        Planes boeingsem;
        boeingsem = new Planes("Boeing 757-200",1982,65000000,200);
        Planes andva;
        andva = new Planes("An-225 Mriya",1989,460000000,475);
// Рейсы
        Reysi molcan;
        molcan = new Reysi("Молдовы","Канаду",2734);
        Reysi ukrbel;
        ukrbel = new Reysi("Украины","Бельгию",2043);
// Туалеты
        Toilets muj;
        muj = new Toilets("мужском",12,2);
        Toilets jen;
        jen = new Toilets("женском",20,6);
// Кафешки
        Cafes ods;
        ods = new Cafes("Одесском",4,"Love is Coffee, Tour de France cafe Odessa и конечно же Aroma Kava");
        Cafes ny;
        ny = new Cafes("Нью-йоркском", 43,"Starbuck, Jean-Georges Vongerichten и так же самое известное из них Lisbon Cafe Lounge");
// Теры
        Tudasuda odes;
        odes = new Tudasuda("Одесский", 2002,52);
        Tudasuda newy;
        newy = new Tudasuda("Нью-йоркский", 2001,1003);
// Пилоты
        Pilots olej;
        olej = new Pilots("Барселона","Олег","Нечипоренко",34,4);
        Pilots mish;
        mish = new Pilots("Одесса","Михаил","Чекмарёв",55,23);
// Полосы
        Polosi nyw;
        nyw = new Polosi("Нью-Йорка",4,4442);
        Polosi odess;
        odess = new Polosi("Одессы",1,2800);



        System.out.println("1 - " + "Аэропорты");
        System.out.println(airportOd.presentAeroport());
        System.out.println(newyork.presentAeroport());
        System.out.println("2 - " + "Самолёты");
        System.out.println(boeingsem.presentPlanes());
        System.out.println(andva.presentPlanes());
        System.out.println("3 - " + "Рейсы");
        System.out.println(molcan.presentReysi());
        System.out.println(ukrbel.presentReysi());
        System.out.println("4 - " + "Туалеты");
        System.out.println(muj.presentToilets());
        System.out.println(jen.presentToilets());
        System.out.println("5 - " + "Кафешки");
        System.out.println(ods.presentCafes());
        System.out.println(ny.presentCafes());
        System.out.println("6 - " + "Террористы");
        System.out.println(odes.presentTudasuda());
        System.out.println(newy.presentTudasuda() + " (Ну вы конечно знаете парочку из них) ");
        System.out.println("7 - " + "Пилоты");
        System.out.println(olej.presentPilots() + " года");
        System.out.println(mish.presentPilots()+ " года ");
        System.out.println("8 - " + "Взлётные полосы");
        System.out.println(nyw.presentPolosi());
        System.out.println(odess.presentPolosu());


    }
}
