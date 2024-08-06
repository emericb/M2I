package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exo04 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Ajouter un étudiant");
            System.out.println("2. Afficher la liste des étudiants");
            System.out.println("3. Quitter");
            System.out.print("\nChoisissez une option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Entrez le nom de l'étudiant: ");
                    String name = scanner.nextLine();
                    System.out.print("Entrez l'âge de l'étudiant: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    try {
                        students.add(new Student(name, age));
                        System.out.println("Étudiant ajouté avec succès.");
                    } catch (InvalidAgeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("\nListe des étudiants:");
                    students.forEach(System.out::println);
                    break;
                case 3:
                    running = false;
                    System.out.println("\nAu revoir!");
                    break;
                default:
                    System.out.println("\nOption invalide. Veuillez réessayer.");
            }
        }
        scanner.close();
    }
}