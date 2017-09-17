package ekb.service;

import ekb.entity.Client;

import java.util.Collection;

public interface ClientService {

    void add(Client client);
    void deleteClientById(Long id);
    Client getClientById(Long id);
    void updateClient(Client client);
    Collection<Client> getAllClients() ;

}
