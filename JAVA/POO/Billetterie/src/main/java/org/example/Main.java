package org.example;

import org.example.Class.Client;
import org.example.Class.Event;
import org.example.Class.Ticket;
import org.example.Class.Place;
import org.example.Enum.Rank;
import org.example.Service.ClientService;
import org.example.Service.EventService;
import org.example.Service.TicketService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ClientService clientService = new ClientService();
    private static EventService eventService = new EventService();
    private static TicketService ticketService = new TicketService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nChoisir une opération:");
            System.out.println("1. Créer Client");
            System.out.println("2. Afficher Client");
            System.out.println("3. Mettre à jour Client");
            System.out.println("4. Supprimer Client");
            System.out.println("5. Créer Event");
            System.out.println("6. Afficher Event");
            System.out.println("7. Mettre à jour Event");
            System.out.println("8. Supprimer Event");
            System.out.println("9. Créer Ticket");
            System.out.println("10. Afficher Ticket");
            System.out.println("11. Mettre à jour Ticket");
            System.out.println("12. Supprimer Ticket");
            System.out.println("0. Quitter");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> createClient(scanner);
                case 2 -> readClient(scanner);
                case 3 -> updateClient(scanner);
                case 4 -> deleteClient(scanner);
                case 5 -> createEvent(scanner);
                case 6 -> readEvent(scanner);
                case 7 -> updateEvent(scanner);
                case 8 -> deleteEvent(scanner);
                case 9 -> createTicket(scanner);
                case 10 -> readTicket(scanner);
                case 11 -> updateTicket(scanner);
                case 12 -> deleteTicket(scanner);
                case 0 -> running = false;
                default -> System.out.println("Choix invalide.");
            }
        }
        scanner.close();
    }

    private static void createClient(Scanner scanner) {
        System.out.println("Entrer le nom du client: ");
        String name = scanner.nextLine();
        System.out.println("Entrer le prénom du client: ");
        String surname = scanner.nextLine();
        System.out.println("Entrer l'adresse du client: ");
        String address = scanner.nextLine();
        System.out.println("Entrer l'âge du client: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Entrer le numéro de téléphone du client: ");
        String phoneNumber = scanner.nextLine();

        Client client = new Client(name, surname, address, age, phoneNumber, new ArrayList<>());
        clientService.createClient(client);
        System.out.println("Client créé avec succès.");
    }

    private static void readClient(Scanner scanner) {
        System.out.println("Entrer le nom du client à afficher: ");
        String name = scanner.nextLine();
        clientService.readClient(name).ifPresentOrElse(
                client -> System.out.println("Client trouvé: " + client),
                () -> System.out.println("Client introuvable.")
        );
    }

    private static void updateClient(Scanner scanner) {
        System.out.println("Entrer le nom du client à mettre à jour: ");
        String name = scanner.nextLine();
        System.out.println("Entrer le nouveau prénom: ");
        String surname = scanner.nextLine();
        System.out.println("Entrer la nouvelle adresse: ");
        String address = scanner.nextLine();
        System.out.println("Entrer le nouvel âge: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Entrer le nouveau numéro de téléphone: ");
        String phoneNumber = scanner.nextLine();

        Client updatedClient = new Client(name, surname, address, age, phoneNumber, new ArrayList<>());
        if (clientService.updateClient(name, updatedClient)) {
            System.out.println("Client mis à jour avec succès.");
        } else {
            System.out.println("Client introuvable.");
        }
    }

    private static void deleteClient(Scanner scanner) {
        System.out.println("Entrer le nom du client à supprimer: ");
        String name = scanner.nextLine();
        if (clientService.deleteClient(name)) {
            System.out.println("Client supprimé avec succès.");
        } else {
            System.out.println("Client introuvable.");
        }
    }

    private static void createEvent(Scanner scanner) {
        System.out.println("Entre le nom de l'événement: ");
        String name = scanner.nextLine();
        System.out.println("Entrer la rue: ");
        String rue = scanner.nextLine();
        System.out.println("Entrer la ville: ");
        String ville = scanner.nextLine();
        Place place = new Place(rue, ville);
        System.out.println("Entrer la date de l'événement: ");
        String date = scanner.nextLine();
        System.out.println("Entrer l'heure de l'événement: ");
        String time = scanner.nextLine();
        System.out.println("Entrer le nombre de billets: ");
        int amountOfTickets = scanner.nextInt();
        scanner.nextLine();

        Event event = new Event(name, place, date, time, amountOfTickets);
        eventService.createEvent(event);
        System.out.println("Événement créé avec succès.");
    }

    private static void readEvent(Scanner scanner) {
        System.out.println("Entrer le nom de l'événement à afficher: ");
        String name = scanner.nextLine();
        eventService.readEvent(name).ifPresentOrElse(
                event -> System.out.println("Evénement trouvé " + event),
                () -> System.out.println("Evénement introuvable.")
        );
    }

    private static void updateEvent(Scanner scanner) {
        System.out.println("Entrer le nom de l'événement à mettre à jour: ");
        String name = scanner.nextLine();
        System.out.println("Entrer la nouvelle rue: ");
        String rue = scanner.nextLine();
        System.out.println("Entrer la nouvelle ville: ");
        String ville = scanner.nextLine();
        Place place = new Place(rue, ville);
        System.out.println("Entrer la nouvelle date de l'événement: ");
        String date = scanner.nextLine();
        System.out.println("Entrer la nouvelle heure de l'événement: ");
        String time = scanner.nextLine();
        System.out.println("Entrer le nouveau nombre de billets: ");
        int amountOfTickets = scanner.nextInt();
        scanner.nextLine();

        Event updatedEvent = new Event(name, place, date, time, amountOfTickets);
        if (eventService.updateEvent(name, updatedEvent)) {
            System.out.println("Evénement mis à jour avec succès.");
        } else {
            System.out.println("Evénement introuvable.");
        }
    }

    private static void deleteEvent(Scanner scanner) {
        System.out.println("Entrer le nom de l'événement à supprimer: ");
        String name = scanner.nextLine();
        if (eventService.deleteEvent(name)) {
            System.out.println("Evénement supprimé avec succès.");
        } else {
            System.out.println("Evénement introuvable.");
        }
    }

    private static void createTicket(Scanner scanner) {
        System.out.println("Entrer l'ID du billet: ");
        int ticketId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Entrer le nom du client: ");
        String clientName = scanner.nextLine();
        Client client = clientService.readClient(clientName).orElse(null);
        if (client == null) {
            System.out.println("Client introuvable.");
            return;
        }
        System.out.println("Entrer le nom de l'événement: ");
        String eventName = scanner.nextLine();
        Event event = eventService.readEvent(eventName).orElse(null);
        if (event == null) {
            System.out.println("Evénement introuvable.");
            return;
        }
        System.out.println("Entrer le type de billet: ");
        Rank type = Rank.valueOf(scanner.nextLine().toUpperCase());

        Ticket ticket = new Ticket(ticketId, client, event, type);
        ticketService.createTicket(ticket);
        System.out.println("Billet créé avec succès.");
    }

    private static void readTicket(Scanner scanner) {
        System.out.println("Entrer l'ID du billet à afficher: ");
        int ticketId = scanner.nextInt();
        scanner.nextLine();
        ticketService.readTicket(ticketId).ifPresentOrElse(
                ticket -> System.out.println("Ticket trouvé: " + ticket),
                () -> System.out.println("Ticket introuvable.")
        );
    }

    private static void updateTicket(Scanner scanner) {
        System.out.println("Entrer l'ID du billet à mettre à jour: ");
        int ticketId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Entrer le nom du client: ");
        String clientName = scanner.nextLine();
        Client client = clientService.readClient(clientName).orElse(null);
        System.out.println("Entrer le nom de l'événement: ");
        String eventName = scanner.nextLine();
        Event event = eventService.readEvent(eventName).orElse(null);
        System.out.println("Entrer le type de billet: ");
        Rank type = Rank.valueOf(scanner.nextLine().toUpperCase());

        Ticket updatedTicket = new Ticket(ticketId, client, event, type);
        if (ticketService.updateTicket(ticketId, updatedTicket)) {
            System.out.println("Ticket mis à jour avec succès.");
        } else {
            System.out.println("Ticket introuvable.");
        }
    }

    private static void deleteTicket(Scanner scanner) {
        System.out.println("Entrer l'ID du billet à supprimer: ");
        int ticketId = scanner.nextInt();
        scanner.nextLine();
        if (ticketService.deleteTicket(ticketId)) {
            System.out.println("Ticket supprimé avec succès.");
        } else {
            System.out.println("Ticket introuvable.");
        }
    }
}