package org.example.Class;

import org.example.Enum.Rank;

public class Ticket {

    private int ticketId;
    private Client client;
    private Event event;
    private Rank type;

    public Ticket(int ticketId, Client client, Event event, Rank type) {
        this.ticketId = ticketId;
        this.client = client;
        this.event = event;
        this.type = type;
        event.addTicket(this);
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Rank getType() {
        return type;
    }

    public void setType(Rank type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Ticket : " +
                "ticketId=" + ticketId +
                ", client=" + client.toString() +
                ", event=" + event.toString() +
                ", type=" + type +
                '}';
    }
}
