package com.erp.micro_api_usuarios_spring.ports.out;

import com.erp.micro_api_usuarios_spring.domain.entities.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepositoryPort {

    Usuario save(Usuario usuario);

    Usuario update(Usuario usuario);

    Optional<Usuario> findById(Long id);

    List<Usuario> findAll();

    void deleteById(Long id);
}