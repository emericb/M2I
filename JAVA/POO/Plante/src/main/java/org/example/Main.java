package org.example;

public class Main {
    public static void main(String[] args) {
        Plante plante = new Plante("Rose", 30, "Red");
        Arbre arbre = new Arbre("Oak", 500, "Green", 2.5);

        System.out.println(plante);
        System.out.println(arbre);
    }
}