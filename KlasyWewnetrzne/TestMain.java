package Nauka.KlasyWewnetrzne;

public class TestMain {
    public static void main(String[] args) {
        Zewnetrzna z = new Zewnetrzna(); //utworzenie obiektu klasy zewnetrznej
        Zewnetrzna.Wewnetrzna zw = z.new Wewnetrzna(); //utworzenie obiektu klasy wewnetrznej

        System.out.println(z.a); //dostep do pola publicznego klasy zewnetrznej
        System.out.println(Zewnetrzna.c); // dostep do pola staycznego publicznego klasy zewnetrznej

        System.out.println(Zewnetrzna.Wewnetrzna.g); //dostep do pola statycznego publicznego klasy wewnetrzenj
        System.out.println(zw.e); //dostep do publicznej zmiennej klasy wewnetrznej
        // nie ma dostepu do prywatnych pol klasy wewnetrznejŁ

    }
}
