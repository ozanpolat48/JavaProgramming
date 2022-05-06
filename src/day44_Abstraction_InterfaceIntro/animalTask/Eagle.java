package day44_Abstraction_InterfaceIntro.animalTask;

import java.io.Flushable;

public class Eagle extends Animal implements WindAnimal, Flyable {


    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating snake");
    }

    public void hunt(){
        System.out.println(getName()+" is hunts snake");
    }

    public void fly(){
        System.out.println(getName()+" can fly 50km/h");
    }
}
