package org.example;

public class Operation {

    private int number;
    private double amount;
    private Operations type;

    public Operation(int number, double amount, Operations type) {
        this.number = number;
        this.amount = amount;
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Operations getType() {
        return type;
    }

    public void setType(Operations type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "number=" + number +
                ", amount=" + amount +
                ", type=" + type +
                '}';
    }
}
