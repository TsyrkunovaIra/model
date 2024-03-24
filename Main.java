package model;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String [] args){

        Animal cat1 = new Cat("tom", 6);
        Animal cat2 = new Cat("nom", 8);
        Animal cat3 = new Cat("pot", 5);
        Animal dog1 = new Dog("not", 12);
        Animal dog2 = new Dog("ter", 16);
        Animal dog3 = new Dog("kol", 7);

        ArrayList<Animal> o1 = new ArrayList<>(Arrays.asList(cat1,dog1));
        ArrayList<Animal> o2 = new ArrayList<>(Arrays.asList(cat2,dog2));
        ArrayList<Animal> o3 = new ArrayList<>(Arrays.asList(dog3));
        ArrayList<Animal> o4 = new ArrayList<>(Arrays.asList(cat3));

        Client c1 = new Client("Rik", "gomel", 25);
        Client c2 = new Client("Rok", "gomel", 36);
        Client c3 = new Client("Nona", "gomel", 45);
        Client c4 = new Client("Dons", "gomel", 85);

        c1.setAnimals(o1);
        c2.setAnimals(o2);
        c3.setAnimals(o3);
        c4.setAnimals(o4);

        ArrayList<Client> basa = new ArrayList<>(Arrays.asList(c1, c2, c3, c4));
        for (Client c : basa){
            System.out.println("clietn name: " + c.getName() + " , " + "client animal name: " ); c.getPrintAnimalName();
            System.out.println(c);
        }
        Clinic c = new Clinic();
        c.toWork();

        Ill ill = new Ill();
        ill.treatment("smdjvbhgsdj","kjdh");
        ill.treatment("djh", 2);
        ill.treatment("lkfgjl",12.5, 10);

        System.out.println();

        cat1.sound();
        dog2.sound();
        c1.pet();

        System.out.println(cat1.getAnimalName() != null ? cat1.getAnimalName() : cat1.getIll().getNameIll());















    }
}
