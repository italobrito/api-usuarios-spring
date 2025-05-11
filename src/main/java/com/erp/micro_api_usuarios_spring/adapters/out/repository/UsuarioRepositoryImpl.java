package com.erp.micro_api_usuarios_spring.adapters.out.repository;

import com.erp.micro_api_usuarios_spring.domain.entities.Usuario;
import com.erp.micro_api_usuarios_spring.ports.out.UsuarioRepositoryPort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UsuarioRepositoryImpl implements UsuarioRepositoryPort {

    @Autowired
    private UsuarioJpaRepository usuarioJpaRepository;

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioJpaRepository.save(usuario);
    }

    @Override
    public Optional<Usuario> findById(Long id) {
        return usuarioJpaRepository.findById(id);
    }

    @Override
    public List<Usuario> findAll() {
        return usuarioJpaRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        usuarioJpaRepository.deleteById(id);
    }

    @Override
    public Usuario update(Usuario usuario) {
        if (usuarioJpaRepository.existsById(usuario.getId())) {
            return usuarioJpaRepository.save(usuario);
        }
        throw new RuntimeException("Usuário não encontrado para atualização");
    }
}