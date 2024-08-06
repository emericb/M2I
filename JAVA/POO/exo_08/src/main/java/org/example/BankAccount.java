package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class BankAccount {
    private static int nextAccountNumber = 1;
    private final int accountNumber;
    private double balance;
    private final String client;
    private List<String> operations;

    public BankAccount(double balance, String client) {
        this.accountNumber = nextAccountNumber++;
        this.balance = balance;
        this.client = client;
        this.operations = new ArrayList<>();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getClient() {
        return client;
    }

    public List<String> getOperations() {
        return operations;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Le montant doit être supérieur à 0");
        }
        balance += amount;
        addOperation("Deposit: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            throw new IllegalArgumentException("Montant invalide");
        }
        balance -= amount;
        addOperation("Withdraw: " + amount);
    }

    private void addOperation(String operation) {
        operations.add(operation);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", client='" + client + '\'' +
                ", operations=" + operations +
                '}';
    }
}