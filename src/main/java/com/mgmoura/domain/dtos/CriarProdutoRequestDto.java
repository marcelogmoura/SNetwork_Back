package com.mgmoura.domain.dtos;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CriarProdutoRequestDto {
		
	@NotEmpty(message = "Informe o nome.")
	@Size(min = 3, max = 50, message = "O nome precisa ter de 3 a 50 caracteres")
	@Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "O nome deve conter apenas letras, números e espaços.")
	private String nome;
	
	@NotEmpty(message = "Informe a quantidade.")
	private Integer quantidade;	

}
