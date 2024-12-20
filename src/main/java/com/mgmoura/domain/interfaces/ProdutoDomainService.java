package com.mgmoura.domain.interfaces;

import java.util.UUID;

import com.mgmoura.domain.dtos.CriarProdutoRequestDto;
import com.mgmoura.domain.dtos.CriarProdutoResponseDto;

public interface ProdutoDomainService {
	
	CriarProdutoResponseDto criar(CriarProdutoRequestDto dto);
		
	CriarProdutoResponseDto editar(UUID id, CriarProdutoRequestDto dto);
	
	void deletar(UUID id);
}
