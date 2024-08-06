package org.example;

public class Rajang extends Animal {
    public Rajang(String nom, int age) {
        super(nom, age);
    }

    @Override
    public void manger() {
        System.out.println(getNom() + " le lion mange.");
    }

    @Override
    public void dormir() {
        System.out.println(getNom() + " le lion dort.");
    }

    @Override
    public void faireDuBruit() {
        System.out.println(getNom() + " le lion rugit.");
    }
}