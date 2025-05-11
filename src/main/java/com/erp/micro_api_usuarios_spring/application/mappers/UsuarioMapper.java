package com.erp.micro_api_usuarios_spring.application.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.erp.micro_api_usuarios_spring.adapters.in.responses.AtualizarUsuarioResponse;
import com.erp.micro_api_usuarios_spring.adapters.in.responses.CadastrarUsuarioResponse;
import com.erp.micro_api_usuarios_spring.domain.entities.Usuario;


@Mapper(componentModel = "spring")
public interface UsuarioMapper {
    @Mapping(target = "id", ignore = true)
    Usuario toEntity(CadastrarUsuarioResponse cadastrarUsuarioResponse);
    Usuario toEntity(AtualizarUsuarioResponse atualizarUsuarioResponse);
}
