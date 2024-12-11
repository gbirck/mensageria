package com.mensageria.msavaliadorcredito.domain.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Data
public class Cartao {
    private Long id;
    @NotBlank
    private String nome;
    @NotBlank
    private String bandeira;
    @NotBlank
    private BigDecimal limiteBasico;
}
