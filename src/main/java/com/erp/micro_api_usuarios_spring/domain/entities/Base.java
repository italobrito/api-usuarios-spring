package com.erp.micro_api_usuarios_spring.domain.entities;

import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
abstract class Base {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}

