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
public class InformacoesProfissionais implements Serializable {
    private static final long serialVersionUID = 1L;

    private String tipoUsuario;
    private String status;
    private String cargo;
    private String dataAdmissao;
    private String setor;
    private String temaPreferido;
}