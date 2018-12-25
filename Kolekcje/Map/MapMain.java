package Nauka.Kolekcje.Map;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {

        Map<String,String> pary = new HashMap<>();
        pary.put("Tomek","Basia");
        pary.put("Grzesiek","Leokadia");
        pary.put("Sebastian","Natalia");
        System.out.println(pary);
        System.out.println("----------------");
        System.out.println(pary.containsKey("Sebastian"));
        System.out.println("----------------");
        System.out.println(pary.get("Sebastian"));
        System.out.println("----------------");
        System.out.println(pary.values());
        System.out.println(pary.keySet());
        System.out.println("----------------");
        System.out.println(pary.replace("Tomek","Gosia"));
        System.out.println(pary.replace("Sebastian","Natalia","Dominika"));
        System.out.println(pary);
    }
}
