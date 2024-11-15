package com.mgmoura.application.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mgmoura.domain.dtos.CriarProdutoRequestDto;
import com.mgmoura.domain.dtos.CriarProdutoResponseDto;
import com.mgmoura.domain.entities.Produto;
import com.mgmoura.domain.interfaces.ProdutoDomainService;
import com.mgmoura.infrastructure.repositories.ProdutoRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/api/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoDomainService produtoDomainService;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@PostMapping("criar")
	public ResponseEntity<CriarProdutoResponseDto> criar(@RequestBody @Valid CriarProdutoRequestDto dto) {
		
		CriarProdutoResponseDto response = produtoDomainService.criar(dto);
		
		return ResponseEntity.status(201).body(response);
	}
	
	@PutMapping
	public void put() {
		
	}

	@DeleteMapping
	public void delete() {
		
	}
	
	@GetMapping
	public List<Produto> get() {
		return produtoRepository.findAll();
	}
}



