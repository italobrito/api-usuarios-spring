package com.erp.micro_api_usuarios_spring.application.mappers;

import com.erp.micro_api_usuarios_spring.adapters.in.responses.EnderecoResponse;
import com.erp.micro_api_usuarios_spring.domain.entities.Endereco;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EnderecoMapper {
    Endereco toEntity(EnderecoResponse response);
}