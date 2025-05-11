package com.erp.micro_api_usuarios_spring.adapters.in.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioReduzidoResponse {
    private Long id;
    private String nome;
    private String email;
    private String tipoUsuario;
    private String status;
}