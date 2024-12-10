package com.mensageria.msavaliadorcredito.domain.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class SituacaoCliente {
    private DadosCliente cliente;
    private List<CartaoCliente> cartoes;

    public SituacaoCliente(DadosCliente cliente, List<CartaoCliente> cartoes) {
        this.cliente = cliente;
        this.cartoes = cartoes;
    }

    public SituacaoCliente() {
    }
}
