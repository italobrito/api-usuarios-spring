package com.erp.micro_api_usuarios_spring.domain.entities;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class InformacoesPessoais implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nomeCompleto;
    private String genero;
    private String email;
    private String telefone;
    private String dataNascimento;
    private String cpf;
    private String rg;
}