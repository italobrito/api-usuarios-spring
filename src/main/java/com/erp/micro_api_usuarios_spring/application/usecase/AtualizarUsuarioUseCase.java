package com.erp.micro_api_usuarios_spring.application.usecase;

import com.erp.micro_api_usuarios_spring.adapters.in.responses.AtualizarUsuarioResponse;
import com.erp.micro_api_usuarios_spring.application.mappers.UsuarioMapper;
import com.erp.micro_api_usuarios_spring.domain.entities.Usuario;
import com.erp.micro_api_usuarios_spring.ports.in.usecases.AtualizarUsuarioUseCasePort;
import com.erp.micro_api_usuarios_spring.ports.out.UsuarioRepositoryPort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AtualizarUsuarioUseCase implements AtualizarUsuarioUseCasePort{

    @Autowired
    private UsuarioRepositoryPort usuarioRepositoryPort;

    @Autowired
    private UsuarioMapper usuarioMapper;

    public Usuario execute(Long id, AtualizarUsuarioResponse atualizarUsuarioResponse) {
        Optional<Usuario> usuarioExistente = usuarioRepositoryPort.findById(id);
        if (usuarioExistente.isPresent()) {
            Usuario usuario = usuarioMapper.toEntity(atualizarUsuarioResponse);
            return usuarioRepositoryPort.update(usuario);
        }
        throw new RuntimeException("Usuário não encontrado");
    }
}