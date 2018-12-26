package Nauka.KlasyWewnetrzne;

public class Zewnetrzna2 {
    //z kalsy statycznej nie ma dostepu do pol zwyklych klasy zewnetrznej
    public int m = 9;
    private int n = 10;
    public static int o = 11;
    private static int p = 12;

    public void test() {
        System.out.println("Klasa zewnetrzna");
    }
    static class WewnetrznaStatyczna {
        public int i = 9;
        private int j = 10;
        public static int k = 11;
        private static int l = 12;

        Zewnetrzna2 zs = new Zewnetrzna2();//wywolanie pol kasy zewnetrznej z klasy statycznej odbywa sie
        // za pomoca obiektu klasy wewnetrznej statycznej

        public void test() {
            System.out.println("Klasa wewnetrzna statyczna");
            System.out.println(zs.n); //odwolanie sie do pola prywatnego z klasy wewnetrznej statycznje
            System.out.println(Zewnetrzna2.p); //odwolanie sie do pola prywatnego statycznego klasy zewnetrznej
        }
    }

}
