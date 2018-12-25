package Nauka.Kolekcje.List;

public class Ludzie {
    int wiek;
    String imie;

    public Ludzie(int wike, String imie) {
        this.wiek = wike;
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public String getImie() {
        return imie;
    }

    @Override
    public String toString() {
        return "Ludzie{" +
                "wiek=" + wiek +
                ", imie='" + imie + '\'' +
                '}';
    }
}
