package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("1234567890123456", "oui oui", new Date(), "123");
        Paypal paypal = new Paypal("oui.oui@example.com", "password");

        String creditCardPaymentResult = creditCard.processPayment(100.0);
        String paypalPaymentResult = paypal.processPayment(0.0);

        System.out.println(creditCardPaymentResult);
        System.out.println(paypalPaymentResult);
    }
}