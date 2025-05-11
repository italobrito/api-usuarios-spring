package com.erp.micro_api_usuarios_spring.adapters.out.repository;

import com.erp.micro_api_usuarios_spring.domain.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioJpaRepository extends JpaRepository<Usuario, Long> {
}