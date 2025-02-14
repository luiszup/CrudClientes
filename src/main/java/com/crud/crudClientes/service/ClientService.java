package com.crud.crudClientes.service;

import com.crud.crudClientes.model.ClientModel;
import com.crud.crudClientes.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<ClientModel> getAllClients() {
        List<ClientModel> clients = clientRepository.findAll();
        return clients;
    }
}
