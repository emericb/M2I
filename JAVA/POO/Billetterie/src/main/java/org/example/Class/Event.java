package org.example.Class;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Event {

    private String name;
    private Place place;
    private Date date;
    private String time;
    private int amountOfTickets;
    private List<Ticket> tickets;

    public Event(String name, Place place, String date, String time, int amountOfTickets) {
        this.name = name;
        this.place = place;
        this.date = new Date();
        this.time = time;
        this.amountOfTickets = amountOfTickets;
        this.tickets = new ArrayList<>();
    }

    public void addTicket(Ticket ticket) {
        this.tickets.add(ticket);
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getAmountOfTickets() {
        return amountOfTickets;
    }

    public void setAmountOfTickets(int amountOfTickets) {
        this.amountOfTickets = amountOfTickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public String toString() {
        return "Event : " +
                "name='" + name + '\'' +
                ", place=" + place.toString() +
                ", date=" + date +
                ", time='" + time + '\'' +
                ", amountOfTickets=" + amountOfTickets +
                ", tickets=" + tickets +
                '}';
    }
}
