package org.example;

public class Rathalos extends Animal {
    private int poids;

    public Rathalos(String nom, int age, int poids) {
        super(nom, age);
        this.poids = poids;
    }

    @Override
    public void manger() {
        System.out.println(getNom() + " l'éléphant mange.");
    }

    @Override
    public void dormir() {
        System.out.println(getNom() + " l'éléphant dort.");
    }

    @Override
    public void faireDuBruit() {
        System.out.println(getNom() + " l'éléphant barrit.");
    }

    public int getPoids() {
        return poids;
    }
}