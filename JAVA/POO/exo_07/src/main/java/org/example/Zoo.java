package org.example;

public class Zoo {
    public static void main(String[] args) {
        Rajang rajang1 = new Rajang("Rajang1", 7);
        Rajang rajang2 = new Rajang("Rajang2", 8);

        Rathalos rathalos1 = new Rathalos("Rathalos1", 6, 80000);
        Rathalos rathalos2 = new Rathalos("Rathalos2", 9, 120000);

        RajangEnclosure rajangEnclosure = new RajangEnclosure();
        RathalosEnclosure rathalosEnclosure = new RathalosEnclosure();

        rajangEnclosure.addAnimal(rajang1);
        rajangEnclosure.addAnimal(rajang2);

        rathalosEnclosure.addAnimal(rathalos1);
        rathalosEnclosure.addAnimal(rathalos2);

        System.out.println("Animaux dans l'enclos des Rajangs:");
        rajangEnclosure.displayAnimals();

        System.out.println("Animaux dans l'enclos des Rathalos:");
        rathalosEnclosure.displayAnimals();
    }
}
