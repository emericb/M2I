package org.example;

public class Commercial extends Salarie {
    private int salesRevenue;
    private int commissionPercentage;

    public Commercial(String id, String department, String name, int salary, int salesRevenue, int commissionPercentage) {
        super(id, department, name, salary);
        this.salesRevenue = salesRevenue;
        this.commissionPercentage = commissionPercentage;
    }

    public Commercial(int salesRevenue, int commissionPercentage) {
        super("", "", "", 0);
        this.salesRevenue = salesRevenue;
        this.commissionPercentage = commissionPercentage;
    }

    private int calculateCommission() {
        return (salesRevenue * commissionPercentage) / 100;
    }

    @Override
    public void displaySalary() {
        System.out.println("Le salaire de " + name + " est de " + (salary + calculateCommission()) + " euros.");
    }

    @Override
    public String toString() {
        return "Commercial [nom=" + name + ", salaire=" + salary + ", Chiffre d'affaire=" + salesRevenue + ", commission=" + calculateCommission() + "]";
    }
}