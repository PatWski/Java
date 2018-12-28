package Nauka.Interfejsy;

public class BMW implements Car,Price{


    @Override
    public void drive() {
        System.out.println("BMW Drive...");
    }

    @Override
    public int cena() {
        return 157000;
    }
}
