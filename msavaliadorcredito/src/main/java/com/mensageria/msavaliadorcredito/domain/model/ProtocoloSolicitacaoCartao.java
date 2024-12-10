package com.mensageria.msavaliadorcredito.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class ProtocoloSolicitacaoCartao {
    private String protocolo;

    public ProtocoloSolicitacaoCartao(String protocolo) {
        this.protocolo = protocolo;
    }
}
