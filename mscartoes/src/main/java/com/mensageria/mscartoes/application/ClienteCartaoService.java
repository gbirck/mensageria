package com.mensageria.mscartoes.application;

import com.mensageria.mscartoes.domain.ClienteCartao;
import com.mensageria.mscartoes.infra.repository.ClienteCartaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteCartaoService {

    private final ClienteCartaoRepository repository;

    public ClienteCartaoService(ClienteCartaoRepository repository) {
        this.repository = repository;
    }

    public List<ClienteCartao> listCartoesByCpf(String cpf){
        return repository.findByCpf(cpf);
    }
}
