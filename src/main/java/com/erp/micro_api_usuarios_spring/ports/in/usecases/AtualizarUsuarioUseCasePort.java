package com.erp.micro_api_usuarios_spring.ports.in.usecases;

import com.erp.micro_api_usuarios_spring.adapters.in.responses.AtualizarUsuarioResponse;
import com.erp.micro_api_usuarios_spring.domain.entities.Usuario;

public interface AtualizarUsuarioUseCasePort {
    Usuario execute(Long id, AtualizarUsuarioResponse usuario);
}