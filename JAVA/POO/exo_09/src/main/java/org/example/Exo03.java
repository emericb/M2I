package org.example;

public class Exo03 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.println("Troisième élément: " + numbers[2]);
            System.out.println("Sixième élément: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index hors limites.");
        }
    }
}
