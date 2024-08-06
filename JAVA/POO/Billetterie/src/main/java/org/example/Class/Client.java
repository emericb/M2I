package org.example.Class;

import java.util.List;

public class Client {

    private String name;
    private String surname;
    private String adress;
    private int age;
    private String phoneNumber;
    private List<Ticket> tickets;

    public Client(String name, String surname, String adress, int age, String phoneNumber, List<Ticket> tickets) {
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.tickets = tickets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public String toString() {
        return "Client : " +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", adress='" + adress + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", tickets=" + tickets +
                '}';
    }
}
