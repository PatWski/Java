package Nauka.KlasaAnonimowa;

public class KlasaAnonimowa {
    public static void main(String[] args) {
//nie mozna wywolac z klasy zewnetrznej zmiennych z klasy anonimowych
//mozna wywolac na rzecz klasy anonimowe zmienne deklarowane globlanie publicznie oraz statycznie
// nie mozna wywolac na rzecz klasy anonimowej zmiennej deklarowaną globalnie prywatnie

        //klasa anonimowa
        Interfejs interfejs = new Interfejs() {
            @Override
            public void tekst(String str) {
                System.out.println(str);
            }
        };

        interfejs.tekst("klasa anonimowa");
    }
}
