package com.andreparelho.backendchallenge.service;

import com.andreparelho.backendchallenge.entity.ClientEntity;
import com.andreparelho.backendchallenge.repository.ClientRepository;

public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public ClientEntity registerClient(ClientEntity client) {
        return this.clientRepository.createClient(client);
    }
}
