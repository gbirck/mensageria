package com.mensageria.msavaliadorcredito.domain.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CartaoCliente {
    private String nome;
    private String bandeira;
    private BigDecimal limiteLiberado;

    public CartaoCliente() {
    }

    public CartaoCliente(String nome, String bandeira, BigDecimal limiteLiberado) {
        this.nome = nome;
        this.bandeira = bandeira;
        this.limiteLiberado = limiteLiberado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public BigDecimal getLimiteLiberado() {
        return limiteLiberado;
    }

    public void setLimiteLiberado(BigDecimal limiteLiberado) {
        this.limiteLiberado = limiteLiberado;
    }
}
