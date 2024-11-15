package com.mgmoura.domain.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class CriarProdutoResponseDto {
	
	
	private UUID id;
	private String nome;
	private Integer quantidade;
	private Integer ean;
	private Double preco;
	
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm")
	private LocalDateTime dataCadastro;

}
