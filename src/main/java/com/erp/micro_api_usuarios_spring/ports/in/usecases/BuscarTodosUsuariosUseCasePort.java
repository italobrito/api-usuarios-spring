package com.erp.micro_api_usuarios_spring.ports.in.usecases;

import com.erp.micro_api_usuarios_spring.domain.entities.Usuario;
import java.util.List;

public interface BuscarTodosUsuariosUseCasePort {
    List<Usuario> execute();
}