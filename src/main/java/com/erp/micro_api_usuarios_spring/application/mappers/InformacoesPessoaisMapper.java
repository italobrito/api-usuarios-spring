package com.erp.micro_api_usuarios_spring.application.mappers;

import com.erp.micro_api_usuarios_spring.adapters.in.responses.InformacoesPessoaisResponse;
import com.erp.micro_api_usuarios_spring.domain.entities.InformacoesPessoais;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InformacoesPessoaisMapper {
    InformacoesPessoais toEntity(InformacoesPessoaisResponse response);
}