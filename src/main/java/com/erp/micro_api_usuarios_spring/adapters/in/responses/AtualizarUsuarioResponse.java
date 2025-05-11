package com.erp.micro_api_usuarios_spring.adapters.in.responses;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AtualizarUsuarioResponse {
    private Long id;

    @NotNull(message = "Informações pessoais são obrigatórias.")
    private InformacoesPessoaisResponse informacoesPessoais;

    @NotNull(message = "Endereço é obrigatório.")
    private EnderecoResponse endereco;

    @NotNull(message = "Informações profissionais são obrigatórias.")
    private InformacoesProfissionaisResponse informacoesProfissionais;

    private String avatar;
}