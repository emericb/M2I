package org.example;

public class Salarie {
    protected final String name;
    protected int salary;

    private static int totalEmployees = 0;
    private static int totalSalary = 0;

    public Salarie(String id, String department, String name, int salary) {
        this.name = name;
        this.salary = salary;
        totalEmployees++;
        totalSalary += salary;
    }

    public void displaySalary() {
        System.out.println("Le salaire de " + name + " est de " + salary + " euros.");
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }

    public static int getTotalSalary() {
        return totalSalary;
    }

    public static void resetTotalEmployees() {
        totalEmployees = 0;
        System.out.println("Le nombre total d'employés a été réinitialisé.");
    }
}