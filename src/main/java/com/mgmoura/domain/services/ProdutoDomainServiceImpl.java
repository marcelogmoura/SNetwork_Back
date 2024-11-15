package com.mgmoura.domain.services;

import org.springframework.stereotype.Service;

import com.mgmoura.domain.dtos.CriarProdutoRequestDto;
import com.mgmoura.domain.dtos.CriarProdutoResponseDto;
import com.mgmoura.domain.interfaces.ProdutoDomainService;

@Service
public class ProdutoDomainServiceImpl implements ProdutoDomainService{

	@Override
	public CriarProdutoResponseDto criar(CriarProdutoRequestDto dto) {

		return null;
	}

}
