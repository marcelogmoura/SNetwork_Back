package com.mgmoura.domain.dtos;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CriarProdutoRequestDto {
		
	@NotEmpty(message = "Informe o nome.")
	@Size(min = 2, max = 50, message = "O nome precisa ter de 2 a 50 caracteres")
	@Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "O nome deve conter apenas letras, números e espaços.")
	private String nome;
	
	@NotNull(message = "Informe a quantidade.")
	@Min(value = 1, message = "A quantidade deve ser maior ou igual a 1.")
	private Integer quantidade;	
	
	@NotNull(message = "Informe o EAN.")
	@Min(value = 1, message = "O EAN deve ser maior ou igual a 1.")
	@Max(value = 99999, message = "O EAN deve ter no máximo 5 dígitos.")
	private Integer ean;
	
	@NotNull(message = "Informe a preço.")
	@Min(value = 1, message = "O preço deve ser maior ou igual a 1.") 
	private Double preco;

}
