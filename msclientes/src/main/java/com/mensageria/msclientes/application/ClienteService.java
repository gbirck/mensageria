package com.mensageria.msclientes.application;

import com.mensageria.msclientes.domain.Cliente;
import com.mensageria.msclientes.infra.repository.ClienteRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Cliente insert(Cliente cliente){
        return repository.save(cliente);
    }

    public Optional<Cliente> findByCpf(String cpf){
        return repository.findByCpf(cpf);
    }
}
