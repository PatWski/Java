package Nauka.Interfejsy;

public class Kia implements Car,Price {

    public int cena() {
        return 0;
    }

    @Override
    public void drive() {
        System.out.println("Kia Optima...");
    }
}
