package org.example;

public class Paypal implements Payment {
    private String email;
    private String password;

    public Paypal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
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