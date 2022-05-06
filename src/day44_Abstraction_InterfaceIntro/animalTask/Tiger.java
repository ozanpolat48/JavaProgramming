package day44_Abstraction_InterfaceIntro.animalTask;

public final class Tiger extends Animal implements WindAnimal{


    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating deer");
    }

    public void hunt(){
        System.out.println(getName()+" hunts deer");
    }
}
