package com.mgmoura.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mgmoura.domain.dtos.CriarProdutoRequestDto;
import com.mgmoura.domain.dtos.CriarProdutoResponseDto;
import com.mgmoura.domain.interfaces.ProdutoDomainService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/api/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoDomainService produtoDomainService;
	
	@PostMapping("criar")
	public ResponseEntity<CriarProdutoResponseDto> criar(@RequestBody @Valid CriarProdutoRequestDto dto) {
		
		CriarProdutoResponseDto response = produtoDomainService.criar(dto);
		
		return ResponseEntity.status(201).body(response);
	}

}



