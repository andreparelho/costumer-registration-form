package com.andreparelho.backendchallenge.service;

import com.andreparelho.backendchallenge.entity.ClientEntity;
import com.andreparelho.backendchallenge.entity.CompanyServices;
import com.andreparelho.backendchallenge.repository.ClientCrudRepository;
import com.andreparelho.backendchallenge.repository.ClientRepository;
import com.andreparelho.backendchallenge.repository.ClientRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


public class ClientServiceImplTest {
    private ClientEntity client;
    private ClientServiceImpl clientService;
    private List<CompanyServices> services;
    private ClientRepository clientRepository;
    private ClientCrudRepository clientCrudRepository;

    @BeforeEach
    public void init(){
        this.client = new ClientEntity();

        this.client.setName("Andre Parelho das Neves");
        this.client.setEmail("andre@email.com");
        this.client.setPhone("11999999999");
        this.client.setCompanyName("Andre Company LTDA.");

        this.services = new ArrayList<>();
        this.services.add(CompanyServices.CRM);
        this.services.add(CompanyServices.SEO);
        this.services.add(CompanyServices.MIDIA);

        this.client.setCompanyServicesList(services);

        this.clientCrudRepository = mock(ClientCrudRepository.class);
        this.clientRepository = new ClientRepositoryImpl(this.clientCrudRepository);

        this.clientService = new ClientServiceImpl(clientRepository);
    }

    @Test
    public void testGetRegisterClient(){
        when(this.clientCrudRepository.save(this.client)).thenReturn(this.client);
        ClientEntity newClient = clientService.registerClient(this.client);
        assertNotNull(newClient);
        assertEquals(newClient, this.client);
    }
}
