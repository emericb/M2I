package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        Client client = new Client("Client", "Test", "123456789", accounts, "123456789");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoisissez une opération:");
            System.out.println("1. Lister les comptes");
            System.out.println("2. Créer un compte bancaire");
            System.out.println("3. Effectuer un dépôt");
            System.out.println("4. Effectuer un retrait");
            System.out.println("5. Afficher les opérations et le solde");
            System.out.println("0. Quitter");

            int choice = scanner.nextInt();
            if (choice == 0) break;

            switch (choice) {
                case 1 -> listAccounts(client);
                case 2 -> createAccount(client, scanner);
                case 3 -> performDeposit(client, scanner);
                case 4 -> performWithdrawal(client, scanner);
                case 5 -> displayOperationsAndBalance(client, scanner);
                default -> System.out.println("Choix invalide.");
            }
        }
        scanner.close();
    }

    private static void listAccounts(Client client) {
        System.out.println("Liste des comptes:");
        client.getAccounts().forEach(System.out::println);
    }

    private static void createAccount(Client client, Scanner scanner) {
        System.out.println("Choisissez le type de compte:");
        System.out.println("1. Compte courant");
        System.out.println("2. Compte épargne");
        System.out.println("3. Compte payant");
        int accountType = scanner.nextInt();
        System.out.println("Montant initial:");
        double initialBalance = scanner.nextDouble();
        BankAccount newAccount = switch (accountType) {
            case 1 -> new CurrentAccount(initialBalance, client.getIdentificationNumber());
            case 2 -> new SavingAccount(initialBalance, client.getIdentificationNumber());
            case 3 -> new PayingAccount(initialBalance, client.getIdentificationNumber());
            default -> null;
        };
        if (newAccount != null) {
            client.addAccount(newAccount);
            System.out.println("Compte créé avec succès.");
        } else {
            System.out.println("Type de compte invalide.");
        }
    }

    private static void performDeposit(Client client, Scanner scanner) {
        System.out.println("Numéro de compte:");
        int accountNumber = scanner.nextInt();
        System.out.println("Montant du dépôt:");
        double depositAmount = scanner.nextDouble();
        BankAccount account = client.findAccountByNumber(accountNumber);
        if (account != null) {
            account.deposit(depositAmount);
        } else {
            System.out.println("Compte non trouvé.");
        }
    }

    private static void performWithdrawal(Client client, Scanner scanner) {
        System.out.println("Numéro de compte:");
        int accountNumber = scanner.nextInt();
        System.out.println("Montant du retrait:");
        double withdrawAmount = scanner.nextDouble();
        BankAccount account = client.findAccountByNumber(accountNumber);
        if (account != null) {
            account.withdraw(withdrawAmount);
        } else {
            System.out.println("Compte non trouvé.");
        }
    }

    private static void displayOperationsAndBalance(Client client, Scanner scanner) {
        System.out.println("Numéro de compte:");
        int accountNumber = scanner.nextInt();
        BankAccount account = client.findAccountByNumber(accountNumber);
        if (account != null) {
            System.out.println("Solde du compte: " + account.getBalance());
            System.out.println("Opérations du compte:");
            account.getOperations().forEach(System.out::println);
        } else {
            System.out.println("Compte non trouvé.");
        }
    }
}