package com.erp.micro_api_usuarios_spring.ports.in.usecases;

import com.erp.micro_api_usuarios_spring.adapters.in.responses.CadastrarUsuarioResponse;
import com.erp.micro_api_usuarios_spring.domain.entities.Usuario;

public interface CadastrarUsuarioUseCasePort {
    Usuario execute(CadastrarUsuarioResponse usuario);
}