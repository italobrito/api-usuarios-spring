package com.erp.micro_api_usuarios_spring.application.usecase;

import com.erp.micro_api_usuarios_spring.domain.entities.Usuario;
import com.erp.micro_api_usuarios_spring.ports.in.usecases.BuscarTodosUsuariosUseCasePort;
import com.erp.micro_api_usuarios_spring.ports.out.UsuarioRepositoryPort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuscarTodosUsuariosUseCase implements BuscarTodosUsuariosUseCasePort{

    @Autowired
    private UsuarioRepositoryPort usuarioRepositoryPort;

    public List<Usuario> execute() {
        return usuarioRepositoryPort.findAll();
    }
}