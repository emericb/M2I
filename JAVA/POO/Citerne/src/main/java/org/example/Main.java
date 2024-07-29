package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WaterTank tank = new WaterTank(100, 500);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Remplir la citerne");
            System.out.println("2. Vider la citerne");
            System.out.println("3. Afficher le poids total de la citerne");
            System.out.println("4. Quitter");
            System.out.print("Choisissez une option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Entrez le nombre de litres pour remplir la citerne: ");
                    int fillLiters = scanner.nextInt();
                    int excessWater = tank.fill(fillLiters);
                    System.out.println("Excès d'eau: " + excessWater + " litres");
                    System.out.println("Poids total de la citerne après remplissage: " + tank.getTotalWeight() + " kg");
                    break;
                case 2:
                    System.out.print("Entrez le nombre de litres pour vider la citerne: ");
                    int emptyLiters = scanner.nextInt();
                    int removedWater = tank.empty(emptyLiters);
                    System.out.println("Eau retirée: " + removedWater + " litres");
                    System.out.println("Poids total de la citerne après vidage: " + tank.getTotalWeight() + " kg");
                    break;
                case 3:
                    System.out.println("Poids total de la citerne: " + tank.getTotalWeight() + " kg");
                    break;
                case 4:
                    System.out.println("A+");
                    scanner.close();
                    return;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }
    }
}