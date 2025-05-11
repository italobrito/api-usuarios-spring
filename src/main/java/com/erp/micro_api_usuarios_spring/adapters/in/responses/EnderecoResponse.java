package com.erp.micro_api_usuarios_spring.adapters.in.responses;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoResponse {

    @NotBlank(message = "O campo 'rua' é obrigatório e não pode estar vazio.")
    private String rua;

    @NotBlank(message = "O campo 'numero' é obrigatório e não pode estar vazio.")
    private String numero;

    @NotBlank(message = "O campo 'complemento' é obrigatório e não pode estar vazio.")
    private String complemento;    

    @NotBlank(message = "O campo 'bairro' é obrigatório e não pode estar vazio.")
    private String bairro;

    @NotBlank(message = "O campo 'cidade' é obrigatório e não pode estar vazio.")
    private String cidade;

    @NotBlank(message = "O campo 'estado' é obrigatório e não pode estar vazio.")
    private String estado;

    @NotBlank(message = "O campo 'cep' é obrigatório e não pode estar vazio.")
    private String cep;
}