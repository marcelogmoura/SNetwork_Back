package com.mgmoura.domain.services;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgmoura.domain.dtos.AtualizarProdutoRequestDto;
import com.mgmoura.domain.dtos.CriarProdutoRequestDto;
import com.mgmoura.domain.dtos.CriarProdutoResponseDto;
import com.mgmoura.domain.entities.Produto;
import com.mgmoura.domain.exceptions.EanJaCadastradoException;
import com.mgmoura.domain.exceptions.ProdutoNaoEncontradoException;
import com.mgmoura.domain.interfaces.ProdutoDomainService;
import com.mgmoura.infrastructure.repositories.ProdutoRepository;

@Service
public class ProdutoDomainServiceImpl implements ProdutoDomainService{
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CriarProdutoResponseDto criar(CriarProdutoRequestDto dto) {

		if(produtoRepository.findByEAN(dto.getEan()) != null)
			throw new EanJaCadastradoException();
		
		Produto produto = new Produto();
		
		produto.setId(UUID.randomUUID());
		produto.setNome(dto.getNome());
		produto.setQuantidade(dto.getQuantidade());
		produto.setEan(dto.getEan());
		produto.setPreco(dto.getPreco());
		produto.setDataCadastro(LocalDateTime.now());
		
		produtoRepository.save(produto);
		
		CriarProdutoResponseDto response = modelMapper.map(produto, CriarProdutoResponseDto.class);
		response.setDataCadastro(LocalDateTime.now());
		
		return response;
	}

	@Override
	public CriarProdutoResponseDto editar(UUID id, AtualizarProdutoRequestDto dto) {
		
		Produto produtoExistente = produtoRepository.findById(id).orElseThrow(() -> new ProdutoNaoEncontradoException(id));

		return null;
	}




}
