package com.erp.micro_api_usuarios_spring.ports.in.usecases;

import com.erp.micro_api_usuarios_spring.domain.entities.Usuario;

public interface BuscarUsuarioPorIdUseCasePort {
    Usuario execute(Long id);
}