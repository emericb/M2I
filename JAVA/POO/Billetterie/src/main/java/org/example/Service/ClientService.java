package org.example.Service;

import org.example.Class.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClientService {
    private List<Client> clients = new ArrayList<>();

    public void createClient(Client client) {
        clients.add(client);
    }

    public Optional<Client> readClient(String name) {
        return clients.stream().filter(client -> client.getName().equals(name)).findFirst();
    }

    public boolean updateClient(String name, Client updatedClient) {
        Optional<Client> clientOpt = readClient(name);
        if (clientOpt.isPresent()) {
            Client client = clientOpt.get();
            client.setSurname(updatedClient.getSurname());
            client.setAdress(updatedClient.getAdress());
            client.setAge(updatedClient.getAge());
            client.setPhoneNumber(updatedClient.getPhoneNumber());
            return true;
        }
        return false;
    }

    public boolean deleteClient(String name) {
        return clients.removeIf(client -> client.getName().equals(name));
    }
}