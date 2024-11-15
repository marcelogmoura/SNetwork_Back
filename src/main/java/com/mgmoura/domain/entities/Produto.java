package com.mgmoura.domain.entities;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Produto {
	
	@Id
	private UUID id;
	private String nome;
	private Integer quantidade;
	private Integer ean;
	private LocalDate dataCadastro;	

}
