package com.mgmoura.domain.interfaces;

import com.mgmoura.domain.dtos.CriarProdutoRequestDto;
import com.mgmoura.domain.dtos.CriarProdutoResponseDto;

public interface ProdutoDomainService {
	
	CriarProdutoResponseDto criar(CriarProdutoRequestDto dto);

}
