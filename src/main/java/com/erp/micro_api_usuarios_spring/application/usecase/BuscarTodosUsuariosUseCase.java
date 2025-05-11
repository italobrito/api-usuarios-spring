package com.erp.micro_api_usuarios_spring.application.usecase;

import com.erp.micro_api_usuarios_spring.domain.entities.Usuario;
import com.erp.micro_api_usuarios_spring.ports.in.usecases.BuscarTodosUsuariosUseCasePort;
import com.erp.micro_api_usuarios_spring.ports.out.UsuarioRepositoryPort;
import com.erp.micro_api_usuarios_spring.adapters.in.responses.UsuarioReduzidoResponse;
import com.erp.micro_api_usuarios_spring.application.mappers.UsuarioMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuscarTodosUsuariosUseCase implements BuscarTodosUsuariosUseCasePort {

    @Autowired
    private UsuarioRepositoryPort usuarioRepositoryPort;

    @Autowired
    private UsuarioMapper usuarioMapper;

    public List<UsuarioReduzidoResponse> execute() {
        List<Usuario> usuarios = usuarioRepositoryPort.findAll();
        return usuarioMapper.toUsuarioReduzidoResponseList(usuarios);
    }
}