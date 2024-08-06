package org.example;

public abstract class Animal {
    protected String nom;
    protected int age;

    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public abstract void manger();
    public abstract void dormir();
    public abstract void faireDuBruit();

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }
}