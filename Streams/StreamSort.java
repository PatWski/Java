package Nauka.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.*;

public class StreamSort {

    public static void main(String[] args) {
        List<String> listaImion = Arrays.asList("Sebastian", "Seweryn", "Tomek", "Patryk", "Agnieszka", "Natalia");

        out.println("---------------------------------------------------");
        List<String> filtr = listaImion.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        out.println(filtr);
        out.println("---------------------------------------------------");
        List<String> posortowana = listaImion.stream().sorted().collect(Collectors.toList());
        out.println(posortowana);
        out.println("---------------------------------------------------");

        List<Integer> liczby = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> kwadrat = liczby.stream().map(x -> x * x).collect(Collectors.toList());
        out.println(kwadrat);
        out.println("---------------------------------------------------");
        liczby.stream().forEach(l -> System.out.print(l + " "));
    }
}
