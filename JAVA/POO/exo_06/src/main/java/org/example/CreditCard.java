package org.example;

import java.util.Date;

public class CreditCard implements Payment {
    private String cardNumber;
    private String owner;
    private Date expirationDate;
    private String cvv;

    public CreditCard(String cardNumber, String owner, Date expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.owner = owner;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getOwner() {
        return owner;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public String getCvv() {
        return cvv;
    }

    @Override
    public String processPayment(double amount) {
        if (amount > 0) {
            return "Paiment de " + amount + " € réussi.";
        } else {
            return "Paiment échoué.";
        }
    }
}