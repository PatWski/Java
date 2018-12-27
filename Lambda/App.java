package Nauka.Lambda;

public class App {
    public static void main(String[] args) {
//        InterfejsFunkcyjny drukuj = (t -> System.out.println(t));
        // t - przejecie parametru z interfejsu
        // -> implementacja metody
       Metoda2 metoda2 = new Metoda2();
       wyswietlenie(metoda2::wyswietlTeskt2); //??

    }

    public static void wyswietlenie(InterfejsFunkcyjny drukuj) {
        drukuj.wyswietlTeskt("Tekst");
    }

}
