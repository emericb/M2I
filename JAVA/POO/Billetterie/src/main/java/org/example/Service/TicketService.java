package org.example.Service;

import org.example.Class.Ticket;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TicketService {
    private List<Ticket> tickets = new ArrayList<>();

    public void createTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public Optional<Ticket> readTicket(int ticketId) {
        return tickets.stream().filter(ticket -> ticket.getTicketId() == ticketId).findFirst();
    }

    public boolean updateTicket(int ticketId, Ticket updatedTicket) {
        Optional<Ticket> ticketOpt = readTicket(ticketId);
        if (ticketOpt.isPresent()) {
            Ticket ticket = ticketOpt.get();
            ticket.setClient(updatedTicket.getClient());
            ticket.setEvent(updatedTicket.getEvent());
            ticket.setType(updatedTicket.getType());
            return true;
        }
        return false;
    }

    public boolean deleteTicket(int ticketId) {
        return tickets.removeIf(ticket -> ticket.getTicketId() == ticketId);
    }
}
