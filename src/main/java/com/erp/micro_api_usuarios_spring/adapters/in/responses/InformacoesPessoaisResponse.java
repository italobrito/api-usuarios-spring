package com.erp.micro_api_usuarios_spring.adapters.in.responses;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InformacoesPessoaisResponse {

    @NotBlank(message = "O campo 'nomeCompleto' é obrigatório e não pode estar vazio.")
    private String nomeCompleto;

    @NotBlank(message = "O campo 'genero' é obrigatório e não pode estar vazio.")
    private String genero;

    @NotBlank(message = "O campo 'email' é obrigatório e não pode estar vazio.")
    @Email(message = "O campo 'email' deve conter um endereço de e-mail válido.")
    private String email;

    @NotNull(message = "O campo 'telefone' é obrigatório.")
    private String telefone;    

    @NotNull(message = "O campo 'data de nascimento' é obrigatório.")
    private String dataNascimento;

    @NotNull(message = "O campo 'CPF' é obrigatório.")
    private String cpf;    

    @NotNull(message = "O campo 'RG' é obrigatório.")
    private String rg;        
}