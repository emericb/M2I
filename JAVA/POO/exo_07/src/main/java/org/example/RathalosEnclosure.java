package org.example;

import java.util.ArrayList;
import java.util.List;

public class RathalosEnclosure implements Enclosure {
    private List<Rathalos> rathalos = new ArrayList<>();

    @Override
    public void addAnimal(Animal animal) {
        if (animal instanceof Rathalos) {
            rathalos.add((Rathalos) animal);
        } else {
            System.out.println("Cet enclos est réservé aux Rathalos.");
        }
    }

    @Override
    public void displayAnimals() {
        for (Rathalos rathalos : rathalos) {
            System.out.println("Rathalos: " + rathalos.getNom() + ", Age: " + rathalos.getAge());
        }
    }
}
