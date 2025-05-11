package com.erp.micro_api_usuarios_spring.application.usecase;

import com.erp.micro_api_usuarios_spring.adapters.in.responses.CadastrarUsuarioResponse;
import com.erp.micro_api_usuarios_spring.application.mappers.UsuarioMapper;
import com.erp.micro_api_usuarios_spring.domain.entities.Usuario;
import com.erp.micro_api_usuarios_spring.ports.in.usecases.CadastrarUsuarioUseCasePort;
import com.erp.micro_api_usuarios_spring.ports.out.UsuarioRepositoryPort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastrarUsuarioUseCase implements CadastrarUsuarioUseCasePort {

    @Autowired
    private UsuarioRepositoryPort usuarioRepositoryPort;

    @Autowired
    private UsuarioMapper usuarioMapper;

    public Usuario execute(CadastrarUsuarioResponse cadastrarUsuarioResponse) {
        Usuario usuario = usuarioMapper.toEntity(cadastrarUsuarioResponse);
        return usuarioRepositoryPort.save(usuario);
    }
}