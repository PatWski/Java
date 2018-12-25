package Nauka.TypyGeneryczne;

public class TypyGeneryczne {
    public static void main(String[] args) {

        TestTypGeneryczny<String,Integer> tg = new TestTypGeneryczny("String test", 100);
//        System.out.println(tg.getObj());
//        System.out.println(tg.getObj2());
        System.out.println(tg.obj);
        System.out.println(tg.obj2);
    }
}
