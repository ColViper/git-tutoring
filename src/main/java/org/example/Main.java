package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AirStripe odess;
        odess = new AirStripe(2800);
        AirStripe nyw;
        nyw = new AirStripe(4442);

        // Кафешки
        // todo: сделай так, что Love Is Coffee, Tour De France cafe Odesa & Aroma Kava бьіли разньіми об'єктами
        Cafe ods;
        ods = new Cafe("Love is Coffee, Tour de France cafe Odessa и конечно же Aroma Kava");
        Cafe ny;
        ny = new Cafe("Starbuck, Jean-Georges Vongerichten и так же самое известное из них Lisbon Cafe Lounge");

// Аэропорт
        Airport odesaAirport = new Airport("Odessa International Airport", 1961, 1000, new AirStripe[] {odess, nyw}, new Cafe[]{ods, });
        Airport newYorkAirport = new Airport("John F. Kennedy International Airport", 1948, 35000, new AirStripe[]{nyw}, new Cafe[]{ny});
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

        System.out.println(Arrays.toString(odesaAirport.presentAirStripes()));
        System.out.println(Arrays.toString(odesaAirport.presentCafes()));


//        System.out.println("1 - " + "Аэропорты");
//        System.out.println(airportOd.presentAirport());
//        System.out.println(newyork.presentAirport());
//        System.out.println("2 - " + "Самолёты");
//        System.out.println(boeingsem.presentPlanes());
//        System.out.println(andva.presentPlanes());
//        System.out.println("3 - " + "Рейсы");
//        System.out.println(molcan.presentReysi());
//        System.out.println(ukrbel.presentReysi());
//        System.out.println("4 - " + "Туалеты");
//        System.out.println(muj.presentToilets());
//        System.out.println(jen.presentToilets());
//        System.out.println("5 - " + "Кафешки");
//        System.out.println(ods.presentCafes());
//        System.out.println(ny.presentCafes());
//        System.out.println("6 - " + "Террористы");
//        System.out.println(odes.presentTudasuda());
//        System.out.println(newy.presentTudasuda() + " (Ну вы конечно знаете парочку из них) ");
//        System.out.println("7 - " + "Пилоты");
//        System.out.println(olej.presentPilots() + " года");
//        System.out.println(mish.presentPilots()+ " года ");
//        System.out.println("8 - " + "Взлётные полосы");
//        System.out.println(nyw.presentPolosi());
//        System.out.println(odess.presentPolosu());


    }
}
