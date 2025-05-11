package com.erp.micro_api_usuarios_spring.adapters.in.rest;

import com.erp.micro_api_usuarios_spring.adapters.in.responses.AtualizarUsuarioResponse;
import com.erp.micro_api_usuarios_spring.adapters.in.responses.CadastrarUsuarioResponse;
import com.erp.micro_api_usuarios_spring.domain.entities.Usuario;
import com.erp.micro_api_usuarios_spring.ports.in.controllers.UsuarioControllerPort;
import com.erp.micro_api_usuarios_spring.ports.in.usecases.AtualizarUsuarioUseCasePort;
import com.erp.micro_api_usuarios_spring.ports.in.usecases.BuscarTodosUsuariosUseCasePort;
import com.erp.micro_api_usuarios_spring.ports.in.usecases.BuscarUsuarioPorIdUseCasePort;
import com.erp.micro_api_usuarios_spring.ports.in.usecases.CadastrarUsuarioUseCasePort;
import com.erp.micro_api_usuarios_spring.ports.in.usecases.DeletarUsuarioUseCasePort;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController implements UsuarioControllerPort {

    @Autowired
    private CadastrarUsuarioUseCasePort cadastrarUsuarioPort;

    @Autowired
    private AtualizarUsuarioUseCasePort atualizarUsuarioPort;

    @Autowired
    private DeletarUsuarioUseCasePort deletarUsuarioPort;

    @Autowired
    private BuscarTodosUsuariosUseCasePort buscarTodosUsuariosPort;

    @Autowired
    private BuscarUsuarioPorIdUseCasePort buscarUsuarioPorIdPort;

    @PostMapping
    public ResponseEntity<Usuario> cadastrar(@Valid @RequestBody CadastrarUsuarioResponse usuario) {
        return ResponseEntity.ok(cadastrarUsuarioPort.execute(usuario));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> atualizar(@PathVariable Long id, @Valid @RequestBody AtualizarUsuarioResponse usuario) {
        return ResponseEntity.ok(atualizarUsuarioPort.execute(id, usuario));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        deletarUsuarioPort.execute(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> buscarTodos() {
        return ResponseEntity.ok(buscarTodosUsuariosPort.execute());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(buscarUsuarioPorIdPort.execute(id));
    }
}