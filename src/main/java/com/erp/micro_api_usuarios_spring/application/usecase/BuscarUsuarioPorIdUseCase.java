package com.erp.micro_api_usuarios_spring.application.usecase;

import com.erp.micro_api_usuarios_spring.domain.entities.Usuario;
import com.erp.micro_api_usuarios_spring.ports.in.usecases.BuscarUsuarioPorIdUseCasePort;
import com.erp.micro_api_usuarios_spring.ports.out.UsuarioRepositoryPort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BuscarUsuarioPorIdUseCase implements BuscarUsuarioPorIdUseCasePort{

    @Autowired
    private UsuarioRepositoryPort usuarioRepositoryPort;

    public Usuario execute(Long id) {
        Optional<Usuario> usuario = usuarioRepositoryPort.findById(id);
        return usuario.orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }
}