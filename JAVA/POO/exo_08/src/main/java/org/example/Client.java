package org.example;

import java.util.List;

public class Client {
    private String name;
    private String surname;
    private String identificationNumber;
    private List<BankAccount> accounts;
    private String phoneNumber;

    public Client(String name, String surname, String identificationNumber, List<BankAccount> accounts, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.identificationNumber = identificationNumber;
        this.accounts = accounts;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void setAccounts(List<BankAccount> accounts) {
        this.accounts = accounts;
    }

    public BankAccount findAccountByNumber(int accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }
}
