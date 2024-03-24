package model;

public class Dog extends Animal{

    public Dog (String animalName, int animalAge){
        super(animalName, animalAge);
    }

    @Override
    void sound() {
        System.out.println("gav");
    }
}
