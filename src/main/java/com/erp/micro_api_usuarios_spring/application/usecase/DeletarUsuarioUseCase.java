package com.erp.micro_api_usuarios_spring.application.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.micro_api_usuarios_spring.ports.in.usecases.DeletarUsuarioUseCasePort;
import com.erp.micro_api_usuarios_spring.ports.out.UsuarioRepositoryPort;

@Service
public class DeletarUsuarioUseCase implements DeletarUsuarioUseCasePort {

    @Autowired
    private UsuarioRepositoryPort usuarioRepositoryPort;

    public void execute(Long id) {
        usuarioRepositoryPort.deleteById(id);
    }
}