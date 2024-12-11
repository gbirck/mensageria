package com.mensageria.mscartoes.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Data
public class ClienteCartao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String cpf;
    @ManyToOne
    @JoinColumn(name = "id_cartao")
    @NotBlank
    private Cartao cartao;
    @NotBlank
    private BigDecimal limite;

}
