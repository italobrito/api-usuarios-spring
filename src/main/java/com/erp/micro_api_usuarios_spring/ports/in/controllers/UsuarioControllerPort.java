package com.erp.micro_api_usuarios_spring.ports.in.controllers;

import com.erp.micro_api_usuarios_spring.adapters.in.responses.AtualizarUsuarioResponse;
import com.erp.micro_api_usuarios_spring.adapters.in.responses.CadastrarUsuarioResponse;
import com.erp.micro_api_usuarios_spring.domain.entities.Usuario;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UsuarioControllerPort {

    ResponseEntity<Usuario> cadastrar(CadastrarUsuarioResponse usuario);

    ResponseEntity<Usuario> atualizar(Long id, AtualizarUsuarioResponse usuario);

    ResponseEntity<Void> deletar(Long id);

    ResponseEntity<List<Usuario>> buscarTodos();

    ResponseEntity<Usuario> buscarPorId(Long id);
}