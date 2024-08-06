package org.example;

import java.util.ArrayList;
import java.util.List;

public class RajangEnclosure implements Enclosure {
    private List<Rajang> rajangs = new ArrayList<>();

    @Override
    public void addAnimal(Animal animal) {
        if (animal instanceof Rajang) {
            rajangs.add((Rajang) animal);
        } else {
            System.out.println("Cet enclos est réservé aux Rajangs.");
        }
    }

    @Override
    public void displayAnimals() {
        for (Rajang rajang : rajangs) {
            System.out.println("Rajang: " + rajang.getNom() + ", Age: " + rajang.getAge());
        }
    }
}
