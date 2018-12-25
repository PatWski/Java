package Nauka.Kolekcje.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Piosenki {

    public static void main(String[] args) {

        List<String> listaPiosenek = new ArrayList<String>();
        listaPiosenek.add("Jolka Jolka");
        listaPiosenek.add("Get rich or die Trying");
        listaPiosenek.add("Takie tango");
        listaPiosenek.add("ABC");
        System.out.println(listaPiosenek);
        System.out.println("--------------------");
        listaPiosenek.sort(String::compareTo);
        System.out.println(listaPiosenek);
        System.out.println("Rozmiar listy to: " + listaPiosenek.size());
        listaPiosenek.add(4, "Demony wojny");
        System.out.println(listaPiosenek);
        for (String lista : listaPiosenek) {
            System.out.println(lista);
        }
        System.out.println("--------------------");
        Collections.reverse(listaPiosenek);
        System.out.println(listaPiosenek);

    }
}
