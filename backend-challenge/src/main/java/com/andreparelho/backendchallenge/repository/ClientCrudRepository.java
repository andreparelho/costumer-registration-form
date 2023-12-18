package com.andreparelho.backendchallenge.repository;

import com.andreparelho.backendchallenge.entity.ClientEntity;
import org.springframework.data.repository.CrudRepository;

public interface ClientCrudRepository extends CrudRepository<ClientEntity, Long> {
}
