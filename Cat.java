package model;

public class Cat extends Animal{

    public Cat (String animmalName, int animalAge){
        super(animmalName, animalAge);
    }

    @Override
    void sound() {
        System.out.println("meow");
    }
}
