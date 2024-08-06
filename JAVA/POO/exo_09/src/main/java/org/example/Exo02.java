package org.example;

import java.util.Scanner;

public class Exo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (true) {
            System.out.print("Veuillez entrer un nombre entier positif: ");
            String input = scanner.nextLine();
            try {
                number = Integer.parseInt(input);
                if (number < 0) {
                    throw new NumberFormatException("Le nombre doit être positif.");
                }
                System.out.println(Math.sqrt(number));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrée invalide. Veuillez entrer un nombre entier positif.");
            }
        }
    }
}
