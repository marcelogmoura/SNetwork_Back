package com.mgmoura.domain.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Data;

@Data
public class CriarProdutoResponseDto {
	
	
	private UUID id;
	private String nome;
	private Integer quantidade;
	private Integer ean;
	private LocalDateTime dataCadastro;

}
