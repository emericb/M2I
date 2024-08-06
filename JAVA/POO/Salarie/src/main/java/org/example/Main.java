package org.example;

import java.util.Scanner;

public class Main {
    private static final int MAX_EMPLOYEES = 20;
    private static Salarie[] employees = new Salarie[MAX_EMPLOYEES];
    private static int employeeCount = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Ajouter un salarié");
            System.out.println("2. Afficher les salaires");
            System.out.println("3. Rechercher un salarié par nom");
            System.out.println("4. Afficher le nombre total d'employés");
            System.out.println("5. Afficher le salaire total");
            System.out.println("6. Quitter");
            System.out.print("Choix: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addEmployee();
                case 2 -> displaySalaries();
                case 3 -> searchEmployeeByName();
                case 4 -> displayTotalEmployees();
                case 5 -> displayTotalSalary();
                case 6 -> {
                    System.out.println("A+!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Choix invalide.");
            }
        }
    }

    private static void addEmployee() {
        if (employeeCount < MAX_EMPLOYEES) {
            System.out.print("Saissisez le nom: ");
            String name = scanner.nextLine();
            System.out.print("Saisissez le salaire: ");
            int salary = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Est-ce un commercial (yes/no): ");
            String isCommercial = scanner.nextLine();
            if (isCommercial.equalsIgnoreCase("yes")) {
                System.out.print("Saissisez le chiffre d'affaires: ");
                int salesRevenue = scanner.nextInt();
                System.out.print("Saissisez la commission (en pourcentage): ");
                int commissionPercentage = scanner.nextInt();
                scanner.nextLine();
                employees[employeeCount++] = new Commercial("", "", name, salary, salesRevenue, commissionPercentage);
            } else {
                employees[employeeCount++] = new Salarie("", "", name, salary);
            }
            System.out.println("Salarié ajouté.");
        } else {
            System.out.println("Le nombre maximum d'employés a été atteint.");
        }
    }

    private static void displaySalaries() {
        for (int i = 0; i < employeeCount; i++) {
            employees[i].displaySalary();
        }
    }

    private static void searchEmployeeByName() {
        System.out.print("Saisissez le nom à rechercher: ");
        String searchName = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].name.startsWith(searchName)) {
                employees[i].displaySalary();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Aucun salarié trouvé.");
        }
    }

    private static void displayTotalEmployees() {
        System.out.println("Le nombre total d'employés est de " + Salarie.getTotalEmployees());
    }

    private static void displayTotalSalary() {
        System.out.println("Le salaire total est de " + Salarie.getTotalSalary() + " euros.");
    }
}