package com.erp.micro_api_usuarios_spring.adapters.in.responses;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InformacoesProfissionaisResponse {

    @NotBlank(message = "O campo 'tipoUsuario' é obrigatório e não pode estar vazio.")
    private String tipoUsuario;

    @NotBlank(message = "O campo 'status' é obrigatório e não pode estar vazio.")
    private String status;
    
    @NotBlank(message = "O campo 'cargo' é obrigatório e não pode estar vazio.")
    private String cargo;

    @NotBlank(message = "O campo 'dataAdmissao' é obrigatório e não pode estar vazio.")
    private String dataAdmissao;

    @NotBlank(message = "O campo 'setor' é obrigatório e não pode estar vazio.")
    private String setor;

    @NotBlank(message = "O campo 'temaPreferido' é obrigatório e não pode estar vazio.")
    private String temaPreferido;

}