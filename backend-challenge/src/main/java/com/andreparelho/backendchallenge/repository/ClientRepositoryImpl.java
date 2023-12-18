package com.andreparelho.backendchallenge.repository;

import com.andreparelho.backendchallenge.entity.ClientEntity;

public class ClientRepositoryImpl implements ClientRepository{

    private final ClientCrudRepository clientCrudRepository;

    public ClientRepositoryImpl(ClientCrudRepository clientCrudRepository) {
        this.clientCrudRepository = clientCrudRepository;
    }

    @Override
    public ClientEntity createClient(ClientEntity clientEntity) {
        return this.clientCrudRepository.save(clientEntity);
    }
}
