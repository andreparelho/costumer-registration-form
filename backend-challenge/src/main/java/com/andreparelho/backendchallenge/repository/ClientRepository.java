package com.andreparelho.backendchallenge.repository;

import com.andreparelho.backendchallenge.entity.ClientEntity;

public interface ClientRepository {
    ClientEntity createClient(ClientEntity clientEntity);
}
