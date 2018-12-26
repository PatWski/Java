package Nauka.KlasyWewnetrzne;

public class Zewnetrzna {
    // zeby miec dostep do klas wew. trzeba utworzyc obietk klasy zewnetrznej
    public int a = 1;
    private int b = 2;
    public static int c = 3;
    private static int d = 4;
    Wewnetrzna w = new Wewnetrzna(); // obiekt klasy wewnetrznej

    public void test() {
        System.out.println("Klasa zewnetrzna");
        System.out.println(w.f); // dostep do pol prywatnych klasy wewnetrznej poprzez utworzenie obiktu
        System.out.println(Wewnetrzna.h); //dostep do pol prywatnych statycznych
    }

    class Wewnetrzna {
        //nie moze miec zmiennych statycznych (chyba że finalny)
        //ma dostep do wszystkich pol klasy zewnetrznej nawet prywatnych
        public int e = 5;
        private int f = 6;
        public final static int g = 7;
        private final static int h = 8;

        public void test() {
            System.out.println("Klasa wewnetrzna");
            System.out.println(Zewnetrzna.c); //dostep do zewnetrzego pola staycznego c
            System.out.println(b); //dostep do pola prywatnego b
        }
    }
}
