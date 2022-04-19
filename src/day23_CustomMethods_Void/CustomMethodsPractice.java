package day23_CustomMethods_Void;

public class CustomMethodsPractice {

    public static void main(String[] args) {

        helloWorld5Times();

        System.out.println("------------------------------");

        helloCydeo5Times();

        System.out.println("----------------------------------");

        evenNumbers1to10();

    }

    public static void helloWorld5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }

    public static void helloCydeo5Times() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");
        }
    }
    public static void evenNumbers1to10() {

        for (int i = 0; i < 11 ; i++) {
            System.out.println(i++);
        }

    }
}
