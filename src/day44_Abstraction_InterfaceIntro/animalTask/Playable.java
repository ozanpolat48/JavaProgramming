package day44_Abstraction_InterfaceIntro.animalTask;

public interface Playable {

    boolean isFriendly = true; // static & final by default

    /*
    public static void method1(){
    System.out.printl(isFriendly);
     }
     */

    void play(); //abstract by default
}
