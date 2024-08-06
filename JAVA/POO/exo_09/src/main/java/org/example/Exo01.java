package org.example;

import java.util.Scanner;

public class Exo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (true) {
            System.out.print("Veuillez entrer un nombre entier: ");
            String input = scanner.nextLine();
            try {
                number = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrée invalide. Veuillez entrer un nombre entier.");
            }
        }

        System.out.println("Vous avez entré le nombre: " + number);
    }
}
