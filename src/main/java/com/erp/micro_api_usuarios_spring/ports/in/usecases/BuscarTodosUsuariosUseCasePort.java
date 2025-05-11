package com.erp.micro_api_usuarios_spring.ports.in.usecases;

import com.erp.micro_api_usuarios_spring.adapters.in.responses.UsuarioReduzidoResponse;
import java.util.List;

public interface BuscarTodosUsuariosUseCasePort {
    List<UsuarioReduzidoResponse> execute();
}