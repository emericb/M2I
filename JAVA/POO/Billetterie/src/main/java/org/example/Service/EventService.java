package org.example.Service;

import org.example.Class.Event;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EventService {
    private List<Event> events = new ArrayList<>();

    public void createEvent(Event event) {
        events.add(event);
    }

    public Optional<Event> readEvent(String name) {
        return events.stream().filter(event -> event.getName().equals(name)).findFirst();
    }

    public boolean updateEvent(String name, Event updatedEvent) {
        Optional<Event> eventOpt = readEvent(name);
        if (eventOpt.isPresent()) {
            Event event = eventOpt.get();
            event.setPlace(updatedEvent.getPlace());
            event.setDate(updatedEvent.getDate());
            event.setTime(updatedEvent.getTime());
            event.setAmountOfTickets(updatedEvent.getAmountOfTickets());
            return true;
        }
        return false;
    }

    public boolean deleteEvent(String name) {
        return events.removeIf(event -> event.getName().equals(name));
    }
}
