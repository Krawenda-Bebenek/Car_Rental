package ekb.service;

import ekb.dao.ClientRepository;
import ekb.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public void add(Client client) { clientRepository.save(client); }

    @Override
    public void deleteClientById(Long id) {
            clientRepository.delete(id);
    }

    @Override
    public Client getClientById(Long id) {
        return clientRepository.findOne(id);
    }

    @Override
    public void updateClient(Client client) {
        clientRepository.save(client);
    }

    @Override
    public Collection<Client> getAllClients() {
        return clientRepository.findAll();
    }

}
