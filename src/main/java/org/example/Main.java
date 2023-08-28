package org.example;

import org.example.interfaces.Barker;
import org.example.interfaces.Cancer;
import org.example.interfaces.Dog;
import org.example.interfaces.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Cancer> cancers = List.of(
//                new Cancer("a"),
//                new Cancer("b"),
//                new Cancer("c")
//        );
//        List<Cancer> cancers = new ArrayList<>();
//
//        cancers.add(new Cancer("a"));
//        cancers.add(new Cancer("b"));
//        cancers.add(new Cancer("c"));
//
//        System.out.println(cancers.get(0));
//
//        System.out.println(cancers);


//        for (int i = 0; i < cancers.size(); i++) {
//
//        }

        Cancer igoryanya = new Cancer("Igor");

        System.out.println(igoryanya);
        System.out.println(igoryanya.getClass());

//        Dog sobaka = new Dog("Sobaka");
//        Teacher masya = new Teacher("Mastya");
//
//        List<Barker> barkers = List.of(igoryanya, sobaka, masya);
//        for (Barker barker : barkers) {
//            barker.bark();
//        }
    }
}