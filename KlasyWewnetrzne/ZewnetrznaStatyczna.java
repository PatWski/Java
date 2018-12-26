package Nauka.KlasyWewnetrzne;

public class ZewnetrznaStatyczna {
    static class WewnetrznaStatyczna {
        public int i = 9;
        private int j = 10;
        public static int k = 11;
        private static int l = 12;

        public void test() {
            System.out.println("Klasa wewnetrzna statyczna");
        }
    }

}
