package com.erp.micro_api_usuarios_spring.adapters.in.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.Valid;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CadastrarUsuarioResponse {

    @Valid
    @NotNull(message = "Informações pessoais são obrigatórias.")
    private InformacoesPessoaisResponse informacoesPessoais;

    @Valid
    @NotNull(message = "Endereço é obrigatório.")
    private EnderecoResponse endereco;

    @Valid
    @NotNull(message = "Informações profissionais são obrigatórias.")
    private InformacoesProfissionaisResponse informacoesProfissionais;

    private String avatar;

}