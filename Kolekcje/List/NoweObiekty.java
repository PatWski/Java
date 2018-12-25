package Nauka.Kolekcje.List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NoweObiekty {

    public static void main(String[] args) {

        List<Ludzie> ludzie = new ArrayList<>();
        ludzie.add(new Ludzie(30, "Stefan"));
        ludzie.add(new Ludzie(25, "Natalia"));
        ludzie.add(new Ludzie(20, "Tomek"));
        ludzie.add(new Ludzie(27, "Dawid"));
//        for (Ludzie l : ludzie){
//            System.out.println(l.toString());     //stara metoda printowania
//        }
//        System.out.println("--------------");
        ludzie.forEach(System.out::println);        //printowanie lambda
        System.out.println("----------------------------");
        ludzie.sort(Comparator.comparingInt(Ludzie::getWiek)); //sortuje wiek
        System.out.println(ludzie);

    }
}