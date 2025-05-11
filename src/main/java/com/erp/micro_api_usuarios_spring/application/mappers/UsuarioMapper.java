package com.erp.micro_api_usuarios_spring.application.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.IterableMapping;
import org.mapstruct.Named;

import com.erp.micro_api_usuarios_spring.adapters.in.responses.AtualizarUsuarioResponse;
import com.erp.micro_api_usuarios_spring.adapters.in.responses.CadastrarUsuarioResponse;
import com.erp.micro_api_usuarios_spring.adapters.in.responses.UsuarioReduzidoResponse;
import com.erp.micro_api_usuarios_spring.domain.entities.Usuario;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
    @Mapping(target = "id", ignore = true)
    Usuario toEntity(CadastrarUsuarioResponse cadastrarUsuarioResponse);
    Usuario toEntity(AtualizarUsuarioResponse atualizarUsuarioResponse);

    @Named("toUsuarioReduzidoResponse")
    @Mapping(target = "nome", source = "informacoesPessoais.nomeCompleto")
    @Mapping(target = "email", source = "informacoesPessoais.email")
    @Mapping(target = "tipoUsuario", source = "informacoesProfissionais.tipoUsuario")
    @Mapping(target = "status", source = "informacoesProfissionais.status")
    UsuarioReduzidoResponse toUsuarioReduzidoResponse(Usuario usuario);

    @IterableMapping(qualifiedByName = "toUsuarioReduzidoResponse")
    List<UsuarioReduzidoResponse> toUsuarioReduzidoResponseList(List<Usuario> usuarios);
}
