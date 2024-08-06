package org.example;

public class Arbre extends Plante {
    private double circumference;

    public Arbre(String name, int height, String color, double circumference) {
        super(name, height, color);
        this.circumference = circumference;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    @Override
    public String toString() {
        return super.toString() + ", circumference=" + circumference + '}';
    }
}