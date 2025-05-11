package com.erp.micro_api_usuarios_spring.application.mappers;

import com.erp.micro_api_usuarios_spring.adapters.in.responses.InformacoesProfissionaisResponse;
import com.erp.micro_api_usuarios_spring.domain.entities.InformacoesProfissionais;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InformacoesProfissionaisMapper {
    InformacoesProfissionais toEntity(InformacoesProfissionaisResponse response);
}