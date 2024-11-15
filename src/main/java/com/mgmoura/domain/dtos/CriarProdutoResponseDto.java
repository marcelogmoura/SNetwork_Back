package com.mgmoura.domain.dtos;

import java.time.LocalDate;
import java.util.UUID;

import lombok.Data;

@Data
public class CriarProdutoResponseDto {
	
	
	private UUID id;
	private String nome;
	private Integer quantidade;
	private LocalDate dataCadastro;

}
